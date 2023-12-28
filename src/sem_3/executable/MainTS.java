package sem_3.executable;
import java.util.Scanner;
import sem_3.Class.*;

public class MainTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserta capacidad.");
        int cap = input.nextInt();
        System.out.println("Inserta placa.");
        String placa = input.next();
        System.out.println("Inserta inserta color.");
        String color = input.next();
        input.close();
        System.out.println(" -------------- Avión -------------- ");
        Plane a = new Plane(cap, placa, color);
        a.run(); //y ahora va a aparecer avión
        a.stop();
        a.planear(); //planear xdxd
        a.show_all();
    }
}