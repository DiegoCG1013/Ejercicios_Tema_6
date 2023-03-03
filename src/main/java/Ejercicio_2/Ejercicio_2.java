package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    private static int filaMax = 4;
    private static int columnaMax = 4;
    static char[][] tablero = new char[filaMax][columnaMax];
    static int filaBarco, columnaBarco;

    public static void main(String[] args) {
        initializarTablero();
        do {
            mostrarTablero();
        }while (!disparar());
        mostrarTablero();
    }

    public static void initializarTablero (){
        for (int i = 0; i < filaMax; i++) {
            for (int j = 0; j < columnaMax; j++) {
                tablero[i][j] = '*';
            }
        }
        filaBarco = (int) (Math.random() * 4);
        columnaBarco = (int) (Math.random() * 4);
    }

    public static void mostrarTablero(){
        for (int i = 0; i < filaMax; i++) {
            for (int j = 0; j < columnaMax; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int introducirEnteroEntreLimites(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Introduce un número entre " + min + " y " + max);
            num = sc.nextInt();
        } while (num < min || num > max);
        return num - 1;
    }
    public static boolean disparar() {
        boolean ganador = false;
        System.out.println("Introduce la fila: ");
        int fila = introducirEnteroEntreLimites(1, filaMax);
        System.out.println("Introduce la columna: ");
        int columna = introducirEnteroEntreLimites(1, columnaMax);
        if (tablero[fila][columna] == '*') {
            if (fila == filaBarco && columna == columnaBarco) {
                tablero[fila][columna] = 'X';
                ganador = true;
                System.out.println("Has ganado");
            } else {
                tablero[fila][columna] = 'O';
                System.out.println("Agua");
            }
        } else {
            System.out.println("Ya has disparado en esa celda");
        }
        return ganador;
    }
}
