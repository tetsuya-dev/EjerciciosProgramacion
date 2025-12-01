package es.masanz.ut5.teoria.Matrices;

import es.masanz.ut5.teoria.model.Persona;

public class Main {
    public static void main(String[] args) {
        String[] nombres = new String[5];

        nombres[0] = "Aitor";
        nombres[1] = "Alex";
        nombres[2] = "Roberto";
        nombres[3] = "Samuel";
        nombres[4] = "Guillermo";

//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println(nombres[i]);
//        }

        int[] numeros = new int[5];
        numeros[1] =1;

        Persona[] personas = new Persona[6];
        personas[0] = new Persona();
        personas[0].setNombre("Raul");
        personas[0].setEdad(18);
        personas[1] = new Persona();
        personas[1].setNombre("Iker");
        personas[1].setEdad(19);
        Persona andrii = new Persona();
        andrii.setNombre("Andrii");
        andrii.setEdad(18);
        personas[2] = andrii;
        System.out.println(personas[2]);
        andrii.setEdad(17);
        System.out.println(personas[2]);
    }
}
