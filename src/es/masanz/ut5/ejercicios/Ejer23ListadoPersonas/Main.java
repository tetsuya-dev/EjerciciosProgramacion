package es.masanz.ut5.ejercicios.Ejer23ListadoPersonas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

//        for (int i = 0; i < personas.length; i++) {
//            personas[i] = new Persona();
//        }

        personas[0].setNombre("Pepe");
        personas[1].setNombre("Iker");
        personas[2].setNombre("Javier");
        personas[3].setNombre("David");
        personas[4].setNombre("Agustin");

        for (int i = 0; i < personas.length; i++) {
            int n = (int)(Math.random()*100);
            personas[i].setEdad(n);
        }

        for (int i = 0; i < personas.length; i++) {
            System.out.println((i+1)+". Nombre: "+personas[i].getNombre()+", edad: "+personas[i].getEdad());
        }

        for (int i = 0; i < personas.length-1; i++) {
            for (int j = 0; j < personas.length-1; j++) {
                if (personas[i].getEdad() > personas[j].getEdad()){
                    System.out.println("Resultado: La persona mas joven es: "+personas[i].getNombre()+", con "+personas[i].getEdad()+" anos");
                    break;
                }
            }
        }

    }
}
