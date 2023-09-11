import java.util.ArrayList;
import java.util.UUID;

public class Biblioteca {
    public int codigoPrestamo;
    public ArrayList<String> codigosPrestamos;
    public ArrayList<Libro> inventario;

    public Biblioteca(){
        inventario = new ArrayList<Libro>();
        codigosPrestamos = new ArrayList<String>();
    }

    public void poblarBiblioteca(Libro... libros){
        for(Libro libro:libros){
            inventario.add(libro);
            System.out.println("el libro " + libro.nombre + " Fue agregado a la biblioteca con un total de "+ libro.getCantidad() +" ejemplares");
        }
    }

    public void mostrarLibrosDisponibles(){
        System.out.println("Inventario de Libros");
        System.out.println("--------------");
        for (Libro libro: inventario){
            if(libro.getCantidad() > 0) {
                libro.mostrarInformacion();
                System.out.println("--------------");
            }
        }
    }
    public void eliminarLibro(String titulo){
        for(Libro libro: inventario){
            if(libro.nombre.equals(titulo) || libro.autor.equals(titulo)){
                System.out.println("El Libro :" + libro.nombre + " Fue eliminado de la biblioteca");
                inventario.remove(libro);

            }
        }
    }
    public Libro buscarLibro(String busqueda){
        for(Libro libro: inventario){
            if(libro.nombre.equals(busqueda) || libro.autor.equals(busqueda)){
                return libro;
            }
        }
        System.out.println("No se encontro el libro :S");
        return null;
    }

    public void prestarLibro(String busqueda){
        Libro prestamo = buscarLibro(busqueda);
        prestamo.eliminar(1);
        codigoPrestamo += 1;
        System.out.println("El libro "+ prestamo.nombre + "fue entregado con exito");
        String codigoGenerado = String.format("%04d", this.codigoPrestamo);
        codigosPrestamos.add(codigoGenerado);
        System.out.println("El Codigo generado para el prestamo es: " + codigoGenerado);

    }

    public void devolverLibro(String nombreLibro, String codigoPrestamo){
        for(String codigo: codigosPrestamos){
            if(codigo.equals(codigoPrestamo)){
                codigosPrestamos.remove(codigoPrestamo);
                break;
            }
        }
        Libro libroDevolucion = buscarLibro(nombreLibro);
        libroDevolucion.agregar(1);
        System.out.println("El Libro " + libroDevolucion.nombre + " fue devuelto de manera exitosa");

    }



}
