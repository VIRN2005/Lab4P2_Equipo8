package lab4p2.víctorromero;

import java.util.Random;
import java.util.Scanner;

public class Lab4P2VíctorRomero {

    static Scanner read = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        System.out.println("Gerardo Cano - 12151024");
        System.out.println("Victor Romero - 12211079\n");

        int[][] numeros = new int[8][8];
        int[][] numero = lectura(8, 8);

        System.out.println(imprimir(numero));
    }

    public static int[][] lectura(int fila, int columna) {
        int[][] temporal = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                temporal[i][j] = 0;
            }
        }
        return temporal;
    }

    public static String imprimir(int[][] numero) {
        String cadena = "";
        System.out.println("  A   B   C   D   E   F   G   H ");
        for (int i = 0; i < numero.length; i++) {
//            System.out.println(i);
            for (int j = 0; j < numero[i].length; j++) {
                cadena += "[" + " " + "]" + " ";
            }

            System.out.println(i + 1);
            cadena += "\n";
        }

        return cadena;
    }
}
