package net.buscacio.biblioteca.model;

public class Categoria {
    //coloca id automaticamente
    public  static int _id = 1;

    private final int id;
    private String nome;

    public Categoria(String nome) {
        this.id = _id++;
        this.nome = nome;
    }

    public int get_id() {
        return id;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
