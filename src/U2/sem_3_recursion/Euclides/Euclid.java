package U2.sem_3_recursion.Euclides;

public class Euclid {
    public static int euclid(int n1, int n2) {
        int res = n1%n2;
        if(res == 0) {
            return n2;
        }else {
            return euclid(n2, res);
        }
    }
}
