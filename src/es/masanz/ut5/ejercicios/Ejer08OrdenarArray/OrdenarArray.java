package es.masanz.ut5.ejercicios.Ejer08OrdenarArray;

public class OrdenarArray {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 7;
        numeros[1] = 3;
        numeros[2] = 9;
        numeros[3] = 21;
        numeros[4] = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println();

        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length-1; i++) {
                if (numeros[i] < numeros[i+1]){
                    int aux = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = aux;
                }
            }
        }

        //Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
    }
}
