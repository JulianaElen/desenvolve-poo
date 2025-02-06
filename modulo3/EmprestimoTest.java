package com.mycompany.app;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmprestimoTest {
    
    @Test
    public void testGetDataRetirada(){
        Date dataRetirada = new Date();
        LocalDate dataRetiradaLocalDate = dataRetirada.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        Emprestimo emprestimo = new Emprestimo(dataRetiradaLocalDate, LocalDate.now().plusDays(7), null, null);

        assertEquals(dataRetiradaLocalDate, emprestimo.getDataRetirada());
    }
       
    @Test
    public void testSetDataRetirada(){
        Date dataRetirada = new Date();
        LocalDate dataRetiradaLocalDate = dataRetirada.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        Emprestimo emprestimo = new Emprestimo(null, null, null, null);
        emprestimo.setDataRetirada(dataRetiradaLocalDate);

        assertEquals(dataRetiradaLocalDate, emprestimo.getDataRetirada());
    }

    @Test
    public void testGetDataDevolucao(){
        Date dataDevolucao = new Date();
        LocalDate dataDevolucaoLocalDate = dataDevolucao.toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDate();

        Emprestimo emprestimo = new Emprestimo(null, dataDevolucaoLocalDate, null, null);

        assertEquals(dataDevolucaoLocalDate, emprestimo.getDataDevolucao());
    }

    @Test
    public void testSetDataDevolucao(){
        Date dataDevolucao = new Date();
        LocalDate dataDevolucaoLocalDate = dataDevolucao.toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDate();

        Emprestimo emprestimo = new Emprestimo(null, null, null, null);
        emprestimo.setDataDevolucao(dataDevolucaoLocalDate);

        assertEquals(dataDevolucaoLocalDate, emprestimo.getDataDevolucao());
    }

    @Test
    public void testGetLivro(){
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", 
        "Inglês"), "Tecnologia", true);

        Emprestimo emprestimo = new Emprestimo(null, null, livro, null);
         assertEquals(livro, emprestimo.getLivro());
    }

    @Test
    public void testSetLivro(){
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", 
        "Inglês"), "Tecnologia", true);
        Livro livro1 = new Livro("Basics Java", new Autor(" Alan T.", 
        "Inglês"), "Tecnologia", true);

        Emprestimo emprestimo = new Emprestimo(null, null, livro, null);
        emprestimo.setLivro(livro1);

        assertEquals(livro1, emprestimo.getLivro());
    }

    @Test
    public void testGetUsuario(){
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(null, null, null, usuario);

        assertEquals(usuario, emprestimo.getUsuario());
    }

    @Test
    public void testSetUsuario(){
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(null, null, null, null);
        emprestimo.setUsuario(usuario);

        assertEquals(usuario, emprestimo.getUsuario());
    }
}
