package es.masanz.ut7.ejercicios.Ejer7MiPrimerClone;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Torrente", 56);

        Persona p2 = persona.clone();

        System.out.println(persona.toString());
        System.out.println(p2.toString());

        System.out.println();


        Jugador jugador = new Jugador("messi", 35);
    }
}
