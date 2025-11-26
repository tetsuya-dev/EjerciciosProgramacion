package es.masanz.ut4.UT4Ejer26PalabrasRandom;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            String palabra = GeneradorConsolaBueno.obtenerPalabraDinamica((int) (Math.random() * 6));
            System.out.println(palabra);
        }


    }
}
