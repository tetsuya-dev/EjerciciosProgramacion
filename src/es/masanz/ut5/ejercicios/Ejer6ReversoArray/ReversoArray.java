package es.masanz.ut5.ejercicios.Ejer6ReversoArray;

public class ReversoArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }
        System.out.println("Array original");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        System.out.println("Array invertido");
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i]+" ");
        }
//        System.out.println();
//        System.out.println("Array invirtiendo valores");
//        for (int i = 0; i < numeros.length; i++) {
//            numeros[i] = numeros[numeros.length-i-1];
//            System.out.print(numeros[i]+" ");
//        }
        System.out.println();
        System.out.println("Array invertido cambiando los valores");
        for (int i = 0; i < numeros.length/2; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[numeros.length-1-i];
            numeros[numeros.length-1-i] = aux;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
