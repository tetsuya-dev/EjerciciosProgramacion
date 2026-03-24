package es.masanz.ut7.ejercicios.Ejer5.BatallaPokemon2.base;

public abstract class Pokemon {

    protected String name;
    protected int life;
    protected int attack;
    protected double defense;
    protected int speed;
    protected String special;
    protected int level;
    protected int xp;

    public Pokemon(int life, int attack, double defense, int speed, String special) {
        this.name = String.valueOf(this.getClass());
        this.life = life;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.special = special;
        this.level = 1;
        this.xp = 0;
    }

    public abstract void atacar(Pokemon enemigo);
    public abstract void recibirAtaque(Pokemon agresor, int cantidadDano);
    public abstract double aplicarResistencia(Pokemon agresor);

    public void apodar(String nombre){
        name = nombre;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", special='" + special + '\'' +
                ", level=" + level +
                ", xp=" + xp +
                '}';
    }
}
