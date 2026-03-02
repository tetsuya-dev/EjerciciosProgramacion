package es.masanz.ut7.ejercicios.herencia;

public abstract class Vehiculo {
    protected int potencia;
    protected int ruedas;
    protected int distanciaRecorrida;

    public Vehiculo(int potencia, int ruedas) {
        this.potencia = potencia;
        this.ruedas = ruedas;
        this.distanciaRecorrida = 0;
    }

    public abstract void acelerar(int tiempo);

    @Override
    public String toString() {

        return "Vehiculo"+getClass().getName()+"{" +
                "potencia=" + potencia +
                ", ruedas=" + ruedas +
                ", distanciaRecorrida=" + distanciaRecorrida +
                '}';
    }
}
