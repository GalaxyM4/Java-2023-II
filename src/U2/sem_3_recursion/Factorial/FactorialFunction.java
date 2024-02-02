package U2.sem_3_recursion.Factorial;

import Utils.PrintColor;

public class FactorialFunction {
    public static int fact(int n) {
        if(n < 0) {
            throw new Error(PrintColor.RED+"El factorial tiene por dominio los Z+."+PrintColor.RESET);
        };
        if(n == 0) return 1;
        if(n == 1) {
            return 1;
        }else {
            return fact(n-1)*(n);
        }
    }
}
