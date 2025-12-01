package es.masanz.ut5.ejercicios.Ejer28TallasRopa;

public class TallasRopa {
    public static void main(String[] args) {

        Talla[] tallas = Talla.values();

        for (Talla talla : tallas) {
            System.out.println(talla);
        }

    }
}
