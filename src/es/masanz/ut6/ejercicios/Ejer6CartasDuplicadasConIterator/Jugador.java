package es.masanz.ut6.ejercicios.Ejer6CartasDuplicadasConIterator;

import java.util.ArrayList;
import java.util.HashSet;

public class Jugador {
    private String nombre;
    private ArrayList<String> mano = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMano() {
        return mano;
    }

    public void setMano(ArrayList<String> mano) {
        this.mano = mano;
    }
}
