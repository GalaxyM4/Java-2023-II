package U2.sem_2_arrays2.Bidimensionales;
import java.util.Scanner;
import Utils.PrintColor;

public class MatrixRnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hola soy juanito el mas insano.");
        PrintColor.printColor("Hola casusa, la longitud en x de la matriz: ", PrintColor.YELLOW);
        int lx = input.nextInt();
        PrintColor.printColor("Hola casusa, la longitud en y de la matriz: ", PrintColor.YELLOW);
        int ly = input.nextInt();
        PrintColor.printColor("Inserta el límite de los numeros random: ", PrintColor.YELLOW);
        int limit = input.nextInt();
        int m[][] = new int[lx][ly];
        int length_x = m.length;
        int length_y = m[0].length;
        for (int x = 0; x < length_x; x++) {
            for (int y = 0; y < length_y; y++) {
                m[x][y] = (int)(Math.random()*limit);
            }
        }
        input.close();
        Matrix.print_matrix2d(m);
    }
}
