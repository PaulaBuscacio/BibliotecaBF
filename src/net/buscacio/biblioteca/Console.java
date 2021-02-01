package net.buscacio.biblioteca;

import net.buscacio.biblioteca.model.Biblioteca;
import net.buscacio.biblioteca.model.Categoria;
import net.buscacio.biblioteca.model.Livro;
import net.buscacio.biblioteca.model.Usuario;

import java.util.*;


public class Console {

    Scanner opcaoMenu = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();
    Categoria categoria = new Categoria();
    Usuario usuario = new Usuario();



    public int mostrarMenu() throws Exception {


        System.out.println("\nDigite uma opção do menu");
        System.out.println("1. visualizar usuários \n2. visualizar acervo \n3. visualizar categorias" +
                           " \n4. emprestar livro \n5. devolver livro \n6. cadastrar usuário " +
                           "\n7.cadastrar livro  \n8. cadastrar categoria \n9. remover usuário " +
                           "\n10. remover livro \n11. remover categoria \n0. Sair");

            return opcaoMenu.nextInt();

    }



    public Usuario criarUsuario() {

        Usuario novoUsuario = new Usuario();

        System.out.println("\nDigite o nome do usuário: ");
        novoUsuario.setNome(opcaoMenu.next());
        System.out.println("\nDigite o email do usuário: ");
        novoUsuario.setEmail(opcaoMenu.next());
        System.out.println("\nDigite o telefone do usuário: ");
        novoUsuario.setTelefone(opcaoMenu.nextInt());

        return novoUsuario;
    }

    public void mostrarUsuarios(List<Usuario> usuarios) {
        usuarios.forEach(System.out::println);
    }

    public int deletarUsuario() {
        System.out.println("\nDigite o id do usuário: ");
        int idUsuario = opcaoMenu.nextInt();
        biblioteca.removerUsuario(idUsuario);
        return idUsuario;
    }

    public Livro criarLivro() {

        Livro novoLivro = new Livro();

        System.out.println("\nDigite o título do livro: ");
        novoLivro.setTitulo(opcaoMenu.next());
        System.out.println("\nDigite o autor do livro: ");
        novoLivro.setAutor(opcaoMenu.next());
        System.out.println("\nDigite a categoria do livro: ");
        novoLivro.setIdCategoria(opcaoMenu.nextInt());
        return  novoLivro;
    }

    public void mostrarAcervo(List<Livro> acervo) {

        acervo.forEach(System.out::println);
    }

    public int deletarLivro() {
        System.out.println("Digite o código do livro: ");
        int codigo = opcaoMenu.nextInt();
        biblioteca.removerLivro(codigo);
        return codigo;
    }

    public Categoria criarCategoria() {

        Categoria novaCategoria = new Categoria();

        System.out.println("\nDigite o nome da categoria: ");
        novaCategoria.setNome(opcaoMenu.next());

        return  novaCategoria;
    }

    public void mostrarCategorias(List<Categoria> categorias) {

        categorias.forEach(System.out::println);
    }

    public int deletarCategoria() {
        System.out.println("\nDigite o id da categoria a ser removida:");
        int idCategoria = opcaoMenu.nextInt();
        biblioteca.removerCategoria(idCategoria);
        return idCategoria;

    }

    public void emprestarLivro() throws Exception {
        System.out.println("\nDigite o id do usuário: ");
        int idUsuario = opcaoMenu.nextInt();
        System.out.println("\nDigite o código do livro a ser emprestado: ");
        int codigoLivro = opcaoMenu.nextInt();
        biblioteca.emprestarLivro(codigoLivro, idUsuario);

    }

    public void devolverLivro() throws Exception {
        System.out.println("\nDigite o id do usuário: ");
        int idUsuario = opcaoMenu.nextInt();
        System.out.println("\nDigite o código do livro a ser devolvido: ");
        int codigo = opcaoMenu.nextInt();
       // usuario.getLivrosEmprestados().add(codigo);
        biblioteca.devolverLivro(codigo, idUsuario);

    }




}
