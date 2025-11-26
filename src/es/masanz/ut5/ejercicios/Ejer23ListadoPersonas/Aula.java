package es.masanz.ut5.ejercicios.Ejer23ListadoPersonas;

import java.util.Arrays;

public class Aula {

    public static final String[] alumnos = new String[22];
    String[] nombre = {"Javier","Alejandro","Iker","Sebastian","Asier","Raul","David","Samuel"};

//    public void poblar(){
//        int n = (int)(Math.random()*25)+17;
//        for (int i = 0; i < alumnos.length; i++) {
//            alumnos[i] = new Persona(nombre[i], n*i+1);
//        }
//    }
//
//    public void buscarMayor(){
//        Persona viejuno = new Persona("Nadie", 0);
//        for (int i = 0; i < alumnos.length; i++) {
//            Persona persona = alumnos[i];
//            if (persona.getEdad() > viejuno.getEdad()){
//                viejuno = persona;
//            }
//        }
//        System.out.println("La persona vieja es:");
//        System.out.println(viejuno);
//    }
//
//    public void buscarMenor(){
//        Persona joven = new Persona("Nadie",99);
//        for (int i = 0; i < alumnos.length; i++) {
//            Persona persona = alumnos[i];
//            if (persona.getEdad() > joven.getEdad()){
//                joven = persona;
//            }
//        }
//        System.out.println("La persona joven es es:");
//        System.out.println(joven);
//    }
//
//    public void ordenarAula(){
//        boolean seguirOrdenando = true;
//        while (seguirOrdenando){
//            seguirOrdenando = false;
//            for (int i = 0; i < alumnos.length; i++) {
//                Persona personaIzq = alumnos[i];
//                Persona personaDer = alumnos[i+1];
//                if (personaIzq.getEdad() > personaDer.getEdad()){
//                    intercambiar(i, i+1);
//                    seguirOrdenando = true;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(alumnos));
//    }
//    public void intercambiar(int pos1, int pos2){
//        Persona aux = alumnos[pos1];
//        alumnos[pos1] = alumnos[pos2];
//        alumnos[pos2] = aux;
//
//    }
}
