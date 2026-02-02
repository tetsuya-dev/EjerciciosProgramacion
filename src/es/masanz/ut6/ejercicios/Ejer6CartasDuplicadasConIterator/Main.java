package es.masanz.ut6.ejercicios.Ejer6CartasDuplicadasConIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    private ArrayList<Jugador> jugadores;
    private String[] barajaFrancesa = {
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
    };
    public static final int NUM_CARTAS_MANO = 9;
    public static final int NUM_RONDAS = 3;

    public static void main(String[] args) {
        Main m = new Main();
        m.jugar();
    }

    public void jugar(){
        this.jugadores = new ArrayList<>();
        this.jugadores.add(new Jugador("Javi"));
        this.jugadores.add(new Jugador("Yahya"));
        this.jugadores.add(new Jugador("Jimena"));

        ArrayList<String> baraja = new ArrayList<>();

        for (String carta : barajaFrancesa) {
            baraja.add(carta);
        }

        Collections.shuffle(baraja);

        System.out.println(baraja);

        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            ArrayList<String> mano = new ArrayList<>();
            Iterator<String> it = baraja.iterator();
            while (it.hasNext()){
                mano.add(it.next());
                it.remove();

                // aqui falta codigo
            }
            for (int j = NUM_CARTAS_MANO-1; j >= 0; j--) {
                mano.add(baraja.get(j));
                baraja.remove(j);
            }
            jugador.setMano(mano);
            System.out.println("Jugador "+i+": "+jugador.getMano());
        }

        System.out.println(baraja);

        for (int i = 0; i < NUM_RONDAS; i++) {

            for (int j = 0; j < jugadores.size(); j++) {

                int cartasDescartadas = 0;
                Jugador jugador = jugadores.get(j);
                ArrayList<String> mano = jugador.getMano();
                HashSet cartasUnicas = new HashSet<>();
                // DESCARTAR
                for (int k = mano.size()-1; k >=0 ; k--) {
                    if(cartasDescartadas<2 && cartasUnicas.contains(mano.get(k))){
                        baraja.add(mano.get(k));
                        mano.remove(k);
                        cartasDescartadas++;
                    } else {
                        cartasUnicas.add(mano.get(k));
                    }
                }
                Collections.shuffle(baraja);
                // ROBAR
                for (int k = cartasDescartadas-1; k >= 0; k--) {
                    mano.add(baraja.get(k));
                    baraja.remove(k);
                }
            }
        }

        for (Jugador jugador : jugadores) {
            ArrayList<String> mano = jugador.getMano();
            HashSet cartasUnicas = new HashSet<>();
            cartasUnicas.addAll(mano);
            if(mano.size()==cartasUnicas.size()){
                System.out.println(jugador.getNombre()+" HAS GANADO!");
            } else {
                System.out.println(jugador.getNombre()+" HAS PERDIDO... PAQUETE!");
            }
            System.out.println(jugador.getNombre()+": "+jugador.getMano());
        }
    }

}
