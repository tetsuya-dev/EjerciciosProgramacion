package es.masanz.ut5.ejercicios.Ejer05MaximoArray;

public class MaximoArray {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*10)+1;
        }
        int max = 0;
        int pos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max){
                max = numeros[i];
                pos = i;
            }
        }
        System.out.println("El numero maximo es "+max+" y esta en la posicion "+pos);

    }
}
