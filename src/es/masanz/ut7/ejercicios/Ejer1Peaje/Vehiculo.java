package es.masanz.ut7.ejercicios.Ejer1Peaje;

public class Vehiculo {
    protected String tipo;
    protected String color;
    protected String matrícula ;
    protected int tarifa;
    protected int saldo;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String color, String matrícula) {
        this.tipo = tipo;
        this.color = color;
        this.matrícula = matrícula;
        this.saldo = 20;
    }

    public void pagarPeaje(){
        saldo = saldo - tarifa;
    }
}
