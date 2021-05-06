package NicolasTesone.ProductosInformaticos;

import NicolasTesone.ActualizacionPrecios;

import java.util.UUID;

//punto 1- crear clases
public class Notebook extends ProductoInformatico implements ActualizacionPrecios {
    private int memoria;
    private UUID id;

    public Notebook() {
    }


    public Notebook(String nombreFabricante, String nombre, int stock, double precio, int memoria) {
        super(nombreFabricante, nombre, stock, precio);
        this.id = UUID.randomUUID();
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" + super.toString() +
                "memoria=" + memoria +
                ", id=" + id +
                '}';
    }

    public void actualizacionPrecios(){
        System.out.println("Notebook: " +
                "precio sin aumento = " + this.getPrecio() +
                " precio con 20% de aumento = " + (this.getPrecio() * (100 + 20) /100));
    }
}
