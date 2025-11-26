package es.masanz.ut5.ejercicios.Ejer35SopaDeLetras;

import es.masanz.ut5.ejercicios.util.Util;


public class SopaDeLetras {

    private final static int HORIZONTAL = 1;
    private final static int VERTICAL = 2;

    public char[] obtenerPalabra(){
        String[] palabras = {
                "manzana", "pelota", "cielo", "montaña", "sol", "luna", "estrella", "río", "flor", "árbol",
                "perro", "gato", "casa", "libro", "zapato", "café", "musica", "planta", "piedra",
                "viento", "agua", "amor", "familia", "amistad", "libertad"
        };

        int n = (int)(Math.random() * palabras.length);
        char[] palabra = new char[palabras[n].length()];

        for (int i = 0; i < palabras[n].length(); i++) {
            palabra[i] = palabras[n].charAt(i);
        }

        return palabra;
    }

    /**
     * Decide la orientacion de la palabra y la pone llamando al metodo ponerPalabra()
     * @param matriz
     */
    public void colocarPlabra(char[][] matriz){
        int orientacion = -1;
        int fila = -1;
        int columna = -1;
        int totalColumnas = matriz[0].length;
        int totalFilas = matriz.length;
        char[] palabra = obtenerPalabra();
        boolean exito = false;

        for (int i = 0; i < palabra.length; i++) {
            while (!exito){
                orientacion = (int)(Math.random()*2) + 1;
                if (orientacion == HORIZONTAL){
                    columna = (int)(Math.random() * (totalColumnas - palabra.length));
                    fila = (int)(Math.random() * totalFilas);
                } else if (orientacion == VERTICAL) {
                    columna = (int)(Math.random() * totalColumnas);
                    fila = (int)(Math.random() * (totalFilas - palabra.length));
                }
                exito = ponerPalabra(matriz, palabra, fila, columna, orientacion);
            }
        }
    }

    /**
     * Valida si se puede poner la palabra y la pone si es true
     * @param matriz
     * @param palabra
     * @param fila
     * @param columna
     * @param orientacion
     * @return
     */
    private boolean ponerPalabra(char[][] matriz, char[] palabra, int fila, int columna, int orientacion) {
        for (int i = 0; i < palabra.length; i++) {
            if (orientacion == HORIZONTAL){
                if (palabra.length<=matriz[0].length){
                    return false;
                }
                if (matriz[columna][fila + i] != '\0' && !(matriz[columna][fila + i] == palabra[i])){
                    return false;
                }
            } else if (orientacion == VERTICAL){
                if (palabra.length>=matriz.length){
                    return false;
                }
                if (matriz[columna + i][fila] != '\0' && (matriz[columna + i][fila] == palabra[i])){
                    return false;
                }
            }
        }

        for (int i = 0; i < palabra.length; i++) {
            if (orientacion == HORIZONTAL){
                matriz[columna][fila + i] = palabra[i];
            } else if (orientacion == VERTICAL){
                matriz[columna + i][fila] = palabra[i];
            }
        }

        return true;
    }


    public void iniciarPanel(int n, char[][] matriz){
        for (int i = 0; i < n; i++) {

        }
        Util.mostrarMatriz(matriz);
    }


    public static void main(String[] args) {
        SopaDeLetras sopaLetras = new SopaDeLetras();
        char[][] sopa = new char[10][8];


        Util.mostrarMatriz(sopa);
        sopaLetras.colocarPlabra(sopa);
        sopaLetras.colocarPlabra(sopa);
        sopaLetras.colocarPlabra(sopa);
        sopaLetras.colocarPlabra(sopa);
        Util.mostrarMatriz(sopa);
        Util.poblarMatriz(sopa);
        Util.mostrarMatriz(sopa);

    }

}
