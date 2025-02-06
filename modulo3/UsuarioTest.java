package com.mycompany.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UsuarioTest {
    
    @Test
    public void testGetIdade(){
        Usuario usuario = new Usuario("Juliana", 22);
        assertEquals(22, usuario.getIdade());
    }

    @Test
    public void testSetIdade(){
        Usuario usuario = new Usuario("Juliana", 22);
        usuario.setIdade(23);
        assertEquals(23, usuario.getIdade());
    }
    
    @Test
    public void testGetEmprestimos(){
        Usuario usuario = new Usuario("Juliana", 22);
        assertTrue(usuario.getEmprestimos().isEmpty());
    }

    @Test
    public void testSetEmprestimos(){
        Usuario usuario = new Usuario("Juliana", 22);
        
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Emprestimo emprestimo = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(7), livro, usuario);
        
        List<Emprestimo> emprestimos = new ArrayList<>();
        emprestimos.add(emprestimo);
        
        usuario.setEmprestimos(emprestimos);
        
        assertEquals(1, usuario.getEmprestimos().size());
        assertEquals(emprestimo, usuario.getEmprestimos().get(0));
    }

}
