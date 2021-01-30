package net.buscacio.biblioteca.model;

public class Livro {

    public static int _codigo = 1;

    private int codigo;
    private String titulo;
    private String autor;
    private String categoria;

    public Livro() {}

    public Livro(String titulo, String autor, String categoria) {
        this.codigo = _codigo++;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {

        return "{\nCódigo: " + getCodigo() + "\nTítulo: " + getTitulo() +
                "\nAutor: " + getAutor() + "\nGênero: " + getCategoria() + "\n}";
    }
}
