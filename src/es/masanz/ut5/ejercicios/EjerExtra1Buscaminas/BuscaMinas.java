package es.masanz.ut5.ejercicios.EjerExtra1Buscaminas;

public class BuscaMinas {

    private int[][] matriz;
    private int filas;
    private int columnas;
    private int bombas;

    public BuscaMinas(int filas, int columnas, int bombas) {
        matriz = new int[filas][columnas];
        this.bombas = bombas;
        colocarBomba();
        mostrarBuscaminas();
    }

    public void colocarBomba(){
        int contador = 0;
        while (contador!=bombas){
            int filaRandom = (int)(Math.random() * matriz.length);
            int columnaRandom = (int)(Math.random() * matriz[0].length);
            if (!comprobarBomba(filaRandom,columnaRandom)){
                matriz[filaRandom][columnaRandom] = -1;
            }
        }
    }

    private boolean comprobarBomba(int fila, int columna) {
        if (matriz[fila][columna] == -1){
            return true;
        }
        return false;
    }


    public void mostrarBuscaminas(){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                System.out.printf("%3d", matriz[fila][columna]);
            }
            System.out.println();
        }
    }

    public void colocarNumeros(){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                contarBombas(fila,columna);
            }
        }
    }

    private int contarBombas(int fila, int columna) {
        int cantidadBombas = 0;
        if (comprobarBomba(fila,columna)){
            return -1;
        } else {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (fila+i == fila && columna+j == columna){
                        continue;
                    } else if (fila+i < 0 || fila+i >= matriz.length || columna+i < 0 || columna+i >= matriz[0].length) {
                        continue;
                    }
                    if(comprobarBomba(fila+i,columna+j)){
                        cantidadBombas++;
                    }
                }
            }
        }
        return cantidadBombas;
    }




}
