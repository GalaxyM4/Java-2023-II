package U2.sem_3_recursion.Recursion;
public class RShow {
    public void show(int x) {
        System.out.println(x);
        x++;
        if(x <= 10) {
            show(x);
        }
    }
}
