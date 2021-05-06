package NicolasTesone;

import NicolasTesone.Muebles.Escritorio;
import NicolasTesone.Muebles.Mueble;
import NicolasTesone.Muebles.Silla;
import NicolasTesone.ProductosInformaticos.Impresora;
import NicolasTesone.ProductosInformaticos.Notebook;
import NicolasTesone.ProductosInformaticos.ProductoInformatico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primer Parcial Java Laboratorio 3 - UTN\n");
       //3) crear instancia de cada clase y agregar a una lista segun su categoria: Productos Informatico y Muebles.
        Escritorio escritorio = new Escritorio("Noshe",50000,10,1.5,4.5);
        Silla silla= new Silla("Gigabyte",35000,4,true);
        Notebook notebook = new Notebook("Hp", "omen", 30, 78000,1000);
        Impresora impresora = new Impresora("Brother","hl340",4,9800,400);

        List<ProductoInformatico> listadoProductos = new ArrayList<>();
        List<Mueble> listadoMuebles= new ArrayList<>();

        listadoProductos.add(notebook);
        listadoProductos.add(impresora);

        listadoMuebles.add(silla);
        listadoMuebles.add(escritorio);

        Mueble muebles = new Mueble();
        ProductoInformatico informaticos = new ProductoInformatico();

        System.out.println("mostrar lista de muebles y de productos informaticos.");
        //se encuentran divididas en dos categorias
        // Muebles que contiene Sillas y Escritorios
        // Productos Informaticos que contiene  Notebooks y Impresoras
        System.out.println("\nMuebles:");
        muebles.mostrarLista(listadoMuebles);

        System.out.println("\nProductos Informaticos:");
        informaticos.mostrarLista(listadoProductos);

        System.out.println("\n4)-- descuentos en las silla e impresoras se aplico 15% de descuento.");
        System.out.println("\nSin Descuento: Sillas $" + silla.getPrecio() +
                " Impresoras $" + impresora.getPrecio());
        System.out.println("Con Descuento: Sillas $" + silla.calcularDescuento() +
                " Impresoras $" + impresora.calcularDescuento());

        System.out.println("5)-- actualizacion de precios. Sillas = 5%, Escritorios = 10%, Impresoras = 15%, Notebooks = 20%");

        System.out.println("\nMuebles: ");
        silla.actualizacionPrecios();
        escritorio.actualizacionPrecios();

        System.out.println("\nProductos Informaticos: ");
        impresora.actualizacionPrecios();
        notebook.actualizacionPrecios();
    }
}
