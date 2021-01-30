package net.buscacio.biblioteca.model;

public class Usuario {

    public static int _id = 1;

    private int id;
    private String nome;
    private String email;
    private int telefone;

    public Usuario() {}

    public Usuario(String nome, String email, int telefone) {
        this.id = -id++;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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

    @Override
    public String toString() {
        return "{" +
                "\nid: " + id +
                "\nnome: " + nome +
                "\nemail: " + email  +
                "\ntelefone: " + telefone +
                "\n}";
    }
}
