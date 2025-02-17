package com.mycompany.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Autor extends Pessoa {
    private String nacionalidade;
    private List<Livro> obrasPublicadas;
    private boolean isAutor; 

    public Autor(String nome, String nacionalidade, boolean isAutor) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.isAutor = isAutor;
        this.obrasPublicadas = new ArrayList<>();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean isAutor() {
        return isAutor;
    }

    public void setAutor(boolean isAutor) {
        this.isAutor = isAutor;
    }

    public List<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            obrasPublicadas.add(livro);
        }
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        if (genero == null) return List.of();

        return obrasPublicadas.stream()
                .filter(livro -> Objects.equals(livro.getGenero(), genero))
                .toList();
    }
}
