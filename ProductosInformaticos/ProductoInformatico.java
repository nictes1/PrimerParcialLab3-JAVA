package NicolasTesone.ProductosInformaticos;

import java.util.List;

//punto 1- crear clases
public class ProductoInformatico {

    private String nombreFabricante;
    private String nombre;
    private int stock;
    private double precio;

    public ProductoInformatico() {
    }

    public ProductoInformatico(String nombreFabricante, String nombre, int stock, double precio) {
        this.nombreFabricante = nombreFabricante;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombreFabricante='" + nombreFabricante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", precio=" + precio;
    }

    public void mostrarLista(List<ProductoInformatico> listaProdctoInformaticos){
        for(ProductoInformatico informaticos : listaProdctoInformaticos){
            System.out.println(informaticos.toString());
        }
    }
}
