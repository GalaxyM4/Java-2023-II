package U2.sem_3_recursion.Euclides;
import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int n1 = input.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int n2 = input.nextInt();
        input.close();
        var mcd = euclid(n1, n2);
        System.out.println("\nEl MCD de los números es: " + mcd);
    }

    public static int euclid(int n1, int n2) {
        int res = n1%n2;
        System.out.print(n1 + " ");
        if(res == 0) {
            System.out.print(n2);
            return n2;
        }else {
            return euclid(n2, res);
        }
    }
}
