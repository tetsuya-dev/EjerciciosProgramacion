package es.masanz.ut4.UT4Ejer29TablaClasificacion;

public class GeneradorTabla {

    public static final String JUGADORES = "Alice Bob Charlie David";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public GeneradorTabla() {
    }

    public static String obtenerTabla(int numPalabra) {
        int contadorEspacios = 0;
        int posIni = 0;
        int posFin = JUGADORES.length();
        int contadorJugadores = 0;
        // Buscar posicion inicial de la palabra
        for (int i = 0; i < JUGADORES.length(); i++) {
            char c = JUGADORES.charAt(i);
            if (c == ' ') {
                contadorEspacios++;
            }
            if (contadorEspacios == numPalabra) {
                if (i != 0) {
                    posIni = i + 1;
                } else {
                    posIni = i;
                }
                break;
            }
        }
        // Buscar posicion final de la palabra
        for (int i = posIni; i < JUGADORES.length(); i++) {
            char c = JUGADORES.charAt(i);
            if (c == ' ') {
                posFin = i;
                break;
            }
        }
        String color = "";
        String colorLetras = "";
//        int numColor = (int) (Math.random()*3)+1;
//        switch (numColor){
//            case 1:
//                color = "ROJO";
//                colorLetras = ROJO;
//                break;
//            case 2:
//                color = "AMARILLO";
//                colorLetras = AMARILLO;
//                break;
//            case 3:
//                color= "VERDE";
//                colorLetras = VERDE;
//        }

        int puntuacion = (int) (Math.random()*200+1);
        if (puntuacion < 50) {
            color = "ROJO";
            colorLetras = ROJO;
        } else if (puntuacion <= 100) {
            color = "AMARILLO";
            colorLetras = AMARILLO;
        } else {
            color= "VERDE";
            colorLetras = VERDE;
        }


        String jugador = JUGADORES.substring(posIni, posFin);
        String juadorTabla = colorLetras+jugador+RESET;
        String puntuacionTabla = colorLetras+puntuacion+RESET;
        String colorTabla = colorLetras+color+RESET;
        //String s = System.out.printf("| %-17s | %-11s | %-10s |", juadorTabla, puntuacionTabla, colorTabla);
        return " ";
        //return "| "+colorLetras+jugador+RESET+"             |         "+colorLetras+puntuacion+RESET+" | "+colorLetras+color+RESET+"      |";


    }


}
