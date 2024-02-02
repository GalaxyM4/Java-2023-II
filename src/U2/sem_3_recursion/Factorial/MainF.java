package U2.sem_3_recursion.Factorial;
import java.util.Scanner;
import Utils.PrintColor;

public class MainF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintColor.printColor("Ingresa el número: ", PrintColor.CYAN);
        var a = input.nextInt();
        input.close();
        var x = FactorialFunction.fact(a);
        PrintColor.printlnColor("El factorial es: "+x, PrintColor.YELLOW);
    }
}
