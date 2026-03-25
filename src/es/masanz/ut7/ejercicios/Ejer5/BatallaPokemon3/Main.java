package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3;

import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.base.Pokemon;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.model.Bulbasaur;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.model.Charmander;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.model.Squirtle;

public class Main {
    public static void main(String[] args) {

        // bulbasur tiene mas stats para poder hacer frente contra charmander
        Pokemon bulbasur = new Bulbasaur(200, 13, 6, 8, 6);
        bulbasur.apodar("plantita");

        Pokemon charmander = new Charmander(100, 10, 5, 8, 6);
        charmander.apodar("llamita");

        Pokemon squirtle = new Squirtle(100, 10, 5, 8, 6);
        squirtle.apodar("awita");

        // Elige uno, ya que si haces todos seguidos, el que lleve mas combates tendra menos vida :)
        pelear(bulbasur, charmander);
        //pelear(charmander, squirtle);
        //pelear(squirtle, bulbasur);

    }

    public static void pelear(Pokemon pokemon1, Pokemon pokemon2){
        boolean soloPuedeQuedarUno = false;
        int turno = 1;
        while(!soloPuedeQuedarUno){
            if(turno % 2 == 0) {
                pokemon1.atacar(pokemon2);
            } else {
                pokemon2.atacar(pokemon1);
            }
            if(pokemon1.getVida()<=0 || pokemon2.getVida()<=0){
                soloPuedeQuedarUno = true;
            }
            turno++;
        }
        System.out.println("********************************");
        System.out.println("*    RESULTADOS DEL COMBATE    *");
        System.out.println("********************************");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
    }
}
