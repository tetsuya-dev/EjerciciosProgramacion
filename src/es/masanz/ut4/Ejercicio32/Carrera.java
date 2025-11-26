package es.masanz.ut4.Ejercicio32;

public class Carrera {

    private Coche coche1, coche2;



    public void carrera() {
        coche1 = new Coche("Rayo");
        coche2 = new Coche("Trueno");

        for (int i = 0; i < 10; i++) {
            coche1.calcularVelocidad();
            coche2.calcularVelocidad();

            coche1.calcularDistancia();
            coche2.calcularDistancia();

            System.out.println(coche1.toString());
            System.out.println(coche2.toString());
            System.out.println();
        }
        podio();

    }
    public void podio(){
        if (coche1.getDistancia() > coche2.getDistancia()) {
            System.out.println(coche1.getCoche() + " gana la carrera!");
        } else if (coche2.getDistancia() > coche1.getDistancia()) {
            System.out.println(coche2.getCoche() + " gana la carrera!");
        } else {
            System.out.println("Empate en la carrera!");
        }
    }
}
