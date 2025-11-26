package es.masanz.ut5.ejercicios.Ejer19ContarVocalesConsonantes;

import java.util.Scanner;

public class ContarVocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        String[] trozos = texto.split("");

        char[] letras = new char[trozos.length];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = texto.charAt(i);
        }

        char[] vocales = {'a','e','i','o','u','A','E','I','O','U'};
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        for (int i = 0; i < trozos.length; i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (letras[i] == vocales[j]){
                    contadorVocales++;
                } else {
                    contadorConsonantes++;
                }
            }
        }
        System.out.println("Vocales: "+contadorVocales);
        System.out.println("Consonantes: "+contadorConsonantes);
    }
}
