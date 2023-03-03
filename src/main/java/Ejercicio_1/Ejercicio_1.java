package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("El mayor de los dos números es: " + mayor(num1, num2));
        System.out.println("Comparacion: " + comparar(num1, num2));
    }

public static double mayor(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
public static int comparar(double num1, double num2) {
    if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }
}

