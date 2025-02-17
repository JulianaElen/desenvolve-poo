package com.mycompany.app;

import com.mycompany.app.model.Artigo;
import com.mycompany.app.model.Autor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ArtigoTest {

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Jess", "Inglesa", true);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        assertEquals("tecnologia", artigo.getGenero());
    }
    
    @Test
    public void testIsPublicado() {
        Autor autor = new Autor("Jess", "Inglesa", true);

        Artigo artigoNaoPublicado = new Artigo("Entendendo Compiladores", autor, "tecnologia", false);
        Artigo artigoPublicado = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertFalse(artigoNaoPublicado.isPublicado());
        assertTrue(artigoPublicado.isPublicado());
    }

    @Test
    public void testValidarPublicacao() {
        Autor autor = new Autor("Jess", "Inglesa", true);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        artigo.validarPublicação();  
    }

}
