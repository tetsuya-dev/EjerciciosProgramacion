package es.masanz.ut5.teoria;

public enum Dificultad {

    FACIL(10,10,10),
    MEDIO(10,10,20),
    DIFICIL(15,15,30);

    private final int filas;
    private final int columnas;
    private final int bombas;


    Dificultad(int filas, int columnas, int bombas) {
        this.filas = filas;
        this.columnas = columnas;
        this.bombas = bombas;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getBombas() {
        return bombas;
    }
}
