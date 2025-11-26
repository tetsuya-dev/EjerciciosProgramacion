package es.masanz.ut5.ejercicios.Ejer33InvertirMatrices;

import es.masanz.ut5.ejercicios.util.Util;

public class InvertirMatrices {

    public void invertirHorizontal(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length/2; j++) {
                int aux = matriz[i][matriz.length-1-j];
                matriz[i][matriz.length-1-j] = matriz[i][j];
                matriz[i][j] = aux;
            }
        }
    }
    public void invertirVertical(int[][] matriz){
        for (int i = 0; i < matriz.length/2; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int aux = matriz[matriz.length-1-i][j];
                matriz[matriz.length-1-i][j] = matriz[i][j];
                matriz[i][j] = aux;
            }
        }
    }

    public void invertirHorizontalVertical(int[][] matriz){
        invertirVertical(matriz);
        invertirHorizontal(matriz);
    }



    public static void main(String[] args) {
        InvertirMatrices invertirMatrices = new InvertirMatrices();

        int[][] a = new int[4][4];

        Util.poblarMatriz(a);
        Util.mostrarMatriz(a);
        //invertirMatrices.invertirHorizontal(a);
        //Util.mostrarMatriz(a);
        invertirMatrices.invertirVertical(a);
        Util.mostrarMatriz(a);

    }
}
