package es.masanz.ut4.UT4Ejer28WordleConsola;

import es.masanz.ut4.UT4Ejer28WordleConsola.util.GeneradorPalabras;

import java.util.Scanner;

import static es.masanz.ut4.UT4Ejer28WordleConsola.util.ColoresConsola.*;

public class WordleMio {
    public static void main(String[] args) {

        // OBTENER PALABRA ALEATORIA
        int n = (int)(Math.random()*5)+1;
        String palabraSecreta = GeneradorPalabras.obtenerPalabraDinamica(n);
        System.out.println(palabraSecreta);

        // LONGITUD DE LA PALABRA SECRETA
        int longitudPalabraSecreta = palabraSecreta.length();
        System.out.println("La palabra secreta tiene "+longitudPalabraSecreta+" letras");

        while (true){
            // PEDIR AL USUARIO QUE INTRODUCTA UNA LETRA
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Introduce palabra: ");
            String palabraUsuario = scanner.nextLine();

            // COMPROBACION DE QUE LA LETRA ES CORRECTA
            int contador = 0;
            char letraPalabraSecreta = palabraSecreta.charAt(n);
            char letraUsuario = palabraUsuario.charAt(n);


            if (letraUsuario == letraPalabraSecreta){
                System.out.printf(""+VERDE+letraUsuario+RESET+"");
                contador++;
            } else {
                System.out.printf(""+ROJO+letraUsuario+RESET+"");
            }
            if (contador == longitudPalabraSecreta){
                break;
            }
        }




    }
}
