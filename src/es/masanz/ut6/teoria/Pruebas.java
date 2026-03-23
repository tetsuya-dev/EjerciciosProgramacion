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
        Cosa c1 = new Cosa("C1");
        Map<Integer, Map<String, Object>> mapa = new
                HashMap<>();
        Map<String, Object> m = new HashMap<>();
        m.put("cosa", c1);
        m.put("persona", p1);
        m.put("estado", false);
        mapa.put(1, m);
        boolean b = (boolean) mapa.get(1).get("estado");
        if (!b) {
            mapa.get(1).put("rol", "normal");
        }else {
            mapa.get(1).put("rol", "super");
        }
        System.out.println(mapa.get(1).get("rol"));
    }
}
