package es.masanz.ut5.ejercicios.Ejer10RotarArray;

import java.util.Scanner;

public class RotarArray {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+2;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Introduce 1 si quieres cambiar hacia la izquierda y 2 hacia la derecha: ");
        int n = scanner.nextInt();
        int aux2 = numeros[0];
        int aux1 = numeros[0];

        if (n == 1){ // ROTAR HACIA IZQUIERDA
            for (int i = 0; i < numeros.length-1; i++) {
                int aux = numeros[i];
                numeros[i] = numeros[i+1];
                numeros[i+1] = aux;
            }
        } else if (n == 2) { // ROTAR HACIA DERECHA
            for (int i = 0; i < numeros.length-1; i++) {
                aux1 = numeros[i+1];
                numeros[i+1] = aux2;
                aux2 = aux1;
            }
            numeros[0] = aux2;
        }
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }

    }
}
