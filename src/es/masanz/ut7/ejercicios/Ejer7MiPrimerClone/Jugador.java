package es.masanz.ut7.ejercicios.Ejer7MiPrimerClone;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Persona{

    private List<String> juegosJugados;

    public Jugador(String nombre, int edad) {
        super(nombre, edad);
        juegosJugados = new ArrayList<>();
    }


    @Override
    protected Jugador clone() {
        Persona persona = this.clone();
        ArrayList<String> jueJuga = new ArrayList<>();
        Jugador jugador = new Jugador(persona.getNombre(), persona.getEdad());
        jugador.setJuegosJugados(jueJuga);
        return jugador;
    }

    public List<String> getJuegosJugados() {
        return juegosJugados;
    }

    public void setJuegosJugados(List<String> juegosJugados) {
        this.juegosJugados = juegosJugados;
    }
}
