package es.masanz.ut6.ejercicios.Ejer4CartasDuplicadas;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    private static Jugador jugador1 = new Jugador("Raul");
    private static Jugador jugador2 = new Jugador("Alejandro");
    private static Jugador jugador3 = new Jugador("Iker");


    public static void imprimirArrayList(ArrayList lista){
        for (Object o : lista) {
            System.out.println(o);
        }
        System.out.println();
    }

    public static void repartirCartasIniciales(Jugador jugador, ArrayList mazo){
        for (int i = 0; i < 6; i++) {
            int n = (int) (Math.random() * mazo.size());
            jugador.getBaraja().add((Integer) mazo.get(n));
            mazo.remove(n);
        }
    }

    public static void descartarCartasRepetidas(Jugador jugador, ArrayList mazo){
        for (Integer i : jugador.getBaraja()) {
            for (Integer j : jugador.getBaraja()) {
                if (i.equals(j+1)){
                    mazo.add(jugador.getBaraja().get(i));
                    jugador.getBaraja().remove(i);

                }
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> mazo = new ArrayList<Integer>();

        for (int palo = 0; palo < 4; palo++) {
            for (int i = 1; i <= 13; i++) {
                mazo.add(i);
            }
        }

        imprimirArrayList(mazo);

        repartirCartasIniciales(jugador1, mazo);
        repartirCartasIniciales(jugador2, mazo);
        repartirCartasIniciales(jugador3, mazo);


        System.out.println(jugador1.getNombre());
        imprimirArrayList(jugador1.getBaraja());

        System.out.println(jugador2.getNombre());
        imprimirArrayList(jugador2.getBaraja());

        System.out.println(jugador3.getNombre());
        imprimirArrayList(jugador3.getBaraja());

        imprimirArrayList(mazo);

        descartarCartasRepetidas(jugador1, mazo);

        imprimirArrayList(jugador1.getBaraja());


    }
}
