package es.masanz.ut5.ejercicios.Ejer16AdivinaSecuencia;

import java.util.Scanner;

public class AdivinarSecuencia {



    public static void main(String[] args) {
        int[] array1 = new int[5];


        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 9) + 1;
            System.out.print(array1[i]+" ");
        }
        System.out.println();

        System.out.println("La secuencia tiene " + array1.length + " números");



        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero de numeros separados por 1 espacio: ");
        String text = scanner.nextLine();
        String[] palabras = text.split(" ");
        int[] numeros = new int[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            numeros[i] = Integer.parseInt(palabras[i]);
        }

        int[] numAcertados = new int[array1.length];

        int contador = 0;
        for (int i = 0; i < array1.length; i++) {
                if (array1[i] == numeros[i]){
                    contador ++;
                    numAcertados[i] = numeros[i];
                }

        }

        System.out.println("As hacertado "+contador+" numeros: ");
        for (int i = 0; i < numAcertados.length; i++) {
            if (numAcertados[i] != 0){
                System.out.print(numAcertados[i]+" ");
            } else {
                System.out.print("  ");
            }
        }

    }
}

