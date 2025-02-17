package com.mycompany.app;

import com.mycompany.app.model.Autor;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AutorTipoTeste {

    @Test
    public void testIsAutor() {
        Autor autorTradicional = new Autor("Daniel Keyes", "Americano", true);
        Autor autorUsuario = new Autor("Fulano", "Brasileiro", false);

        assertEquals(true, autorTradicional.isAutor());
        assertEquals(false, autorUsuario.isAutor());
    }

    @Test
    public void testSetIsAutor() {
        Autor autor = new Autor("Autor Teste", "Desconhecida", false);
        autor.setAutor(true);
        assertEquals(true, autor.isAutor());
    }
}
