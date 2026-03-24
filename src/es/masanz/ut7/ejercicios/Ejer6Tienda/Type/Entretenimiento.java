package es.masanz.ut7.ejercicios.Ejer6Tienda.Type;

import es.masanz.ut7.ejercicios.Ejer6Tienda.Base.Producto;

public abstract class Entretenimiento extends Producto {

    protected int edadMinima;

    public Entretenimiento(String nombre, double precio, String marca, int edadMinima) {
        super(nombre, precio, marca);
        this.edadMinima = edadMinima;
    }

    public abstract boolean esAptoParaMenores();
}
