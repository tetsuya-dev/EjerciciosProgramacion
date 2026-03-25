package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon3.base;

public abstract class Pokemon {

    protected String apodo;
    protected int vida, ataque, defensa, velocidad, especial;
    protected int nivel;
    protected int pExperiencia;

    public Pokemon(int vida, int ataque, int defensa, int velocidad, int especial) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.especial = especial;
        this.nivel = 1;
        this.pExperiencia = 0;
        this.apodo = null;
    }

    public void apodar(String apodo){
        this.apodo = apodo;
    }

    public abstract void atacar(Pokemon enemigo);

    public abstract void recibirAtaque(Pokemon agresor, int cantidadDano);

    public abstract double aplicarResistencia(Pokemon agresor);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Info. de Pokemon "+getClass().getSimpleName()+":\n"));
        if(apodo!=null){
            sb.append(String.format("   %-20s\n", "apodo: "+apodo));
        }
        sb.append(String.format("   %-20s\n", "vida: "+vida));
        sb.append(String.format("   %-20s\n", "ataque: "+ataque));
        sb.append(String.format("   %-20s\n", "defensa: "+defensa));
        sb.append(String.format("   %-20s\n", "velocidad: "+velocidad));
        sb.append(String.format("   %-20s\n", "especial: "+especial));
        return sb.toString();
    }

    @Override
    protected Pokemon clone() throws CloneNotSupportedException {
        return new Pokemon(this.vida, this.ataque, this.defensa, this.velocidad, this.especial) {
            @Override
            public void atacar(Pokemon enemigo) {

            }

            @Override
            public void recibirAtaque(Pokemon agresor, int cantidadDano) {

            }

            @Override
            public double aplicarResistencia(Pokemon agresor) {
                return 0;
            }
        };

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }
}
