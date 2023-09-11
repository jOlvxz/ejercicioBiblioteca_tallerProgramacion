// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Libro elGenEgoista = new Libro("El gen egoista", "Richard Dawkins", "1234", 5);
        Libro elPrincipe = new Libro("El Principe", "Nicolas Maquiavelo", "123343", 10);
        Biblioteca biblio = new Biblioteca();
        biblio.poblarBiblioteca(elGenEgoista, elPrincipe);
        biblio.mostrarLibrosDisponibles();
        biblio.prestarLibro("El gen egoista");
        biblio.mostrarLibrosDisponibles();
        biblio.devolverLibro("El gen egoista","0001");
        biblio.mostrarLibrosDisponibles();
        biblio.eliminarLibro("El gen egoista");
        biblio.mostrarLibrosDisponibles();

    }
}