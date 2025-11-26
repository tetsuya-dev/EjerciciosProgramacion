package es.masanz.ut4.UT4Ejer28WordleConsola.util;



import java.util.Scanner;

public class Wordle {

    private String palabra;
    private int numIntento;

    private static final int MAX_INTENTOS = 6;

    public Wordle(String palabra) {
        this.palabra = palabra;
    }

    public Wordle() {
        this.palabra = GeneradorPalabras.obtenerPalabraDinamica(1);
    }

    public void evaluarPalabra(String palabraUsuario) {
        String pintarEn = "";
        boolean tienenMismaLongitud = palabra.length() == palabraUsuario.length();


        if (tienenMismaLongitud) {
            numIntento++;
            for (int i = 0; i < palabra.length(); i++) {

                char letraPalabraRandom = palabra.charAt(i);
                char letraPalabraUsuario = palabraUsuario.charAt(i);
                if (letraPalabraUsuario == letraPalabraRandom) {
                    pintarEn = ColoresConsola.VERDE;
                } else if (palabra.contains(""+letraPalabraUsuario)) {
                    pintarEn = ColoresConsola.AMARILLO;
                } else {
                    pintarEn = ColoresConsola.ROJO;
                }
                System.out.printf(pintarEn+"%s"+ColoresConsola.RESET, letraPalabraUsuario);
            }
            System.out.println();
        } else {
            System.out.println("\tERROR: La palabra es de "+palabra.length()+" caracteres.");
        }
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        String palabraUsuario = "";
        while (!palabraUsuario.equals(palabra) && numIntento < MAX_INTENTOS) {
            palabraUsuario = scanner.nextLine();
            evaluarPalabra(palabraUsuario);
        }

        if (palabraUsuario.equals(palabra)) {
            System.out.println("================");
            System.out.println("  ¡HAS GANADO!");
            System.out.println("================");
        } else {
            System.out.println("================");
            System.out.println("  ¡HAS PERDIDO!");
            System.out.println("================");
        }
    }
}
