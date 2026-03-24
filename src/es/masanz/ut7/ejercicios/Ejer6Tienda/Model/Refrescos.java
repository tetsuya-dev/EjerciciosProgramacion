package es.masanz.ut7.ejercicios.Ejer6Tienda.Model;

import es.masanz.ut7.ejercicios.Ejer6Tienda.Type.Comida;

public class Refrescos extends Comida {

    public Refrescos(String nombre, double precio, String marca, String fechaCaducidad) {
        super(nombre, precio, marca, fechaCaducidad);
    }

    @Override
    public boolean estaCaducado() {
        return false;
    }

    @Override
    public String getDescripcion() {
        return "RedBull";
    }
}
