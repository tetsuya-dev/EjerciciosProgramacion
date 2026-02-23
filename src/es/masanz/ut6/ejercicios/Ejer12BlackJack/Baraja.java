package es.masanz.ut6.ejercicios.Ejer12BlackJack;

import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;

    public static String[] palos = {"Corazones", "Diamantes", "Treboles", "Picas"};
    public static String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public static int[] puntos = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};


    public void inicializarBaraja(){
        cartas.clear();
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                for (int k = 0; k < puntos.length; k++) {
                    Carta carta = new Carta(palos[i], valores[j], puntos[k]);
                    cartas.add(carta);
                }
            }
        }
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta(){
        int n = (int) (Math.random() * cartas.size());
        Carta carta = new Carta();
        carta = cartas.get(n);
        cartas.remove(n);
        return carta;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
}
