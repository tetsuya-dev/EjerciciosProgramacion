package es.masanz.ut7.ejercicios.Ejer4BatallaPokemon;

public class Squirtle implements Pokemon, Agua{
    public String getNombre() { return "Squirtle"; }

    public void atacar(Pokemon enemigo) {
        System.out.println(getNombre() + " usa Pistola Agua contra " + enemigo.getNombre());
        enemigo.recibirAtaque(this);
    }

    public void aplicarResistencia(Pokemon agresor) {
        if (agresor instanceof Fuego) {
            System.out.println("  ¡Es poco eficaz! (Resistencia de Agua contra Fuego)");
        }
    }

    public void recibirAtaque(Pokemon agresor) {
        aplicarResistencia(agresor);
        System.out.println("  " + getNombre() + " ha recibido el golpe.");
    }
}
