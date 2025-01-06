import java.util.List;

class Pessoa {
    protected String nome;
    protected List<Livro> livros;
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros(){
        return this.livros;
    }

    public void setLivros(List<Livro> livros){
        this.livros = livros;
    }
}