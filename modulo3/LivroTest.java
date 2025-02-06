package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LivroTest {

    private Autor autor;
    private Livro livro1;
    private Livro livro2;

    @Before
    public void setUp() {
        autor = new Autor("Jess", "Brasileira");
        livro1 = new Livro("Java Básico", autor, "tecnologia", true);
        livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
    }

    @Test
    public void testGetTitulo(){
        assertEquals("Java Básico", livro1.getTitulo());
        assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    public void testSetTitulo(){
        livro1.setTitulo("Mudado");
        assertEquals("Mudado", livro1.getTitulo());
    }

    @Test
    public void testGetAutor(){
        assertEquals(autor, livro1.getAutor());
        assertEquals(autor, livro2.getAutor());
    }

    @Test
    public void testSetAutor(){
        Autor autor2 = new Autor("Ninguém", "Austriaco");

        livro1.setAutor(autor2);

        assertEquals(autor2, livro1.getAutor());
    }

    @Test
    public void testGetGenero(){
        assertEquals("tecnologia", livro1.getGenero());
        assertEquals("tecnologia", livro2.getGenero());
    }

    @Test
    public void testSetGenero(){
        livro1.setGenero("Ficção");

        assertEquals("Ficção", livro1.getGenero());
    }

    @Test
    public void testGetDisponivel(){
        assertEquals(true, livro1.isDisponivel());
        assertEquals(false, livro2.isDisponivel());
    }

    @Test
    public void testSetDisponivel(){
        livro2.setDisponivel(true);
        assertEquals(true, livro2.isDisponivel());

    }

}
