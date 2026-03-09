package es.masanz.ut6.teoria.Prueba;

public class Cosa {
    private String nombre;

    public Cosa(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String xx) {
        nombre = xx;
    }

    @Override
    public String toString() {
        return "Cosa{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
