package net.buscacio.biblioteca;

import net.buscacio.biblioteca.model.Biblioteca;
import net.buscacio.biblioteca.model.Categoria;
import net.buscacio.biblioteca.model.Livro;
import net.buscacio.biblioteca.model.Usuario;


/**
 * Sistema de gerenciamento de biblioteca com interacao com o console
 * @author Paula Buscacio
 */

public class Main {

    public static void main(String[] args) throws Exception {

        final int VISUALIZAR_USUARIOS = 1;
        final int VISUALIZAR_ACERVO = 2;
        final int VISUALIZAR_CATEGORIA = 3;
        final int VERIFICAR_USUARIO = 4;
        final int VERIFICAR_LIVRO = 5;
        final int EMPRESTAR_LIVRO = 6;
        final int DEVOLVER_LIVRO = 7;
        final int CADASTRAR_USUARIOS = 8;
        final int CADASTRAR_LIVROS = 9;
        final int CADASTRAR_CATEGORIA = 10;
        final int REMOVER_USUARIO = 11;
        final int REMOVER_LIVRO = 12;
        final int REMOVER_CATEGORIA = 13;
        final int SAIR = 0;

        Console console = new Console();
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario();
        Livro livro = new Livro();
        Categoria categoria = new Categoria();

        int opcaoMenu = 0;

        Categoria categoria1 = new Categoria("suspense");
        Categoria categoria2 = new Categoria("ficção");
        Categoria categoria3 = new Categoria("T.I");
        Categoria categoria4 = new Categoria("novela");
        biblioteca.addCategoria(categoria1);
        biblioteca.addCategoria(categoria2);
        biblioteca.addCategoria(categoria3);
        biblioteca.addCategoria(categoria4);

        //acervo pré cadastrado
        Livro livro1 = new Livro( "Java. The complete reference eleventh edition", "Schildt, Herbert");
        //livro instanciado com outra opcao de contrutor
        Livro livro2 = new Livro( "Cão como nós", "Alegre, Manoel", categoria4, true);
        livro1.setCategoria(categoria3);
        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        //usuários pré cadastrados como exemplo
        Usuario usuario1 = new Usuario("Paula", "email@teste.com", 22229222);
        Usuario usuario2 = new Usuario("João", "joao@teste.com", 353535353);
        biblioteca.addUsuario(usuario1);
        biblioteca.addUsuario(usuario2);

        System.out.println("\nSistema de gerenciamento de biblioteca");

        try {
            do {
                opcaoMenu = console.mostrarMenu();

                switch (opcaoMenu) {
                    case VISUALIZAR_USUARIOS:
                        console.mostrarUsuarios(biblioteca.getUsuarios());
                        break;

                    case VISUALIZAR_ACERVO:
                        console.mostrarAcervo(biblioteca.getAcervo());
                        break;

                    case VISUALIZAR_CATEGORIA:
                        System.out.println("Categorias\n");
                        console.mostrarCategorias(biblioteca.getCategorias());
                        break;

                    case VERIFICAR_USUARIO:
                        usuario = biblioteca.findUsuario(console.verificarUsuario());
                        System.out.println(usuario);
                        break;

                    case VERIFICAR_LIVRO:
                        livro = biblioteca.findLivro(console.verficarLivro());
                        System.out.println(livro);
                        break;

                    case EMPRESTAR_LIVRO:
                        biblioteca.emprestarLivro(console.verficarLivro(), console.verificarUsuario());
                        System.out.println("Livro emprestado com sucesso!!!");
                        break;

                    case DEVOLVER_LIVRO:
                        biblioteca.devolverLivro(console.verficarLivro(), console.verificarUsuario());
                        System.out.println("Livro devolvido com sucesso!!!");

                        break;

                    case CADASTRAR_USUARIOS:
                        System.out.println("Cadastrando usuário");
                        Usuario novoUsuario = console.criarUsuario();
                        biblioteca.addUsuario(novoUsuario);
                        System.out.println("Usuário cadastrado com sucesso!!!");
                        break;

                    case CADASTRAR_LIVROS:
                        System.out.println("Cadastrando livro");
                        Livro novoLivro = console.criarLivro();
                        biblioteca.addLivro(novoLivro);
                        System.out.println("Livro cadastrado com sucesso!!!");
                        break;

                    case CADASTRAR_CATEGORIA:
                        System.out.println("Cadastrando categoria");
                        categoria = console.criarCategoria();
                        biblioteca.addCategoria(categoria);
                        System.out.println("Categoria cadastrada com sucesso!!!");
                        break;


                    case REMOVER_USUARIO:
                        int usuarioId = console.deletarUsuario();
                        biblioteca.removerUsuario(usuarioId);
                        System.out.println("Usuário removido com sucesso!!!");
                        break;

                    case REMOVER_LIVRO:
                         int codigoLivro = console.deletarLivro();
                        biblioteca.removerLivro(codigoLivro);
                        System.out.println("Livro removido com sucesso!!!");
                        break;

                    case REMOVER_CATEGORIA:
                        int idCategoria = console.deletarCategoria();
                        biblioteca.removerCategoria(idCategoria);
                        System.out.println("Categoria removida com sucesso!!!");
                        break;

                    //previne que um número inválido seja digitado e que o programa se encerre
                    default:
                        if (opcaoMenu != SAIR) {
                            System.out.println("Opção inválida!!!");
                        }
                }
            } while (opcaoMenu != SAIR);


            System.out.println("Sistema encerrado");
        } catch (Exception e ) {
            System.out.println("Opção inválida!!!");
         }


    }
}
