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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
