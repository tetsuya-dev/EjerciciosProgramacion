package es.masanz.ut7.ejercicios.Ejer1Peaje;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { // FALTA TERMINARLO

        List<Vehiculo> vehiculos = new ArrayList<>();

        List<String> tipos = new ArrayList<>();
        List<String> color = new ArrayList<>();
        List<String> matriculas = new ArrayList<>();

        tipos.add("Coche");
        tipos.add("Moto");
        tipos.add("Camion");
        tipos.add("Coche");
        tipos.add("Moto");

        color.add("ROJO");
        color.add("GRIS METALIZADO");
        color.add("AMARILLO");
        color.add("AZUL ELÉCTRICO");
        color.add("BLANCO PERLA");

        matriculas.add("5566-DRT");
        matriculas.add("9901-KKL");
        matriculas.add("2345-GHT");
        matriculas.add("8812-BBN");
        matriculas.add("0044-XCV");

        for (int i = 0; i < 5; i++) {

        }

        Vehiculo coche = new Coche("Audi RS3", "NEGRO", "1234-ABC");
        Vehiculo moto = new Moto("Kawasaki 800", "VERDE", "4321-CBA");
        Vehiculo camion = new Camion("Mercedes", "BLANCO", "7654-ZXY");
    }
}
