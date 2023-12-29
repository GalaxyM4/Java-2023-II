package sem_3.executable;
import sem_3.Class.Triangle;
import java.util.Scanner;
import sem_3.Class.Circle;

public class MainF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l1, l2, l3;
        int radius;
        System.out.println(" --------------- TRIÁNGULO ---------------");
        System.out.println("Inserte lado 1 triangulo.");
        l1 = input.nextInt();
        System.out.println("Inserte lado 2 triangulo.");
        l2 = input.nextInt();
        System.out.println("Inserte lado 3 triangulo.");
        l3 = input.nextInt();
        Triangle t = new Triangle(l1, l2, l3);
        t.showArea();
        t.showPerimeter();
        System.out.println(" --------------- CÍRCULO ---------------");
        System.out.println("Inserte radio.");
        radius = input.nextInt();
        Circle c = new Circle(radius);
        c.showArea();
        c.showPerimeter();
        input.close();
    }   
}
