package es.masanz.ut7.teoria.herencia.vehiculos;

public class Moto extends Vehiculo {

    public Moto(int potencia) {
        super(potencia, 2);
    }

    public void acelerar(int tiempo) {
        distanciaRecorrida = potencia*ruedas*tiempo;
    }
}
