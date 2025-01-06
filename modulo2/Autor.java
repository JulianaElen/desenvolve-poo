import java.util.List;

class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<Livro> getObrasPublicadas() {
        return null;
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        return null;
    }
}
