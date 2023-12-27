package sem_2.Tarea.Executables;
import java.util.Scanner;

import sem_2.Tarea.ClassObj.TRIANGULO;

public class MainT {

    public static void main(String[] args) {
        Scanner tri = new Scanner(System.in);
        TRIANGULO t1 = new TRIANGULO("JuanitoElMasCapito", 1, 2, 3);
        
        System.out.println("Unecino, ingesa tu nombre: ");
		t1.setPololo(tri.nextLine());
		
		System.out.println("Ingresa un lado 1: ");
		t1.setL1(tri.nextInt());
		
		System.out.println("Ingresa un lado 2: ");
		t1.setL2(tri.nextInt());
		
		System.out.println("Ingresa un lado 3: ");
		t1.setL3(tri.nextInt());
		
		tri.close();
        t1.consola();
    }
}
