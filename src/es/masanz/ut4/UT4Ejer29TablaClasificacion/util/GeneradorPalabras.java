package es.masanz.ut4.UT4Ejer29TablaClasificacion.util;

public class GeneradorPalabras {

    public static final String PALABRAS_FIJAS = "caballo siempre estrena sandias";
    public static final String PALABRAS_VARIABLES = "caballo topo gato caballitoMar tigre";

    public static String obtenerPalabraFija() {
        int longitudPalabra = 0;
        int contador = 1;
        for (int i = 0; i < PALABRAS_FIJAS.length(); i++) {
            char c = PALABRAS_FIJAS.charAt(i);
            if (c == ' ') {
                contador++;
            }
        }

        for (int i = 0; i < PALABRAS_FIJAS.length(); i++) {
            char a = PALABRAS_FIJAS.charAt(i);
            if (a != ' ') {
                longitudPalabra++;
            } else {
                break;
            }
        }

        int numero = (int) (Math.random() * contador);

        return PALABRAS_FIJAS.substring(numero * (longitudPalabra + 1), numero * (longitudPalabra + 1) + (longitudPalabra)); // 0, 5

    }
    public static String obtenerPalabraDinamica() {
        int contadorEspacios = 0;
        int posIni = 0;
        int posFin = PALABRAS_VARIABLES.length();
        // Buscar posicion inicial de la palabra
        for (int i = 0; i < PALABRAS_VARIABLES.length(); i++) {
            char c = PALABRAS_VARIABLES.charAt(i);
            if (c == ' ') {
                contadorEspacios++;
            }
            int numPalabra = 1;
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
        for (int i = posIni; i < PALABRAS_VARIABLES.length(); i++) {
            char c = PALABRAS_VARIABLES.charAt(i);
            if (c == ' ') {
                posFin = i;
                break;
            }
        }
        return PALABRAS_VARIABLES.substring(posIni, posFin);
    }
}

