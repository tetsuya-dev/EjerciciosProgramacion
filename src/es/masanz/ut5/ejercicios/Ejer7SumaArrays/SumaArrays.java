package es.masanz.ut5.ejercicios.Ejer7SumaArrays;

public class SumaArrays {
    public static void main(String[] args) {
        int[] lista1 = new int[10];
        int[] lista2 = new int[10];
        System.out.println("Suma de lista 1 y lista 2");
        int[] lista3 = new int[10];
        for (int i = 0; i < lista3.length; i++) {
            lista1[i] = i+2;
            lista2[i] = i*3;
            lista3[i] = lista1[i] + lista2[i];
            System.out.print(lista3[i]+" ");
        }
    }
}
