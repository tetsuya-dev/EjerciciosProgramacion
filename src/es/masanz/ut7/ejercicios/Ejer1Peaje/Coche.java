package es.masanz.ut7.ejercicios.Ejer1Peaje;

public class Coche extends Vehiculo{
    public Coche(String tipo, String color, String matrícula) {
        super(tipo, color, matrícula);
        tarifa = 5;
    }

    @Override
    public void pagarPeaje() {
        super.pagarPeaje();
    }
}
