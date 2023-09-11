public class Libro {
    public String nombre;
    public String autor;
    private String codigo;
    private int cantidad;
    private String ubicacion;
    public boolean disponibilidad;

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Libro(String nombre, String autor, String codigo, int cantidad){
        this.nombre = nombre;
        this.autor = autor;
        setCodigo(codigo);
        setCantidad(cantidad);
        if(getCantidad() > 0){
            this.disponibilidad = true;
        }
    }

    public void agregar(int cantidad){
        setCantidad(getCantidad()+cantidad);
        if(getCantidad() > 0) {
            this.disponibilidad = true;
        }
    }
    public void eliminar(int cantidad){
        setCantidad(getCantidad()-cantidad);
        if(getCantidad() <= 0){
            this.disponibilidad = false;
        }
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Autor: " + this.autor);
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Codigo: " + getCodigo());
        if(this.disponibilidad){
            System.out.println("Disponibilidad: DISPONIBLE");
        }else{
            System.out.println("Disponibilidad: LIBRO NO DISPONIBLE");
        }

    }
}
