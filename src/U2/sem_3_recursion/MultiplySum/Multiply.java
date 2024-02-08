package U2.sem_3_recursion.MultiplySum;

public class Multiply {
    public static float mult(float n1, float n2) {
        if(n1 == 0 || n2 == 0) return 0;
        if(n2 < 1) {
            return n1;
        }else {
            return mult(n1, n2-1)+n1;
        }
    }
}
