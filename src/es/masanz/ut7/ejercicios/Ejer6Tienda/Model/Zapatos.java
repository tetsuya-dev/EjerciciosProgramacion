package es.masanz.ut7.ejercicios.Ejer6Tienda.Model;

import es.masanz.ut7.ejercicios.Ejer6Tienda.Type.Ropa;

public class Zapatos extends Ropa {

    public Zapatos(String nombre, double precio, String marca, String talla, String material) {
        super(nombre, precio, marca, talla, material);
    }

    @Override
    public String instruccionesLavado() {
        return "";
    }

    @Override
    public String getDescripcion() {
        return "Jordan 1";
    }
}
