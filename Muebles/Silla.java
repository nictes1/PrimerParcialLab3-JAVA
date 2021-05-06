package NicolasTesone.Muebles;

import NicolasTesone.ActualizacionPrecios;
import NicolasTesone.Descuento;

import java.util.UUID;

//punto 1- crear clases
public class Silla extends Mueble implements Descuento, ActualizacionPrecios {
    private UUID id;
    private Boolean ruedas;

    public Silla() {
    }

    public Silla(String nombre, double precio, int stock, Boolean ruedas) {
        super(nombre, precio, stock);
        this.id = UUID.randomUUID();
        this.ruedas = ruedas;
    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "id=" + id + super.toString() +
                ", ruedas=" + ruedas +
                ", descuento=" + descuento +
                '}';
    }

    final int descuento = 15;
    @Override
    public double calcularDescuento() {
        return this.getPrecio() * (100 - descuento) /100;
    }

    public void actualizacionPrecios(){
        System.out.println("Sillas: " +
                "precio sin aumento = " + this.getPrecio() +
                " precio con 5% de aumento = " + (this.getPrecio() * (100 + 5) /100));
    }
}
