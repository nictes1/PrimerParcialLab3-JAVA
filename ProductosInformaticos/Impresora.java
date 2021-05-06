package NicolasTesone.ProductosInformaticos;

import NicolasTesone.ActualizacionPrecios;
import NicolasTesone.Descuento;

import java.util.UUID;

//punto 1- crear clases
public class Impresora extends ProductoInformatico implements Descuento, ActualizacionPrecios {
    private int impresionesXMinuto;
    private UUID id;

    public Impresora() {
    }

    public Impresora(String nombreFabricante, String nombre, int stock, double precio, int impresionesXMinuto) {
        super(nombreFabricante, nombre, stock, precio);
        this.id = UUID.randomUUID();
        this.impresionesXMinuto = impresionesXMinuto;
    }

    public int getImpresionesXMinuto() {
        return impresionesXMinuto;
    }

    public void setImpresionesXMinuto(int impresionesXMinuto) {
        this.impresionesXMinuto = impresionesXMinuto;
    }

    @Override
    public String toString() {
        return "Impresora{" + super.toString() +
                "impresionesXMinuto=" + impresionesXMinuto +
                ", id=" + id +
                ", descuento=" + descuento +
                '}';
    }

    final int descuento = 15;
    @Override
    public double calcularDescuento() {
        return this.getPrecio() * (100 - descuento) /100;
    }

    public void actualizacionPrecios(){
        System.out.println("Impresora: " +
                "precio sin aumento = " + this.getPrecio() +
                " precio con 15% de aumento = " + (this.getPrecio() * (100 + 15) /100));
    }

}
