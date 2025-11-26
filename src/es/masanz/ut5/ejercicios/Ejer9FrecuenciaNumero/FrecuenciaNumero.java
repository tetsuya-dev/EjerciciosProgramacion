package es.masanz.ut5.ejercicios.Ejer9FrecuenciaNumero;

import java.util.Scanner;

public class FrecuenciaNumero {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 7;
        numeros[1] = 3;
        numeros[2] = 7;
        numeros[3] = 21;
        numeros[4] = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero que buscas: ");
        int n = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                contador++;
            }
        }

        System.out.println("El numero "+n+" aparece "+contador+" veces");
    }
}
