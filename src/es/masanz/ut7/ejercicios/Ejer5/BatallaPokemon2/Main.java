package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon2;

public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new Charmander();
        Pokemon squirtle = new Squirtle();
        Pokemon bulbasaur = new Bulbasaur();

        System.out.println("--- INICIO DEL COMBATE ---");

        squirtle.atacar(charmander);
        System.out.println();

        charmander.atacar(squirtle);
        System.out.println();

        bulbasaur.atacar(squirtle);
        System.out.println();

        squirtle.atacar(bulbasaur);
        System.out.println();

        charmander.atacar(bulbasaur);
        System.out.println();

        bulbasaur.atacar(charmander);
    }
}
