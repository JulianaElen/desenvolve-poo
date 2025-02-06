package com.mycompany.app;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AutorTest {

    @Test 
    public void testGetNacionalidade(){
        Autor autor = new Autor("Daniel Keyes", "Desconhecida");
        assertEquals("Desconhecida", autor.getNacionalidade());
    }

    @Test 
    public void testSetNacionalidade(){
        Autor autor = new Autor("Daniel Keyes", "Desconhecida");
        autor.setNacionalidade("EUA");
        assertEquals("EUA", autor.getNacionalidade());
    }
    
    @Test 
    public void testGetObrasPublicadas(){
        Autor autor = new Autor("Daniel Keyes", "Americano");
        
        Livro livro1 = new Livro("Flores para Algernon", autor, "Ficção", true);
        Livro livro2 = new Livro("A Mente de Billy Milligan", autor, "Psicologia", true);

        autor.getObrasPublicadas().addAll(Arrays.asList(livro1, livro2));

        List<Livro> obras = autor.getObrasPublicadas();
        assertEquals(2, obras.size());
        assertEquals(livro1, obras.get(0));
        assertEquals(livro2, obras.get(1));
    }

    @Test 
    public void testGetObrasPublicadasPorGenero(){
        Autor autor = new Autor("Fulano", "Brasileiro");

        Livro livro1 = new Livro("Flores para Algernon", autor, "Ficção", true);
        Livro livro2 = new Livro("A Mente de Billy Milligan", autor, "Psicologia", true);

        autor.getObrasPublicadas().addAll(Arrays.asList(livro1, livro2));

        List<Livro> obrasGenero = autor.getObrasPublicadasPorGenero("Psicologia");
        assertEquals(livro2, obrasGenero.get(0));
    }
}
