package es.masanz.ut7.ejercicios.Ejer1Peaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

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

        poblarVehiculos(vehiculos, tipos, color, matriculas);

        simularPeaje(vehiculos);

    }

    public static void simularPeaje(List<Vehiculo> vehiculos) {
        System.out.println("\n========== SIMULACIÓN DE PEAJE ==========\n");

        int totalRecaudado = 0;

        for (Vehiculo vehiculo : vehiculos) {
            int saldoAntes = vehiculo.getSaldo();
            int tarifa = vehiculo.getTarifa();

            // Realizar el pago del peaje
            vehiculo.pagarPeaje();

            int saldoDespues = vehiculo.getSaldo();

            // Mostrar información del cobro
            System.out.println("Vehículo: " + vehiculo.getTipo());
            System.out.println("  Matrícula: " + vehiculo.getMatrícula());
            System.out.println("  Color: " + vehiculo.getColor());
            System.out.println("  Tarifa: €" + tarifa);
            System.out.println("  Saldo anterior: €" + saldoAntes);
            System.out.println("  Saldo posterior: €" + saldoDespues);
            System.out.println();

            totalRecaudado += tarifa;
        }

        System.out.println("============== RESUMEN ==============");
        System.out.println("Total de vehículos procesados: " + vehiculos.size());
        System.out.println("Total recaudado: €" + totalRecaudado);
        System.out.println("=====================================\n");

    }


    public static void poblarVehiculos(List<Vehiculo> vehiculos, List<String> tipos,
                                       List<String> colores, List<String> matriculas) {
        Random random = new Random();

        for (int i = 0; i < tipos.size(); i++) {
            String tipoSeleccionado = tipos.get(random.nextInt(tipos.size()));
            String colorSeleccionado = colores.get(random.nextInt(colores.size()));
            String matriculaSeleccionada = matriculas.get(random.nextInt(matriculas.size()));

            Vehiculo vehiculo = null;

            switch (tipoSeleccionado) {
                case "Coche":
                    vehiculo = new Coche(tipoSeleccionado, colorSeleccionado, matriculaSeleccionada);
                    break;
                case "Moto":
                    vehiculo = new Moto(tipoSeleccionado, colorSeleccionado, matriculaSeleccionada);
                    break;
                case "Camion":
                    vehiculo = new Camion(tipoSeleccionado, colorSeleccionado, matriculaSeleccionada);
                    break;
            }

            if (vehiculo != null) {
                vehiculos.add(vehiculo);
            }
        }
    }
}
