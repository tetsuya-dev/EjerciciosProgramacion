package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon2;

public class Bulbasaur implements Pokemon, Planta {
    public String getNombre() { return "Bulbasaur"; }

    public void atacar(Pokemon enemigo) {
        System.out.println(getNombre() + " usa Látigo Cepa contra " + enemigo.getNombre());
        enemigo.recibirAtaque(this);
    }

    public void aplicarResistencia(Pokemon agresor) {
        if (agresor instanceof Agua) {
            System.out.println("  ¡Es poco eficaz! (Resistencia de Planta contra Agua)");
        }
    }

    public void recibirAtaque(Pokemon agresor) {
        aplicarResistencia(agresor);
        System.out.println("  " + getNombre() + " ha recibido el golpe.");
    }
}
