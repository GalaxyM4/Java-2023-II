package U2.sem_3_recursion.SubstractionDiv;

import Utils.PrintColor;

public class Division {
    public static int div(int num, int den) {
        if(den == 0) {
            throw new Error(PrintColor.RED + "El denominador tiene que ser diferente de 0" + PrintColor.RESET);
        }
        if(den > num) {
            return 0;
        }else {
            return div(num-den, den)+1;
        }
    }
}
