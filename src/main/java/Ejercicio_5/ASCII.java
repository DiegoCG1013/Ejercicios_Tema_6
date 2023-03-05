package Ejercicio_5;

import java.util.Scanner;

public class ASCII {
    public static char[][] obra = new char[10][40];
    public static char caracter;


    public static void iniciarObra(){
        for (int i = 0; i < obra.length; i++) {
            for (int j = 0; j < obra[i].length; j++) {
                obra[i][j] = ' ';
            }
        }
    }

    public static void setColor(char color) {
        caracter = color;
        for (int i = 0; i < obra.length; i++) {
            for (int j = 0; j < obra[i].length; j++) {
                if (obra[i][j] != ' ') {
                    obra[i][j] = caracter;
                }
            }
        }
    }

    public static void pintar(int x, int y){
        obra[y][x] = caracter;

    }

    public static void pintarRectangulo() {
        for (int i = 0; i < obra.length; i++) {
            for (int j = 0; j < obra[i].length; j++) {
                if (i == 0 || i == obra.length - 1) {
                    obra[i][j] = caracter;
                }else if (j == 0 || j == obra[i].length - 1) {
                    obra[i][j] = caracter;
                }
            }
        }
    }



    public static void mostrarObra(){
        for (int i = 0; i < obra.length; i++) {
            for (int j = 0; j < obra[i].length; j++) {
                System.out.print(obra[i][j]);
            }
            System.out.println("");
        }
    }



    public static void main(String[] args) {
        iniciarObra();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Dibujar un carácter.\n\n2. Dibujar un rectángulo con un conjunto de caracteres.\n" +
                    "\n3. Cambiar \"el color\"\n\n4. Salir");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    try {
                        System.out.println("Introduce la posicion x");
                        int x = sc.nextInt();
                        System.out.println("Introduce la posicion y");
                        int y = sc.nextInt();
                        pintar(x, y);
                    }catch (Exception e){
                        System.out.println("No has introducido un numero o este no es valido");
                    }
                    break;
                case "2":
                    pintarRectangulo();
                    break;
                case "3":
                    System.out.println("Introduce el caracter");
                    char caracter3 = sc.next().charAt(0);
                    setColor(caracter3);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            mostrarObra();
        } while (true);
    }
}
