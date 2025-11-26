package es.masanz.ut4.UT4Ejer29TablaClasificacion;

import es.masanz.ut4.UT4Ejer29TablaClasificacion.util.ColoresConsola;
import es.masanz.ut4.UT4Ejer29TablaClasificacion.util.GeneradorPalabras;

import static es.masanz.ut4.UT4Ejer29TablaClasificacion.GeneradorTabla.RESET;

public class Main2 {

    // IMPORTAR DATOS ESTATICOS
    public class Main {
        public static void main(String[] args) {

            System.out.println("-------------------------------------------------------");
            System.out.printf("| %4s | %-17s | %11s | %-10s |\n", "ID", "Jugador", "Puntuación", "Rango");
            System.out.println("-".repeat(55));
            int id = 1;

            while(true) {
                int numero = (int) (Math.random() * 201);
                String nombre = GeneradorPalabras.obtenerPalabraDinamica();
                String color = "";
                String pintarEn = "";
                if (numero < 50) {
                    // rojo
                    color = "ROJO";
                    pintarEn = ColoresConsola.ROJO;
                } else if (numero <= 100) {
                    // amarillo
                    color = "AMARILLO";
                    pintarEn = ColoresConsola.AMARILLO;
                } else {
                    // verde
                    color = "VERDE";
                    pintarEn = ColoresConsola.VERDE;
                }
                System.out.printf("| "+ pintarEn +"%4d"+RESET+" | " + pintarEn + "%-17s" + RESET + " | " + pintarEn + "%11s" + RESET + " | " + pintarEn + "%-10s" + RESET + " |\n", id, nombre, numero, color);
                System.out.println("-------------------------------------------------------");

                int numeroSalida = (int) (Math.random()*100);
                if (numeroSalida<5){
                    break;
                }
                id++;
            }
        }
    }
}
