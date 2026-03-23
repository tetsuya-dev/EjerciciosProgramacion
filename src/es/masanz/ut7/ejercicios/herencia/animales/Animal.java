package es.masanz.ut7.ejercicios.herencia.animales;

public class Animal {

    protected String nombre;
    protected int edad;
    protected int numPatas;
    protected String color;

    public Animal() {
    }

    public Animal(String nombre, int edad, int numPatas, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.numPatas = numPatas;
        this.color = color;
    }

    public void presentacion(){
        System.out.println("Soy " + nombre + " tengo " + edad + " años, ademas soy de color " + color + " y tengo " + numPatas + " patas");
    }

    public void hacerSonido(){
        System.out.println(nombre + " hace el sonido: (...)");
    }
}
