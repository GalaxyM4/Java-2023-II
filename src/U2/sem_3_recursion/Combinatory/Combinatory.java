package U2.sem_3_recursion.Combinatory;
import java.util.Scanner;
import U2.sem_3_recursion.Factorial.FactorialFunction;

public class Combinatory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la longitud de la lista.");
        Integer[] list = new Integer[input.nextInt()];
        System.out.println("Ingresa el tamaño de los grupos.");
        int group = input.nextInt();
        input.close();
        ///
        System.out.println("Las combinaciones posibles son: " + comb_elements(group, list));

    }

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