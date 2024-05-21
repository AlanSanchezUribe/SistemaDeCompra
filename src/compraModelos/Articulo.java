package compraModelos;



public class Articulo implements Comparable<Articulo> {

    private String nombre;
    private Double precio;


    public Articulo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Articulo precio) {
        return this.getPrecio().compareTo(precio.getPrecio());
    }

    public String getNombre() {
        return nombre;
    }


    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Articulo [nombre= " + nombre + ", precio= " + precio + "]";
    }

   

   

}
