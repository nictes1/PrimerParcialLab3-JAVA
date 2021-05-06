package NicolasTesone.Muebles;

import NicolasTesone.ActualizacionPrecios;

import java.util.UUID;

//punto 1- crear clases
public class Escritorio extends Mueble implements ActualizacionPrecios {
    private double alto, ancho;
    private UUID id;

    public Escritorio() {
    }

    public Escritorio(String nombre, double precio, int stock, double alto, double ancho) {
        super(nombre, precio, stock);
        this.id = UUID.randomUUID();
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" + super.toString() +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", id=" + id +
                '}';
    }


    public void actualizacionPrecios(){
        System.out.println("Escritorios: " +
                "precio sin aumento = " + this.getPrecio() +
                " precio con 10% de aumento = " + (this.getPrecio() * (100 + 10) /100));
    }
}
