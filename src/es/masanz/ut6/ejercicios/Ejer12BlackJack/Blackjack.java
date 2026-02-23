package es.masanz.ut6.ejercicios.Ejer12BlackJack;

import java.util.List;
import java.util.Map;

public class Blackjack {

    private Baraja baraja;
    private Map<Jugador, List<Carta>> manos;
    private Map<Jugador, Integer> apuestas;
    private List<Carta> crupier;

    public Blackjack(Baraja baraja, Map<Jugador, List<Carta>> manos, Map<Jugador, Integer> apuestas, List<Carta> crupier) {
        this.baraja = baraja;
        this.manos = manos;
        this.apuestas = apuestas;
        this.crupier = crupier;
    }

    public int calcularPuntuacion(List<Carta> mano){

        int puntos = 0;

        for (Carta carta : mano) {
            Carta card = new Carta();
            card = carta;
            puntos+= card.getPuntos();
        }


        return puntos;
    }


    public void mostrarMano(Map.Entry<Jugador, List<Carta>> entry){

        for (Map.Entry<Jugador, List<Carta>> jugadorListEntry : manos.entrySet()) {
            System.out.println(jugadorListEntry.toString());
        }
    }

    public void jugar(){


    }


}
