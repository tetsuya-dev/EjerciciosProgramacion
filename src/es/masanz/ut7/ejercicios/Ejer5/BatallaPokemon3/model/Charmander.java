package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.model;

import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.base.Pokemon;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.types.Fuego;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.types.Planta;

public class Charmander extends Pokemon implements Fuego {

    public Charmander(int vida, int ataque, int defensa, int velocidad, int especial) {
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

        if(enemigo instanceof Planta) {
            puntosDano = puntosDano * 2;
        }

        // aplicamos quemadura al ser de tipo fuego
        int quemadura = quemar(enemigo);

        puntosDano = puntosDano + quemadura;

        enemigo.recibirAtaque(this, puntosDano);

    }

    @Override
    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        double factor = aplicarResistencia(agresor);
        this.vida = (int) (this.vida - (cantidadDano * factor));
    }

    @Override
    public double aplicarResistencia(Pokemon agresor){
        double factor = 1;
        if(agresor instanceof Planta){
            factor = 0.5;
        }
        return factor;
    }

    @Override
    public int quemar(Pokemon agresor){
        int quemadura = 5;
        if(agresor instanceof Fuego){
            quemadura = 0;
        }
        return quemadura;
    }

    @Override
    protected Pokemon clone() throws CloneNotSupportedException {
        return new Bulbasaur(this.vida, this.ataque, this.defensa, this.velocidad, this.especial);
    }

}
