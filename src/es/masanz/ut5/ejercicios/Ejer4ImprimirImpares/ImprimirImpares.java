package es.masanz.ut5.ejercicios.Ejer4ImprimirImpares;

public class ImprimirImpares {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2 != 0){
                System.out.println(numeros[i]);
            }
        }
    }
}
