package es.masanz.ut4.Ejercicio31;

public class Combate {

    private Robot robot1, robot2;

    public void combate() {

        robot1 = new Robot("Gipsy");
        robot2 = new Robot("Striker");



        System.out.println("Comienza el combate");

        while(robot1.getVida()>0 && robot2.getVida()>0) {

            System.out.println("Recalculando stats");

            robot1.actualizar();
            robot2.actualizar();

            System.out.println(robot1);
            System.out.println(robot2);

            System.out.println(robot1);
            System.out.println(robot2);

            robot1.atacar(robot2);
            robot2.atacar(robot1);

        }
        podio();

    }

    public void podio(){
        if(robot1.getVida() > robot2.getVida()){
            System.out.println(robot1.getNombre()+" se alza con la victoria");
        } else if (robot1.getVida() < robot2.getVida()) {
            System.out.println(robot2.getNombre()+" se alza con la victoria");
        } else {
            System.out.println("Ha sido un combate con empate");
        }
    }

}
