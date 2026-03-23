package es.masanz.ut7.ejercicios.Ejer1Peaje;

public class Camion extends Vehiculo{
    public Camion(String tipo, String color, String matrícula) {
        super(tipo, color, matrícula);
        tarifa = 7;
    }


    @Override
    public void pagarPeaje() {
        super.pagarPeaje();
    }
}
