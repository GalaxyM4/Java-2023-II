package U2.sem_3_recursion.InvertNumber;

import Utils.PrintColor;

public class Invert {
    public static void invert(int n) {
        int div = n/10;
        int res = n%10;

        PrintColor.printColor("El número invertido es: "+res, PrintColor.GREEN);
        if(div != 0) {
            n = div;
            invert(n);
        }
    }
}
