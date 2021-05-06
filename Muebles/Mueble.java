package NicolasTesone.Muebles;

import java.util.List;

//punto 1- crear clases
public class Mueble {

    private String nombre;
    private double precio;
    private int stock;

    public Mueble() {
    }

    public Mueble(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock;
    }

    public void mostrarLista(List<Mueble> listadoMuebles){
        for(Mueble mueble: listadoMuebles){
            System.out.println(mueble.toString());
        }
    }
}
