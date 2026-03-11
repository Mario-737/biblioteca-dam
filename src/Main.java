public class Main {
    public static void main(String[] args) throws Exception {
        Biblioteca b = new Biblioteca();
        Libro l1  = new Libro("Libro1", "Autor1");
        Libro l2  = new Libro("Libro2", "Autor2");

        b.agregarLibro(l1);
        b.agregarLibro(l2);

        b.mostrarLibros();

        l1.prestarLibro();
        l1.devolverLibro();
    }
}
