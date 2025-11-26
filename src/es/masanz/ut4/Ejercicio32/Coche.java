package es.masanz.ut4.Ejercicio32;

public class Coche {
    private String coche;
    private int velocidad;
    private int distancia;

    public Coche(String coche) {
        this.coche = coche;
        this.distancia = 0;
    }

    public void calcularVelocidad(){
        velocidad = (int)(Math.random() * 20) + 5;
    }

    public void calcularDistancia(){
        distancia += velocidad;
    }

    @Override
    public String toString() {
        return coche + " avanza "+ velocidad + " metros. Total: " + distancia;
    }

    // region Getter Setters
    public String getCoche() {
        return coche;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    // endregion
}
