package U2.sem_2_arrays2.Bidimensionales;
import java.util.Scanner;
import Utils.PrintColor;

public class MatrixTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hola soy juanito el mas insano.");
        int c = 0;
        PrintColor.printColor("Inserta la cantidad de arrays: ", PrintColor.YELLOW);
        int limit_arrays = input.nextInt();
        while(c<limit_arrays) {
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
            Matrix.print_matrix2d(m);
        }
        input.close();
    }
}
