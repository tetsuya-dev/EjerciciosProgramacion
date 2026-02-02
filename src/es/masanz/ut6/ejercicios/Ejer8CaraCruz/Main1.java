package es.masanz.ut6.ejercicios.Ejer8CaraCruz;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    static List<String> historial = new ArrayList<>();
    private static String CARA = "Cara";
    private static String CRUZ = "Cruz";



    public static String tirarMoneda(){
        int n = (int) (Math.random() * 100) + 1;
        if (n > 50){
            return CARA;
        }
        return CRUZ;
    }

    public static void jugarRonda(){
        String ronda = tirarMoneda()+" ";
        ronda += tirarMoneda();
        historial.add(ronda);
        quienGana(ronda);
    }

    private static void quienGana(String ronda) {

    }


    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            jugarRonda();
        }
        for (String s : historial) {
            System.out.println(s);
        }

    }
}
