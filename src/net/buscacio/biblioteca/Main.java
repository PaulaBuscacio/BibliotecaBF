package net.buscacio.biblioteca;

import net.buscacio.biblioteca.model.Biblioteca;
import net.buscacio.biblioteca.model.Livro;
import net.buscacio.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * sistema gerenciamento biblioteca
 * <p>
 * Features:
 * 1. cadastro de livros
 * -codigo, titulo, autor, edicao, categoria, disponivel
 * 2. visualizacao de livros
 * -todos, por categoria, por autor
 * 3. remocao livros
 * 4. cadastro categorias
 * -codigo, nome
 * 5. visualizacao categorias
 * 6. remover categoria
 * 7. cadastro clientes
 * -id, nome, email, telefone, cpf
 * 8. visualizacao clientes
 * 9. remocao lientes
 * 10. emprestar livro
 * 11. devolver livro
 * <p>
 * - abstrair um "lugar" onde guardar os livros e clientes
 * - abstrair um "console" onde interagir com o sistema
 */

public class Main {

    public static void main(String[] args) throws Exception {

        final int VISUALIZAR_USUARIOS = 1;
        final int VISUALIZAR_ACERVO = 2;
        final int CADASTRAR_USUARIOS = 3;
        final int CADASTRAR_LIVROS = 4;

        Console console = new Console();
        Biblioteca biblioteca = new Biblioteca();

        //acervo pré cadastrado
        Livro livro1 = new Livro( "Java. The complete reference eleventh edition", "Schildt, Herbert", "t.i.");
        Livro livro2 = new Livro( "Cão como nós", "Alegre, Manoel", "novela");
        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        biblioteca.setAcervo(biblioteca.getAcervo());
        //usuários pré cadastrados como exemplo
        Usuario usuario1 = new Usuario("Paula", "email@teste.com", 22229222);
        Usuario usuario2 = new Usuario("João", "joao@teste.com", 353535353);
        biblioteca.addUsuario(usuario1);
        biblioteca.addUsuario(usuario2);

        System.out.println("\nSistema de gerenciamento de biblioteca");


        int opcaoMenu = 0;


        do {
            opcaoMenu = console.mostrarMenu();


            switch (opcaoMenu) {
                case VISUALIZAR_USUARIOS:
                    console.mostrarUsuarios(biblioteca.getUsuarios());
                    break;

                case VISUALIZAR_ACERVO:
                    console.mostrarAcervo(biblioteca.getAcervo());
                    break;
                case CADASTRAR_USUARIOS:
                    System.out.println("Cadastrando usuário");
                    Usuario novoUsuario = console.criarUsuario();
                    System.out.println(novoUsuario);
                    biblioteca.addUsuario(novoUsuario);

                    break;

                case CADASTRAR_LIVROS:
                    System.out.println("Cadastrando livro");
                    Livro novoLivro = console.criarLivro();
                    System.out.println(novoLivro);
                    biblioteca.addLivro(novoLivro);

                    break;
                //previne que um número inválido seja digitado
                default:
                    if(opcaoMenu != 0) {
                        System.out.println("Opção inválida!!!");
                    }
            }
        } while (opcaoMenu != 0);


        System.out.println("Sistema encerrado");


    }
}
