package es.masanz.ut5.ejercicios.util;

public class Util {

    /**
     * Muestra la matriz char por consola
     * @param matriz
     */
    public static void mostrarMatriz(char[][] matriz){
        System.out.println();
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[fila][col]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Muestra la matriz int por consola
     * @param matriz
     */
    public static void mostrarMatriz(int[][] matriz){
        System.out.println();
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[fila][col]+" ");
            }
            System.out.println();
        }
    }

    /**
     * En matriz de int asigna valores aleatorios del 0 al 9
     * @param matriz
     */
    public static void poblarMatriz(int[][] matriz){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[0].length; col++) {
                matriz[fila][col] = (int)(Math.random()*10);
            }
        }
    }

    /**
     * En matriz de char asigna valores aleatorios del a-z
     * @param matriz
     */
    public static void poblarMatriz(char[][] matriz){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[0].length; col++) {
                if (matriz[fila][col] == '\0'){
                    matriz[fila][col] = letraAleatoria();
                }
            }
        }
    }

    /**
     * Devuelve una letra aleatoria de la a-z
     * @return char letra aleatoria
     */
    public static char letraAleatoria(){
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char letra = letras[(int)(Math.random()*26)];
        return letra;
    }

    /**
     * Invierte la matriz horizontalmente
     * @param matriz
     */
    public static void invertirHorizontal(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length/2; j++) {
                int aux = matriz[i][matriz.length-1-j];
                matriz[i][matriz.length-1-j] = matriz[i][j];
                matriz[i][j] = aux;
            }
        }
    }

    /**
     * Invierte la matriz verticalmente
     * @param matriz
     */
    public static void invertirVertical(int[][] matriz){
        for (int i = 0; i < matriz.length/2; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int aux = matriz[matriz.length-1-i][j];
                matriz[matriz.length-1-i][j] = matriz[i][j];
                matriz[i][j] = aux;
            }
        }
    }

    /**
     * Invierte la matriz tanto horizontal como vertical
     * @param matriz
     */
    public static void invertirHorizontalVertical(int[][] matriz){
        invertirVertical(matriz);
        invertirHorizontal(matriz);
    }
}
