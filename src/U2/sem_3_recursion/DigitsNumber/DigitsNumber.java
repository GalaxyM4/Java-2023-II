package U2.sem_3_recursion.DigitsNumber;

public class DigitsNumber {
    int count = 1;
    public void show(int n) {
        int div = n/10;
        int res = n%10;

        System.out.println(res);
        if(div != 0) {
            n = div;
            show(n);
            this.count++;
        }
    }
}