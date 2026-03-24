package es.masanz.ut7.ejercicios.Ejer6Tienda.Model;

import es.masanz.ut7.ejercicios.Ejer6Tienda.Type.Comida;

public class Bolleria extends Comida {

    public Bolleria(String nombre, double precio, String marca, String fechaCaducidad) {
        super(nombre, precio, marca, fechaCaducidad);
    }

    @Override
    public boolean estaCaducado() {
        long fechaCaducidadMillis = Long.parseLong(fechaCaducidad);
        return System.currentTimeMillis() > fechaCaducidadMillis;
    }

    @Override
    public String getDescripcion() {
        return "Pastas Beatriz";
    }
}
