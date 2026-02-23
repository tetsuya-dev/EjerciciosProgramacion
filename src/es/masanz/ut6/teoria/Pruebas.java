package es.masanz.ut6.teoria;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Pruebas {
    public static void main(String[] args) {

        //probandoTreeMap();
        probandoLinkedHashMap();
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
}
