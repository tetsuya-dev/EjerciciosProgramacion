package es.masanz.ut6.ejercicios.Ejer4CartasDuplicadas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Integer> baraja = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Integer> baraja) {
        this.baraja = baraja;
    }
}
