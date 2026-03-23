package es.masanz.ut7.ejercicios.Ejer3Interfaces;

public class Guerrero implements Personaje {


    @Override
    public void atacar() {
        System.out.println("El guerrero ataca con espada");
    }

    @Override
    public void defender() {
        System.out.println("El guerrero defiende con escudo");
    }
}
