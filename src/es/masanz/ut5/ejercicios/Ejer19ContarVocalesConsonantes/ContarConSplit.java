package es.masanz.ut5.ejercicios.Ejer19ContarVocalesConsonantes;

import javax.swing.*;

public class ContarConSplit {
    public static void main(String[] args) {
        String s = "hola buenos dias";
        String[] texto = s.split("[^a-zA-Z]");
        for (int i = 0; i < texto.length; i++) {
            System.out.println("["+texto[i]+"]");
        }
    }
}
