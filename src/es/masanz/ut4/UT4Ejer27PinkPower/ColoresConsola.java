package es.masanz.ut4.UT4Ejer27PinkPower;

public class ColoresConsola {

    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CIAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";

    public void imprimirEnRojo(String texto){
        System.out.println(ROJO + texto + RESET);
    }
    public void imprimirEnVerde(String texto){
        System.out.println(VERDE + texto + RESET);
    }
    public void imprimirEnAmarillo(String texto){
        System.out.println(AMARILLO + texto + RESET);
    }
    public void imprimirEnAzul(String texto){
        System.out.println(AZUL + texto + RESET);
    }
    public void imprimirEnMagenta(String texto){
        System.out.println(MAGENTA + texto + RESET);
    }
    public void imprimirEnCian(String texto){
        System.out.println(CIAN + texto + RESET);
    }
    public void imprimirEnBlanco(String texto){
        System.out.println(BLANCO + texto + RESET);
    }
}
