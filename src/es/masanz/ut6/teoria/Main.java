package es.masanz.ut6.teoria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] nombresArray = new String[25];
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Tamano array estatico " + nombresArray.length);
        System.out.println("Tamano array dinamico " + nombres.size());

        // INSERTAR DATOS
        nombresArray[0] = "Iker";
        nombresArray[1] = "Alejandro";
        nombresArray[2] = "Raul";
        nombres.add("Iker");
        nombres.add("Alejandro");
        nombres.add("Raul");


        System.out.println("Tamano array estatico " + nombresArray.length);
        System.out.println("Tamano array dinamico " + nombres.size());


        //CONSULTAR INDICES
        System.out.println("Nombres del array estatico");
        for (int i = 0; i < nombresArray.length; i++) {
            System.out.println(nombresArray[i]);
        }

        System.out.println("Nombres del array dinamico");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        // REESCRIBIR DATOS
        nombresArray[0] = "Iker Zadra";
        nombres.remove(0);
        nombres.add(0, "Iker Zadra");


        ArrayList<Integer> edades = new ArrayList<>();
        edades.add(18);
    }
}

