public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public void prestarLibro() {
        prestado=true;
        System.out.println("El libro se ha prestado");
    }

    public void devolverLibro() {
        prestado=false;
        System.out.println("El libro se ha devuelto");
    }



    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Boolean estaPrestado() {
        return prestado;
    }

}
