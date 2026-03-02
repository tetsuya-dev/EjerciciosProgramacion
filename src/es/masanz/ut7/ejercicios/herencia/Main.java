package es.masanz.ut7.ejercicios.herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo moto = new Moto(110);
        vehiculos.add(moto);
        Vehiculo camion = new Camion(210);
        vehiculos.add(camion);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar(5);
        }

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }

    }
}
