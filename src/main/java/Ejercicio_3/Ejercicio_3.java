package Ejercicio_3;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int[] tabla = crearTabla(0, 100);
        int mayor = mayor(tabla);
        System.out.println("El mayor es: " + mayor);
    }


    public static int[] crearTabla(int min, int max) {
        int[] tabla = new int[10];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = min + 1 + (int) (Math.random() * (max - min - 1));
        }
        return tabla;
    }

    public static int mayor(int[] tabla) {
        int mayor = tabla[0];
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
        }
        return mayor;
    }
}
