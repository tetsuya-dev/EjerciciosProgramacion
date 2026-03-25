package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.model;

import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.base.Pokemon;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.types.Agua;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.types.Fuego;

public class Squirtle extends Pokemon implements Agua {

    public Squirtle(int vida, int ataque, int defensa, int velocidad, int especial) {
        super(vida, ataque, defensa, velocidad, especial);
    }

    @Override
    public void atacar(Pokemon enemigo) {

        // (ataque del agresor - defensa del defensor) *
        // (velocidad del agresor / velocidad del defensor)

        int ataqueBase = this.ataque;

        /*
        if(enemigo instanceof Agua) {
            ataqueBase = ataqueBase * 2;
        }
        */

        int puntosDano = (ataqueBase - enemigo.getDefensa()) * (this.velocidad / enemigo.getVelocidad());

        if(puntosDano<0) {
            puntosDano = 0;
        }

        if(enemigo instanceof Fuego) {
            puntosDano = puntosDano * 2;
        }

        enemigo.recibirAtaque(this, puntosDano);

    }

    @Override
    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        double factor = aplicarResistencia(agresor);
        // aplicamos una resistencia adicional contra pokemons de tipo fuego
        factor = factor * resistenciaAlFuego(agresor);
        this.vida = (int) (this.vida - (cantidadDano * factor));
    }

    @Override
    public double aplicarResistencia(Pokemon agresor){
        double factor = 1;
        if(agresor instanceof Fuego){
            factor = 0.5;
        }
        return factor;
    }

    @Override
    public double resistenciaAlFuego(Pokemon agresor){
        double factor = 1;
        if(agresor instanceof Fuego){
            factor = 0.5;
        }
        return factor;
    }

    @Override
    protected Pokemon clone() throws CloneNotSupportedException {
        return new Bulbasaur(this.vida, this.ataque, this.defensa, this.velocidad, this.especial);
    }

}