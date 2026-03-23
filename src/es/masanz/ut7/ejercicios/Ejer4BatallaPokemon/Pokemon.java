package es.masanz.ut7.ejercicios.Ejer4BatallaPokemon;

public interface Pokemon {

    void atacar(Pokemon enemigo);
    void recibirAtaque(Pokemon agresor);
    String getNombre();
}
