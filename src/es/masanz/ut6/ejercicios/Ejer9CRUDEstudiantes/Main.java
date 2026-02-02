package es.masanz.ut6.ejercicios.Ejer9CRUDEstudiantes;

import es.masanz.ut6.ejercicios.Ejer5ExpulsarAlumnos.Estudiante;

import java.util.HashMap;

public class Main {
    static HashMap<Integer, Estudiantes> estudiantesHashMap = new HashMap<>();




    private static void mostrarDatos(int dni) {
        System.out.println("Estudiante con DNI: "+dni);
        System.out.println("Nombre: "+estudiantesHashMap.get(dni).getNombre());
        System.out.println("Edad: "+estudiantesHashMap.get(dni).getEdad());
        System.out.println("Nota Media: "+estudiantesHashMap.get(dni).getNotaMedia());
        System.out.println();
    }


    public static void main(String[] args) {


        estudiantesHashMap.put(12345678, new Estudiantes("Ana García"));
        estudiantesHashMap.put(23456789, new Estudiantes("Luis Rodríguez"));
        estudiantesHashMap.put(34567890, new Estudiantes("Carla Martínez"));
        estudiantesHashMap.put(45678901, new Estudiantes("Diego López"));
        estudiantesHashMap.put(56789012, new Estudiantes("Elena Torres"));
        estudiantesHashMap.put(67890123, new Estudiantes("Fernando Ruiz"));
        estudiantesHashMap.put(78901234, new Estudiantes("Gabriela Sanz"));
        estudiantesHashMap.put(89012345, new Estudiantes("Hugo Castro"));
        estudiantesHashMap.put(90123456, new Estudiantes("Irene Vidal"));
        estudiantesHashMap.put(01234567, new Estudiantes("Juan Morales"));

        for (Integer i : estudiantesHashMap.keySet()) {
            mostrarDatos(i);
        }

    }

}
