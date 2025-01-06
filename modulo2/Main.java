import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Brasileira");
        autor.setNome("Jessica Felix");

        Livro livro = new Livro();
        livro.setTitulo("Java for Beginners");
        livro.setGenero("Tecnologia");
        livro.setDisponivel(false);
        livro.setAutor(autor);

        Usuario usuario = new Usuario();
        usuario.setNome("Lucas Rafael");
        usuario.setIdade(25);
        usuario.setLivros(new ArrayList<>());

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);

        long currentTimeMillis = System.currentTimeMillis();
        Date dataAtual = new Date(currentTimeMillis);
        emprestimo.setDataRetirada(dataAtual);
        emprestimo.setDataDevolucao(dataAtual);

        usuario.setEmprestimos(new ArrayList<>());
        usuario.getEmprestimos().add(emprestimo);

        System.out.println("O livro não está disponível");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println();
        System.out.println("Autor: " + autor.getNome());
        System.out.println();
        System.out.println("Genero: " + livro.getGenero());
        System.out.println();
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println();
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println();
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println();
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
