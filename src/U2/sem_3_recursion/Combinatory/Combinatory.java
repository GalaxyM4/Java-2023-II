package U2.sem_3_recursion.Combinatory;
import U2.sem_3_recursion.Factorial.FactorialFunction;

public class Combinatory {
    public static <T> int comb_elements(int group, T[] list) {
        int n = list.length;
        int g = group;
        int n_fac = FactorialFunction.fact(n);
        int g_fac = FactorialFunction.fact(g);
        int ng_fac = FactorialFunction.fact(n-g);
        int ret = n_fac/(ng_fac*g_fac);

        return ret;
    }
}