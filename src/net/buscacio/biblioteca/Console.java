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
                           "\n4. verificar usuario \n5. verificar livro \n6. emprestar livro " +
                           "\n7. devolver livro \n8. cadastrar usuário " +
                           "\n9. cadastrar livro  \n10. cadastrar categoria \n11. remover usuário " +
                           "\n12. remover livro \n13. remover categoria \n0. Sair");

            return opcaoMenu.nextInt();

    }


    public Usuario criarUsuario() {

        Usuario novoUsuario = new Usuario();

        System.out.println("\nDigite o nome do usuário: ");
        novoUsuario.setNome(opcaoMenu.next());
        System.out.println("\nDigite o email do usuário: ");
        novoUsuario.setEmail(opcaoMenu.next());
        System.out.println("\nDigite o telefone do usuário (somente números): ");
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

    public int verificarUsuario() {
        System.out.println("\nDigite o id do usuário: ");
        int  idUsuario = opcaoMenu.nextInt();
        return idUsuario;
    }

    public int verficarLivro() {
        System.out.println("\nDigite o código do livro:");
        int codigoLivro = opcaoMenu.nextInt();
        return codigoLivro;
    }
}
