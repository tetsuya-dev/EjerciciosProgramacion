package es.masanz.ut7.ejercicios.Ejer6Tienda.Model;

import es.masanz.ut7.ejercicios.Ejer6Tienda.Type.Entretenimiento;

public class Revista extends Entretenimiento {

    public Revista(String nombre, double precio, String marca, int edadMinima) {
        super(nombre, precio, marca, edadMinima);
    }

    @Override
    public boolean esAptoParaMenores() {
        return false;
    }

    @Override
    public String getDescripcion() {
        return "New York Times";
    }
}
