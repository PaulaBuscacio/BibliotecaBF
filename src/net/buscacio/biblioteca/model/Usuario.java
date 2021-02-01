package net.buscacio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    public static int _id = 1;

    private int id;
    private String nome;
    private String email;
    private int telefone;
    private List<Livro> livrosEmprestados;

    public Usuario() {}

    public Usuario(String nome, String email, int telefone) {
        this.id = _id++;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.livrosEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    @Override
    public String toString() {
        return "{" +
                "\nid: " + id +
                "\nnome: " + nome +
                "\nemail: " + email  +
                "\ntelefone: " + telefone +
                "\nlivros emprestados: " + livrosEmprestados +
                "\n}";
    }
}
