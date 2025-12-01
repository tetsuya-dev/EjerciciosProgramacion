package es.masanz.ut5.ejercicios.Ejer02BuscarNumero;

import java.util.Scanner;

public class BuscarNum {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 5;
        numeros[3] = 7;
        numeros[4] = 9;
        numeros[5] = 11;

        boolean numeroEsta = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero que buscas: ");
        int n = scanner.nextInt();


        for (int i = 0; i < numeros.length; i++) {
            if (n == numeros[i]){
                System.out.println("El numero esta en la posicion: "+i);
                numeroEsta = true;
            }
        }
        if (numeroEsta == false){
            System.out.println("El numero no se encuentra en el array");
        }
    }
}
