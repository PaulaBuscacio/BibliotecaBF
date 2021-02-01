package net.buscacio.biblioteca.model;

public class Livro {

    public static int _codigo = 1;

    private int codigo;
    private String titulo;
    private String autor;
    private Categoria categoria;
    private boolean disponivel = true;


    public Livro() {}

    public Livro(String titulo, String autor, Categoria categoria, boolean disponivel) {
        this.codigo = _codigo++;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public Livro(String titulo, String autor) {
        this.codigo = _codigo++;
        this.titulo = titulo;
        this.autor = autor;
    }


    public int getCodigo() {
        return codigo;
    }

    public static int get_codigo() {
        return _codigo;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

   public int setIdCategoria(int idCategoria) {
        return idCategoria;
   }

    public boolean isDisponivel() {

        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {

        return "{\nCódigo: " + get_codigo() + "\nTítulo: " + getTitulo() +
                "\nAutor: " + getAutor() + "\nGênero: " + getCategoria() + "\nDisponível: " + isDisponivel() + "\n}";
    }


}
