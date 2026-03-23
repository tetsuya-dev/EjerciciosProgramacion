package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon2;

public class Charmander implements Pokemon, Fuego {
    public String getNombre() { return "Charmander"; }

    public void atacar(Pokemon enemigo) {
        System.out.println(getNombre() + " lanza brasas a " + enemigo.getNombre());
        enemigo.recibirAtaque(this);
    }

    public void aplicarResistencia(Pokemon agresor) {
        if (agresor instanceof Planta) {
            System.out.println("  ¡Es poco eficaz! (Resistencia de Fuego contra Planta)");
        }
    }

    public void recibirAtaque(Pokemon agresor) {
        aplicarResistencia(agresor);
        System.out.println("  " + getNombre() + " ha recibido el golpe.");
    }
}
