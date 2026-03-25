package es.masanz.ut7.teoria.herencia.animales;

public class Main {
    public static void main(String[] args) {
        Animal pajaro = new Animal("Pajaroto",2,2,"rojo");
        Animal perro = new Perro("Lula",4,4,"amarillo","Huski");

        pajaro.hacerSonido();
        perro.hacerSonido();

        pajaro.presentacion();
        perro.presentacion();

    }
}
