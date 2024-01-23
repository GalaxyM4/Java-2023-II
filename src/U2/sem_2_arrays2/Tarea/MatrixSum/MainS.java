package U2.sem_2_arrays2.Tarea.MatrixSum;

import java.util.Scanner;

// derechos de autor a deniss 🐒
public class MainS {
    public static void main(String[] args) {
        int filasw;
        int columnas;
        do {
            System.out.print("Número de filas: ");
            filasw = leerEntero();
        } while (filasw < 1);

        do {
            System.out.print("Número de columnas: ");
            columnas = leerEntero();
        } while (columnas < 1);

        // crear las matrices A y B
        int[][] A = crearMatriz(filasw, columnas);
        int[][] B = crearMatriz(filasw, columnas);

        System.out.println("matriz A:");
        llenarMatriz(A);
        System.out.println("matriz B:");
        llenarMatriz(B);

        int[][] C = sumarMatrices(A, B);

        // mostrar resultados
        System.out.println("matriz A:");
        mostrarMatriz(A);
        System.out.println("\nmatriz B:");
        mostrarMatriz(B);
        System.out.println("\nmatriz Suma:");
        mostrarMatriz(C);
    }

    // método para crear una matriz insana
    public static int[][] crearMatriz(int f, int c) {
        int[][] M = new int[f][c];
        return M;
    }

    // método para leer un número entero por teclado uwu
    public static int leerEntero() {
        try (Scanner luis = new Scanner(System.in)) {
            int n = luis.nextInt();
            return n;
        }
    }

    // método para llenar una matriz waza
    public static void llenarMatriz(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                M[i][j] = leerEntero();
            }
        }
    }

    public static void mostrarMatriz(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.printf("%3d", M[i][j]);
            }
            System.out.println();
        }
    }

    // método para sumar dos matrices por narnia
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
	    int[][] c = crearMatriz(a.length, a[0].length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
	}
}