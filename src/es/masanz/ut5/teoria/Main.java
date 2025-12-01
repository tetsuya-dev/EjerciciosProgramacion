package es.masanz.ut5.teoria;

public class Main {
    public static void main(String[] args) {

        DiaSemana diaSemana = DiaSemana.MARTES;

        if (diaSemana == DiaSemana.MARTES){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        DiaSemana[] diasDeLaSemana = DiaSemana.values();

        Dificultad nivel = Dificultad.MEDIO;

        int filas = nivel.getFilas();
        int columnas = nivel.getColumnas();
        int bombas = nivel.getBombas();
    }
}
