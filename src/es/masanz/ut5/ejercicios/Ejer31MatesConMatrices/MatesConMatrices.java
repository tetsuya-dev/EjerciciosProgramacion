package es.masanz.ut5.ejercicios.Ejer31MatesConMatrices;

public class MatesConMatrices {
    public static void main(String[] args) {
        int[][] mapa = new int[3][3];

        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[0].length; col++) {
                mapa[fila][col] = (int)(Math.random()*10);
            }
        }

        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[0].length; col++) {
                System.out.print(mapa[fila][col]+" ");
            }
            int n = 0;
            for (int i = 0; i < mapa.length; i++) {
                n += mapa[fila][i];
            }
            System.out.println("< "+n);

        }

        int n = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ʌ ");
        }
        System.out.println();

        for (int aaa = 0; aaa < mapa.length; aaa++) {
            for (int i = 0; i < mapa.length; i++) {
                n += mapa[i][aaa];
            }
            System.out.print(n+" ");
            n = 0;
        }
        System.out.println();
        int diagonal = 0;
        for (int i = 0; i < mapa.length; i++) {
            diagonal += mapa[i][i];
        }
        System.out.println("Suma diagonal: "+diagonal);
    }
}
