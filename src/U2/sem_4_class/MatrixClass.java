package U2.sem_4_class;
import java.util.Scanner;

public class MatrixClass {
    int[][] matrix;
    
    public MatrixClass(int sizeX, int sizeY) {
        matrix = new int[sizeX][sizeY];
    }

    /**
     * Define el tamaño de la matriz, x y.
     * @param sizeX Tamaño X
     * @param sizeY Tamaño Y
     */
    public void defineSizeScanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el tamaño en X: ");
        int sX = input.nextInt();
        System.out.println("Ingresa el tamaño en Y: ");
        int sY = input.nextInt();
        input.close();
        matrix = new int[sX][sY];
    }

    /**
     * Muestra la matrín en un cuadrado insano.
     */
    public void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(String.format("%02d", matrix[i][j]) + " ");
            }
        }
    }
}