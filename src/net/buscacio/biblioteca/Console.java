package net.buscacio.biblioteca;

import net.buscacio.biblioteca.model.Livro;
import net.buscacio.biblioteca.model.Usuario;

import java.util.*;

import static java.lang.Double.isNaN;

public class Console {

    public int mostrarMenu() throws Exception {

//        Integer[] opcoes = new Integer[] {0,1,2};
//        List<Integer> list = Arrays.asList(opcoes);

        Scanner opcaoMenu = new Scanner(System.in);
        System.out.println("\nDigite uma opção do menu");
        System.out.println("1. visualizar usuários \n2. visualizar acervo \n3. cadastrar usuário" +
                           " \n4. cadastrar livro \n0. Sair");




       // if( (opcaoMenu.nextInt() != 0) | (opcaoMenu.nextInt() != 1) || (opcaoMenu.nextInt() != 2)) {

      //  if(!list.contains(opcaoMenu.nextInt())) {
        //    throw new Exception("Opção inválida!!!");

      //  }

            return opcaoMenu.nextInt();

    }



    public Usuario criarUsuario() {

        Usuario novoUsuario = new Usuario();

        Scanner opcaoCadastrar = new Scanner(System.in);
        System.out.println("\nDigite o nome do usuário: ");
        novoUsuario.setNome(opcaoCadastrar.next());
        System.out.println("\nDigite o email do usuário: ");
        novoUsuario.setEmail(opcaoCadastrar.next());
        System.out.println("\nDigite o telefone do usuário: ");
        novoUsuario.setTelefone(opcaoCadastrar.nextInt());

        return novoUsuario;

    }

    public void mostrarUsuarios(List<Usuario> usuarios) {
        usuarios.forEach(System.out::println);

    }

    public Livro criarLivro() {

        Livro novoLivro = new Livro();

        Scanner opcaoCadastrar = new Scanner(System.in);
        System.out.println("\nDigite o título do livro: ");
        novoLivro.setTitulo(opcaoCadastrar.next());
        System.out.println("\nDigite o autor do livro: ");
        novoLivro.setAutor(opcaoCadastrar.next());
        System.out.println("\nDigite a categoria do livro: ");
        novoLivro.setCategoria(opcaoCadastrar.next());

        return  novoLivro;

    }

    public void mostrarAcervo(List<Livro> acervo) {
        acervo.forEach(System.out::println);
    }


}
