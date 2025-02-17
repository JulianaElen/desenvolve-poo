package com.mycompany.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.mycompany.app.model.Artigo;
import com.mycompany.app.model.Autor;
import com.mycompany.app.model.Emprestimo;
import com.mycompany.app.model.Livro;
import com.mycompany.app.model.Usuario;

public class Main {

    public static void main(String[] args) {

        // Criando um Autores
        Autor autorTradicional = new Autor("Jess", "Inglesa", true);
        Autor autor = new Autor("Juliana", "juliana@email.com", false);

        // Criando um Livro
        Livro livro = new Livro("Java for Beginners", autorTradicional, "tecnologia", true);
        livro.validarDisponibilidade();
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        // Criando um Usuário
        Usuario usuario = new Usuario("Jess", 21);

        // Criando um Empréstimo com o construtor correto
        Emprestimo emprestimo = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(7), livro, usuario);

        // Formatando datas para exibição
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Exibindo informações
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada().format(formatter));
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao().format(formatter));
    }
}
