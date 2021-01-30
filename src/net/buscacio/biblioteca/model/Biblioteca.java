package net.buscacio.biblioteca.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Biblioteca {

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

    public void addLivro(Livro livro) {
        if(acervo != null) {
            acervo.add(livro);
        }
    }

    public void addCategoria(Categoria categoria) {
        if (categoria != null) {
            this.categorias.add(categoria);
        }
    }
}
