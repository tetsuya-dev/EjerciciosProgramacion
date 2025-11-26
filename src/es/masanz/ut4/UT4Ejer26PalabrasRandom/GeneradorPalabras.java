package es.masanz.ut4.UT4Ejer26PalabrasRandom;

import java.util.Scanner;

public class GeneradorPalabras {
    public static final String PALABRAS = "gato pero rana leon osos";
    private static int contador = 0;

    public static String obtenerPalabra(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = scanner.nextInt();

        int longitudPalabra = 0;
        int contador = 1;
        for (int i = 0; i < PALABRAS.length(); i++) {

            char c = PALABRAS.charAt(i);

            if (c == ' '){
                contador++;
            }

        }

        for (int i = 0; i <PALABRAS.length() ; i++) {
            char a= PALABRAS.charAt(i);
            if( a != ' '){
                longitudPalabra++;
            } else {
                break;
            }

        }
        int numero = (int) (Math.random() * contador);



        return PALABRAS.substring(numero*(longitudPalabra+1), numero*(longitudPalabra+1) + longitudPalabra); // 0, 5




// ESTE SI FUNCIONA
//        switch (n){
//            case 1:
//                for (int i = 0; i < 4; i++) {
//                    System.out.print(PALABRAS.charAt(i));
//                }
//                break;
//            case 2:
//                for (int i = 5; i < 9; i++) {
//                    System.out.print(PALABRAS.charAt(i));
//                }
//                break;
//            case 3:
//                for (int i = 10; i < 14; i++) {
//                    System.out.print(PALABRAS.charAt(i));
//                }
//                break;
//            case 4:
//                for (int i = 15; i < 19; i++) {
//                    System.out.print(PALABRAS.charAt(i));
//                }
//                break;
//            case 5:
//                for (int i = 20; i < 24; i++) {
//                    System.out.print(PALABRAS.charAt(i));
//                }
//
//        }

//
//        for (int i = n1; i < n2; i++) {
//            //char n = PALABRAS.charAt(i);
//            if (n == ' '){
//                contador++;
//            }
//            n1 = n1 + 4;
//            n2 = n2 + 4;
//            System.out.print(PALABRAS.charAt(i));
//        }
//
//        int n1 = 0;
//        int n2 = 4;
//        for (int i = 0; i < PALABRAS.length(); i++) {
//            for (int j = n1; j < n2; j++) {
//                n1 = n1 + 4;
//                n2 = n2 + 4;
//                System.out.print(PALABRAS.substring(n1,n2));
//            }
//        }
    }
}
