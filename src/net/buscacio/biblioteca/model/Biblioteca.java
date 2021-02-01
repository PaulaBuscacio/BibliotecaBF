package net.buscacio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static final int LIVRO_DISPONIVEL = 1;
    public static final int LIVRO_INDISPONIVEL = 2;
    public static final int LIVRO_INEXISTENTE = -1;

    private List<Usuario> usuarios;
    private List<Livro> acervo;
    private List<Categoria> categorias;

    public  Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.acervo = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(List<Livro> acervo) {
        this.acervo = acervo;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }


    public void addUsuario(Usuario usuario) {
        if(usuario != null) {
            this.usuarios.add(usuario);
        }

    }

    public void removerUsuario(int idUsuario) {
        boolean foiRemovido = false;
        List<Usuario> usuarios = this.usuarios;
        for (int i=0; i < usuarios.size(); i++) {
           Usuario usuario = usuarios.get(i);
            if(usuario.getId() == idUsuario) {
                this.usuarios.remove(usuario);
                foiRemovido = true;
            }

        }
        if(!foiRemovido) {
            System.out.println("Usuário com id " + idUsuario + " não encontrado.");
        }

    }

    public void addLivro(Livro livro) {
        int idCategoria = 1;
        if(acervo != null) {
            acervo.add(livro);
            for (Categoria categoria : this.getCategorias()) {

                if(categoria.getId() == idCategoria) {
                    livro.setCategoria(categoria);
                }
            }
        }
    }

    public int removerLivro(int codigoLivro) {

        for (Livro livro : this.getAcervo()) {

            if(livro.getCodigo() == codigoLivro) {
                if(!livro.isDisponivel()) {
                    return LIVRO_INDISPONIVEL;
                }
                if(livro.isDisponivel()) {

                    this.acervo.remove(livro);
                }
                return LIVRO_DISPONIVEL;
            }
        }
            return  LIVRO_INEXISTENTE;
    }


    public void addCategoria(Categoria categoria) {
        if (categoria != null) {
            this.categorias.add(categoria);
        }
    }

    public boolean removerCategoria(int idCategoria) {

        for (Categoria categoria : this.getCategorias()) {

           if(categoria.getId() == idCategoria) {
                this.categorias.remove(categoria);
                return true;
           }

        }
        return false;

    }

    public void emprestarLivro(int codigoLivro, int idUsuario) throws Exception {
        //verificar se livro existe
        Livro livroEmprestar = this.findLivro(codigoLivro);
        Usuario usuario = this.findUsuario(idUsuario);
//
//        if(livroEmprestar != null) {
//            if(usuario != null) {
                usuario.getLivrosEmprestados().add(livroEmprestar);
//            }
//
//        }
        if(livroEmprestar.isDisponivel()) {
            livroEmprestar.setDisponivel(false);

        }

    }

    public void devolverLivro(int codigoLivro, int idUsuario) throws Exception {
        Livro livroDevolver = this.findLivro(codigoLivro);
        Usuario usuario = this.findUsuario(idUsuario);

        if(!livroDevolver.isDisponivel()) {
            usuario.getLivrosEmprestados().remove(livroDevolver);
            livroDevolver.setDisponivel(true);
        }
    }


    private  Livro findLivro(int codigo) throws Exception {
        for (Livro livro : this.getAcervo()) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }
        throw new Exception("Livro não existe.");
    }

    private Usuario findUsuario( int idUsuario) throws  Exception{

        for (Usuario usuario : this.getUsuarios()) {
            if (usuario.getId() == idUsuario) {
                return usuario;
            }
        }
        throw new Exception("Usuário inexistente");
    }

    private int livroDisponivel(int codigo) throws Exception {
        Livro livro = this.findLivro(codigo);
        return livro.isDisponivel() ? LIVRO_DISPONIVEL : LIVRO_INDISPONIVEL;

    }
}
