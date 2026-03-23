package es.masanz.ut7.ejercicios.Ejer3Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();

        personajes.add(new Guerrero());
        personajes.add(new Mago());

        for (Personaje p : personajes) {
            p.atacar();
            p.defender();
            System.out.println("---");
        }
    }
}
