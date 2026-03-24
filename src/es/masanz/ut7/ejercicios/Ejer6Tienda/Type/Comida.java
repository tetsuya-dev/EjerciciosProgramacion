package es.masanz.ut7.ejercicios.Ejer6Tienda.Type;

import es.masanz.ut7.ejercicios.Ejer6Tienda.Base.Producto;

public abstract class Comida extends Producto {
    protected String fechaCaducidad;

    public Comida(String nombre, double precio, String marca, String fechaCaducidad) {
        super(nombre, precio, marca);
        this.fechaCaducidad = fechaCaducidad;
    }

    public abstract boolean estaCaducado();
}
