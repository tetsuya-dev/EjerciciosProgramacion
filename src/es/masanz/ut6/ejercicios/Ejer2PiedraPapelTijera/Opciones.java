package es.masanz.ut6.ejercicios.Ejer2PiedraPapelTijera;

import javax.print.DocFlavor;

public enum Opciones {

    Piedra(2),
    Papel(0),
    Tijera(1);

    private int ganoContra;

    Opciones(int ganoContra){
        this.ganoContra = ganoContra;
    }

    public int jugar(Opciones enemigo){


        return 0;
    }


//    public int gana(Opciones maquina, Opciones usuario){
//        // GANA MAQUINA
//        if (maquina.equals(Piedra) && usuario.equals(Tijera)){
//            return 1;
//        }
//        if (maquina.equals(Papel) && usuario.equals(Piedra)){
//            return 1;
//        }
//        if (maquina.equals(Tijera) && usuario.equals(Papel)){
//            return 1;
//        }
//
//        // GANA USUARIO
//        if (usuario.equals(Piedra) && maquina.equals(Tijera)){
//            return 2;
//        }
//        if (usuario.equals(Papel) && maquina.equals(Piedra)){
//            return 2;
//        }
//        if (usuario.equals(Tijera) && maquina.equals(Papel)){
//            return 2;
//        }
//
//        return 0;
//    }
}
