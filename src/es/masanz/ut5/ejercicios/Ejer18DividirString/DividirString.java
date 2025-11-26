package es.masanz.ut5.ejercicios.Ejer18DividirString;

import java.util.Scanner;

public class DividirString {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador=0;
        System.out.print("INTRODUCE UN TEXTO PORFIS :");
        String s = teclado.nextLine();
        char[] texto = new char[s.length()];
        int j = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) != ' ') {
//                texto[j] = s.charAt(i);
//                j++;
                texto[j++] = s.charAt(i);
            }
        }

        System.out.println("j="+j);

        char[] finales = new char[j];
        for (int i = 0; i < finales.length; i++) {
            finales[i] = texto[i];
        }

        for (int i = 0; i < finales.length; i++) {
            System.out.print("Caracter" + (i + 1) + "= " + finales[i] + "\n");
        }

    }
}
