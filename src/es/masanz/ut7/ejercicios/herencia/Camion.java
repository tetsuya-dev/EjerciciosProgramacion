package es.masanz.ut7.ejercicios.herencia;

public class Camion extends Vehiculo{

    public Camion(int potencia) {
        super(potencia, 8);
    }


    public void acelerar(int tiempo) {
        distanciaRecorrida = potencia*ruedas*tiempo;
    }

}
