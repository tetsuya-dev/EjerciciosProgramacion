package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.model;

import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.base.Pokemon;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.types.Agua;
import es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.types.Planta;

public class Bulbasaur extends Pokemon implements Planta {

    public Bulbasaur(int vida, int ataque, int defensa, int velocidad, int especial) {
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

        if(enemigo instanceof Agua) {
            puntosDano = puntosDano * 2;
        }

        enemigo.recibirAtaque(this, puntosDano);

    }

    @Override
    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        double factor = aplicarResistencia(agresor);
        this.vida = (int) (this.vida - (cantidadDano * factor));
        // aplicamos la recuperacion de vida por ser de tipo planta
        this.vida = this.vida  + recuperarVida();
    }

    @Override
    public double aplicarResistencia(Pokemon agresor){
        double factor = 1;
        if(agresor instanceof Agua){
            factor = 0.5;
        }
        return factor;
    }

    @Override
    public int recuperarVida() {
        return 5;
    }

    @Override
    protected Pokemon clone() throws CloneNotSupportedException {
        return new Bulbasaur(this.vida, this.ataque, this.defensa, this.velocidad, this.especial);
    }
}
