package es.masanz.ut5.teoria.Matrices;

public class Matrices {
    public static void main(String[] args) {

        // Definir matriz
        int[][] mapa = new int[5][10];

        // Asignar valores matriz
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[0].length; col++) {
                mapa[fila][col] = (int)(Math.random()*10);
            }
        }

        // Mostrar matriz
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[0].length; col++) {
                System.out.print(mapa[fila][col]+" ");
            }
            System.out.println();
        }
    }
}
