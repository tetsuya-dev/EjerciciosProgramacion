package es.masanz.ut7.teoria.herencia.vehiculos;

public class Camion extends Vehiculo{

    public Camion(int potencia) {
        super(potencia, 8);
    }


    public void acelerar(int tiempo) {
        distanciaRecorrida = potencia*ruedas*tiempo;
    }

}
