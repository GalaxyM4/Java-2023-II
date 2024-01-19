package U2.sem_2_arrays2.Unidimensionales;
import java.util.Scanner;
import Utils.PrintColor;

public class Arrays_One {
    public static void main(String[] args) {
        ej2();
    }

    public static void ej1() {
        Scanner input = new Scanner(System.in);
        PrintColor.printColor("Inserta el largo del array: ", PrintColor.GREEN);
        int length = input.nextInt();
        
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
        input.close();
        PrintColor.printlnColor("Números aleatorios: ", PrintColor.GREEN);
        for (int i = 0; i < array.length; i++) {           
            System.err.println("array["+i+"] = " + array[i]);
        }
    }

    public static void ej2() {
        int[] cantidad = new int[]{0,0,0,0,0,0};
        for (int i = 0; i < 60000; i++) {
            int dado = (int)(Math.random()*6);
            cantidad[dado]++;
        }

        for (int i = 0; i < cantidad.length; i++) {
            System.out.println("El número " + (i+1) + " salió " + cantidad[i] + " veces.");
        }
    }
}
