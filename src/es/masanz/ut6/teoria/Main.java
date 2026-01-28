package es.masanz.ut6.teoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public void probandoArrayList(){
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


    public static void probandoHashSet(){
        ArrayList<Character> alfabetoList= new ArrayList<>();

        alfabetoList.add('A');
        alfabetoList.add('B');
        alfabetoList.add('C');
        alfabetoList.add('D');
        alfabetoList.add('E');
        alfabetoList.add('F');
        alfabetoList.add('G');
        alfabetoList.add('H');
        alfabetoList.add('I');
        alfabetoList.add('J');
        alfabetoList.add('K');

        System.out.println("Recorriendo arraylist");
        for (Character c : alfabetoList) {
            System.out.println(c);
        }

        HashSet<Character> alfabetoSet = new HashSet<>();
        alfabetoSet.add('A');
        alfabetoSet.add('B');
        alfabetoSet.add('C');
        alfabetoSet.add('D');
        alfabetoSet.add('E');
        alfabetoSet.add('A');
        alfabetoSet.add('B');
        alfabetoSet.add('C');
        alfabetoSet.add('D');
        alfabetoSet.add('E');


        System.out.println("Recorriendo set");
        for (Character c : alfabetoSet) {
            System.out.println("\t"+c);
        }

        boolean borrado = alfabetoSet.remove('C');
        System.out.println("El caracter C se ha borrado: "+borrado);

        System.out.println("Recorriendo set");
        for (Character c : alfabetoSet) {
            System.out.println("\t"+c);
        }

        Iterator<Character> iterador = alfabetoSet.iterator();
        if (iterador.hasNext()){
            Character c = iterador.next();
            System.out.println("\t"+c);
        }
        System.out.println("Recorriendo set con iterador borrando pares");
        while (iterador.hasNext()){
            Character c = iterador.next();
            if (c % 2 == 0){
                iterador.remove();
            }
            System.out.println("\t"+c);
        }
        System.out.println("Recorriendo set con iterador");
        while (iterador.hasNext()){
            Character c = iterador.next();
            System.out.println("\t"+c);
        }
    }

    public static void main(String[] args) {
        probandoHashSet();

    }
}

