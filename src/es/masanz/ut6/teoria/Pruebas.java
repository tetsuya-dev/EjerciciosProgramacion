package es.masanz.ut6.teoria;

import es.masanz.ut6.teoria.Prueba.Cosa;
import es.masanz.ut6.teoria.Prueba.Persona;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Pruebas {
    public static void main(String[] args) {

        //probandoTreeMap();
        //probandoLinkedHashMap();
        pregunta();
    }

    private static void probandoLinkedHashMap() {
        Map<String, String> dniNombres = new HashMap<>();
        dniNombres.put("12345678A", "Raul");
        dniNombres.put("98765432B", "Iker");
        dniNombres.put("13579246C", "Alejandro");


        System.out.println(dniNombres);

    }

    private static void probandoTreeMap() {
//        List<String> nombres = new ArrayList<>();
//        nombres.add("Raul");
//        nombres.add("Iker");
//
//        Set<String> cursos = new HashSet<>();
//        cursos.add("LM");
//        cursos.add("Programacion");
//
        Map<String, String> dniNombres = new HashMap<>();
        dniNombres.put("12345678A", "Raul");
        dniNombres.put("98765432B", "Iker");

//        System.out.println(dniNombres);


        Set<String> nombres = new TreeSet<>();
        for (String value : dniNombres.values()) {
            nombres.add(value);
        }
        System.out.println(nombres);
    }

    private static void pregunta(){
        Persona p1 = new Persona("P1");
        Persona p2 = new Persona("P2");
        Cosa c1 = new Cosa("C1");
        Cosa c2 = new Cosa("C2");
        Cosa c3 = new Cosa("C3");
        List<Cosa> lista1 = new ArrayList<>();
        List<Cosa> lista2 = new ArrayList<>();
        lista1.add(c1);
        lista1.add(c3);
        lista2.add(c1);
        lista2.add(c2);
        lista2.add(c3);
        HashMap<Persona, List<Cosa>> mapa = new HashMap<>();
        mapa.put(p1, lista1);
        mapa.put(p2, lista1);
        Cosa c = mapa.get(p1).get(0);
        c.setNombre("XX");
        System.out.println(mapa.get(p2));
    }
}
