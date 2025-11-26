package es.masanz.ut4.Ejercicio31;

public class Robot {

    public String nombre;
    public int vida;
    public int ataque;
    public int defensa;

    public Robot(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.ataque = (int) (Math.random() * 10) + 5;
        this.defensa = (int) (Math.random() * 10) + 5;
    }

    public void actualizar(){
        ataque = (int) (Math.random() * 10) + 5;
        defensa = (int) (Math.random() * 10) + 5;
    }

    public void atacar(Robot oponente){
        if (ataque > oponente.defensa) {
            oponente.vida = oponente.vida - (ataque - oponente.defensa);
            if (oponente.vida <= 0) {
                oponente.vida = 0;
                System.out.println("GRRR..." + oponente.nombre + " PERDER COMBATE...BSSSS");
            }
        }
    }

    @Override
    public String toString() {
        String s = "Los stats de " + nombre + " son:";
        s += "\n\tvida: " + vida;
        s += "\n\tataque: " + ataque;
        s += "\n\tdefensa: " + defensa;

        return s;
    }

    // region Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    // endregion
}

