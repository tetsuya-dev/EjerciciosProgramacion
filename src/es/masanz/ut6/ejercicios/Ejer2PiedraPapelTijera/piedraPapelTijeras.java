package es.masanz.ut6.ejercicios.Ejer2PiedraPapelTijera;

import java.util.ArrayList;
import java.util.Scanner;

public class piedraPapelTijeras {

    private ArrayList<Historial> historialPartidas = new ArrayList<>();
    private boolean terminado = true;


    public Opciones opcion(int n){

        switch (n){
            case 1:
                return Opciones.Piedra;
            case 2:
                return Opciones.Papel;
            case 3:
                return Opciones.Tijera;

        }
        return null;
    }


    public static void main(String[] args) {

        piedraPapelTijeras pj = new piedraPapelTijeras();


        int opcionMaquina = (int) (Math.random() * 3);

        // opcion maquina
        pj.opcion(opcionMaquina);
        System.out.println(pj.opcion(opcionMaquina));

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opcion:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.println();
        System.out.print("Opcion: ");
        int n = sc.nextInt();

        //int num = Opciones.gana(pj.opcion(opcionMaquina), pj.opcion(n));

        //System.out.println(Opciones.gana(pj.opcion(opcionMaquina), pj.opcion(n)));



    }
}
