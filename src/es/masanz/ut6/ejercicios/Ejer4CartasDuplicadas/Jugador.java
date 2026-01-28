package es.masanz.ut6.ejercicios.Ejer4CartasDuplicadas;

import java.util.ArrayList;
import java.util.HashSet;

public class Jugador {
    private String nombre;
    private ArrayList<Integer> baraja = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Integer> baraja) {
        this.baraja = baraja;
    }
}
