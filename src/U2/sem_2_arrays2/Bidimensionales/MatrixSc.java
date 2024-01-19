package U2.sem_2_arrays2.Bidimensionales;
import java.util.Scanner;
import Utils.PrintColor;

public class MatrixSc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hola soy juanito el mas insano.");
        PrintColor.printColor("Hola casusa, la longitud en x de la matriz: ", PrintColor.YELLOW);
        int lx = input.nextInt();
        PrintColor.printColor("Hola casusa, la longitud en y de la matriz: ", PrintColor.YELLOW);
        int ly = input.nextInt();
        int m[][] = new int[lx][ly];
        int length_x = m.length;
        int length_y = m[0].length;
        for (int x = 0; x < length_x; x++) {
            for (int y = 0; y < length_y; y++) {
                PrintColor.printColor("Hola casusa, ["+x+"]"+"["+y+"]: ", PrintColor.GREEN);
                m[x][y] = input.nextInt();
            }
        }
        input.close();
        Matrix.print_matrix2d(m);
    }

    public static void print_matrix2d(int[][] matrix) {
        int length_x = matrix.length;
        int length_y = matrix[0].length;
        for (int x = 0; x < length_x; x++) {
            for (int y = 0; y < length_y; y++) {
                if(y == length_y-1) {
                    if(matrix[x][y] <= 9) {
                        System.out.println("0"+matrix[x][y]);
                    }else {
                        System.out.println(matrix[x][y]);
                    };
                }else {
                    if(matrix[x][y] <= 9) {
                        System.out.print("0"+matrix[x][y] + " ");
                    }else {
                        System.out.print(matrix[x][y] + " ");
                    }
                }
                
            }
        }
    }
}
