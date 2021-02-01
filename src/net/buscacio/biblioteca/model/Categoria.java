package net.buscacio.biblioteca.model;

public class Categoria {
    //coloca id automaticamente
    public  static int _id = 1;

    private  int id;
    private String nome;

    public Categoria() {}

      public Categoria(String nome) {
        this.id = _id++;
        this.nome = nome;
    }


    public int getId() {
        return id;
    }

    public void set_id(int id) {
        Categoria._id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "\nid: " + id +
                ", \nnome: " + nome +
                "\n}";
    }
}
