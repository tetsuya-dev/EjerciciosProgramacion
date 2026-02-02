package es.masanz.ut6.ejercicios.Ejer5ExpulsarAlumnos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    static List<Estudiante> estudiantes = new ArrayList<>();


    public void mostrarEstudiantes(){
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());
        }
    }


    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Raul",18, 7.5);
        estudiantes.add(estudiante1);
        Estudiante estudiante2 = new Estudiante("Alejandro",18,9);
        estudiantes.add(estudiante2);
        Estudiante estudiante3 = new Estudiante("Iker",19,7.2);
        estudiantes.add(estudiante3);


        // Muestra los alumnos con nota media mayor de 5
        Iterator<Estudiante> it = estudiantes.iterator();
        while (it.hasNext()){
            Estudiante estudiante = it.next();
            if (estudiante.getNotaMedia() < 5.0){
                it.remove();
            }
        }

        // Ordena estudiates aprobados por las notas
        boolean ordenado = false;
        while (!ordenado){
            ordenado = true;
            for (int i = 0; i < estudiantes.size() - 1; i++) {
                Estudiante actual = estudiantes.get(i);
                Estudiante siguiente = estudiantes.get(i + 1);
                if (actual.getNotaMedia() < siguiente.getNotaMedia()){
                    estudiantes.set(i, siguiente);
                    estudiantes.set(i + 1, actual);
                    ordenado = false;
                }
            }

        }

    }

}
