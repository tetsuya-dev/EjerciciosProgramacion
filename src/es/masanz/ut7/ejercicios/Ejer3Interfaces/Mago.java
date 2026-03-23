package es.masanz.ut7.ejercicios.Ejer3Interfaces;

public class Mago implements Personaje{


    @Override
    public void atacar() {
        System.out.println("El mago ataca con el hechizo zoltrak");
    }

    @Override
    public void defender() {
        System.out.println("El mago defiende con hechizo de escudo");
    }
}
