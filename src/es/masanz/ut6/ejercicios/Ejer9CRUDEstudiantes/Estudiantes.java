package es.masanz.ut6.ejercicios.Ejer9CRUDEstudiantes;

public class Estudiantes {
    private String nombre;
    private int edad;
    private double notaMedia;

    public Estudiantes(String nombre) {
        this.nombre = nombre;
        this.edad = (int) (Math.random() * 99);
        this.notaMedia = (int) (Math.random() * 9.99);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
