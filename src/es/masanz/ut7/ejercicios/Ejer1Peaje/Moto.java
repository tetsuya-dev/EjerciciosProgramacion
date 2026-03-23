package es.masanz.ut7.ejercicios.Ejer1Peaje;

public class Moto extends Vehiculo{
    public Moto(String tipo, String color, String matrícula) {
        super(tipo, color, matrícula);
        tarifa = 2;
    }

    @Override
    public void pagarPeaje() {
        super.pagarPeaje();
    }
}
