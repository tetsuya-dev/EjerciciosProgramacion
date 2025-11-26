package es.masanz.ut5.ejercicios.Ejer11InterseccionArrays;

public class InterseccionArrays {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 0;
        numeros[6] = 7;

        int[] numeros2 = new int[7];
        numeros2[0] = 1;
        numeros2[1] = 3;
        numeros2[2] = 5;
        numeros2[3] = 7;
        numeros2[4] = 0;
        numeros2[5] = 0;
        numeros2[6] = 0;
        int[] numRepe = new int[7];

        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros2.length; j++) {
                if (numeros[i] == numeros2[j]){
                    numRepe[j] = numeros2[j];
                    contador++;
                }
            }
        }

        System.out.println("Numeros que se repiten:");
        for (int i = 0; i < contador; i++) {
            System.out.print(numRepe[i]+" ");
        }

    }
}
