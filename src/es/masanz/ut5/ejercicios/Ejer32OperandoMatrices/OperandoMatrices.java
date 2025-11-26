package es.masanz.ut5.ejercicios.Ejer32OperandoMatrices;

import java.util.Scanner;

public class OperandoMatrices {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        for (int fila = 0; fila < a.length; fila++) {
            for (int col = 0; col < a[0].length; col++) {
                a[fila][col] = (int)(Math.random()*10);
            }
        }
        for (int fila = 0; fila < b.length; fila++) {
            for (int col = 0; col < b[0].length; col++) {
                b[fila][col] = (int)(Math.random()*10);
            }
        }
        for (int fila = 0; fila < c.length; fila++) {
            for (int col = 0; col < c[0].length; col++) {
                c[fila][col] = (int)(Math.random()*10);
            }
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("* OPCIONES DISPONIBLES *");
        System.out.println("************************");
        System.out.println("* 1. Sumar             *");
        System.out.println("* 2. Restar            *");
        System.out.println("* 3. Multiplicacion    *");
        System.out.println("* 4. Division          *");
        System.out.println("************************");
        System.out.print("Introduce una opcion: ");
        int n = scanner.nextInt();

        switch (n){
            case 1:
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a.length; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
                break;
            case 2:
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a.length; j++) {
                        c[i][j] = a[i][j] - b[i][j];
                    }
                }
                break;
            case 3:
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a.length; j++) {
                        c[i][j] = a[i][j] * b[i][j];
                    }
                }
                break;
            case 4:
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        if (b[i][j] != 0) {
                            c[i][j] = a[i][j] / b[i][j];
                        } else {
                            c[i][j] = 0;
                        }
                    }
                }
                break;
        }
        System.out.println("Matriz A");
        for (int fila = 0; fila < a.length; fila++) {
            for (int col = 0; col < a[0].length; col++) {
                System.out.print(a[fila][col]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriz B");
        for (int fila = 0; fila < b.length; fila++) {
            for (int col = 0; col < b[0].length; col++) {
                System.out.print(b[fila][col]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriz C");
        for (int fila = 0; fila < c.length; fila++) {
            for (int col = 0; col < c[0].length; col++) {
                System.out.print(c[fila][col]+" ");
            }
            System.out.println();
        }
    }
    
    

}
