package U2.exam_u2.ej2;

import java.util.Scanner;
import Utils.PrintColor;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el número: ");
        int n = input.nextInt();
        PrintColor.printlnColor("La suma de cifras es: "+sumD(n), PrintColor.GREEN);
        input.close();
    }

    public static int sumD(int number) {
        int div = number;
        
        if(number < 10) {
            return div%10;
        }else {
            int cifra = div%10;
            return sumD(div/10)+cifra;
        }
    }
}
