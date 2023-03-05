package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static char [] tablero = new char[7];

    public static void main(String[] args) {
        iniciarTablero();
        juego();
    }

    public static void iniciarTablero (){
        for (int i = 0; i < tablero.length; i++) {
            if (i == 3) {
                tablero[i] = ' ';
            }else if (i < 3){
                tablero[i] = '>';
            }else{
                tablero[i] = '<';
            }
        }
    }

    public static void mostrarTablero (){
        System.out.print("|1|2|3|4|5|6|7|\n|");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(tablero[i] + "|");
        }
        System.out.println("");
    }

    public static void movimiento(int pos) throws Exception {
        int movimiento = 0;
        if (pos > 0 && pos < 8) {
            pos--;
            if (tablero[pos] == '>') {
                if(tablero[pos + 1] == ' ') {
                    movimiento = 1;
                }else if (tablero[pos + 1] == '<' && tablero[pos + 2] == ' '){
                    movimiento = 2;
                } else {
                    System.out.println("No se puede mover esa posicion");
                    movimiento = 0;
                }
            } else if (tablero[pos] == '<') {
                if (tablero[pos - 1] == ' ') {
                    movimiento = -1;
                } else if (tablero[pos - 1] == '>' && tablero[pos - 2] == ' ') {
                    movimiento = -2;
                }else {
                    System.out.println("No se puede mover esa posicion");
                    movimiento = 0;
                }
            }else{
                System.out.println(("No se puede mover una posicion vacia"));
            }
        }else throw new Exception("No se puede mover esa posicion");
        mover(pos, movimiento);
    }

    public static void mover(int pos, int movimiento){
        if (movimiento != 0) {
            tablero[pos + movimiento] = tablero[pos];
            tablero[pos] = ' ';
        }
    }

    public static void juego() {
        Scanner sc = new Scanner(System.in);
        boolean bucle = true;
        do {
            mostrarTablero();
            System.out.println("Que posicion quieres mover? (-1 para salir, 0 para reiniciar): ");
            String pos = sc.nextLine();
            try {
                int posicion = Integer.parseInt(pos);
                switch (posicion){
                    case -1:
                        bucle = false;
                        break;
                    case 0:
                        iniciarTablero();
                        break;
                    default:
                        movimiento(posicion);
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println("No has introducido un numero");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (bucle);

    }
}