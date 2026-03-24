package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon2.model;

import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon2.base.Pokemon;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon2.types.Agua;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon2.types.Fuego;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon2.types.Planta;

public abstract class Bulbasaur extends Pokemon implements Planta {

    public Bulbasaur(int life, int attack, double defense, int speed, String special) {
        super(life, attack, defense, speed, special);
    }

    @Override
    public void atacar(Pokemon enemigo) {
        enemigo.recibirAtaque(this, this.attack);
    }

    @Override
    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        if (agresor instanceof Agua){
            aplicarResistencia(agresor);
        }
    }

    @Override
    public double aplicarResistencia(Pokemon agresor) {
        return 0;
    }

}
