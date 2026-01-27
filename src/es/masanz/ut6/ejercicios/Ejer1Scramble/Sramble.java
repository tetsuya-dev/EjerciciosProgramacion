package es.masanz.ut6.ejercicios.Ejer1Scramble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sramble {
    ArrayList<String> nombres = new ArrayList<>();
    ArrayList<Character> letrasPalabra = new ArrayList<>();
    boolean ganaste = true;
    int intentos = 0;
    String palabra = "";


    public void iniciar(){
        instanciarNombres();
        revolverPalabra(nombres);
        palabraRevuelta();
        imprimirPalabra(letrasPalabra);
        Scanner sc = new Scanner(System.in);
        while (ganaste){
            intentos++;
            System.out.println();
            System.out.print("Introduce tu palabra: ");
            String palabraUsuario = sc.nextLine();

            if (palabra.toLowerCase().equals(palabraUsuario.toLowerCase())){
                System.out.println("Acertaste");
                System.out.println("En "+intentos+" intentos");
                ganaste = false;
                break;
            }

        }
    }

    public void instanciarNombres(){
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carla");
        nombres.add("Javier");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Sofía");
        nombres.add("Diego");
        nombres.add("Elena");
        nombres.add("Pablo");
    }

    public ArrayList revolverPalabra(ArrayList lista){
        Collections.shuffle(lista);

        return lista;
    }

    public ArrayList palabraRevuelta(){
        int n = (int) (Math.random() * nombres.size());
        palabra = nombres.get(n);
        System.out.println(palabra);

        for (int i = 0; i < palabra.length(); i++) {
            letrasPalabra.add(palabra.charAt(i));
        }

        Collections.shuffle(letrasPalabra);

        return letrasPalabra;
    }

    public void imprimirPalabra(ArrayList lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+" ");
        }
    }



    public static void main(String[] args) {

        Sramble sa = new Sramble();
        sa.iniciar();

    }
}
