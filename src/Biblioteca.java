public class Biblioteca {
    private Libro[] libros;

    public Biblioteca() {
        libros = new Libro[10];
    }

    public void agregarLibro(Libro libro) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i]==null) {
                libros[i]=libro;
                break;
            }
        }
    }

    public void mostrarLibros() {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i]!=null) {
                System.out.println(libros[i].getTitulo());
            }
            
        }
    }
}
