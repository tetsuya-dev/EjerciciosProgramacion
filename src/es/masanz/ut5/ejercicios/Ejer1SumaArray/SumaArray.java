package es.masanz.ut5.ejercicios.Ejer1SumaArray;

public class SumaArray {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 5;
        numeros[3] = 7;
        numeros[4] = 9;


        int numerosSumados = 0;

        for (int i = 0; i < numeros.length; i++) {
            numerosSumados += numeros[i];
        }
        System.out.println(numerosSumados);
    }
}
