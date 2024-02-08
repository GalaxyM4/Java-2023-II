package U2.sem_3_recursion.SubstractionDiv;
import java.util.Scanner;

import Utils.PrintColor;

public class MainD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintColor.printColor("Ingresa el numerador: ", PrintColor.YELLOW);
        int num = input.nextInt();
        PrintColor.printColor("Ingresa el denominador: ", PrintColor.YELLOW);
        int den = input.nextInt();
        input.close();
        System.out.println(Division.div(num, den));
    }
}
