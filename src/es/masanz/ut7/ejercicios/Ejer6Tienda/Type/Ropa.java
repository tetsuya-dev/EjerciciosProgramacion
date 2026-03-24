package es.masanz.ut7.ejercicios.Ejer6Tienda.Type;

import es.masanz.ut7.ejercicios.Ejer6Tienda.Base.Producto;

public abstract class Ropa extends Producto {

    protected String talla;
    protected String material;

    public Ropa(String nombre, double precio, String marca, String talla, String material) {
        super(nombre, precio, marca);
        this.talla = talla;
        this.material = material;
    }

    public abstract String instruccionesLavado();
}
