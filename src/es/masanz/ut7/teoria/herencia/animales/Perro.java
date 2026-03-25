package es.masanz.ut7.teoria.herencia.animales;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, int numPatas, String color, String raza) {
        super(nombre, edad, numPatas, color);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace el sonido: (¡Guau, guau!)");
        super.hacerSonido();
    }

    @Override
    public void presentacion() {
        super.presentacion();
        System.out.println("Y soy un perro");
    }
}
