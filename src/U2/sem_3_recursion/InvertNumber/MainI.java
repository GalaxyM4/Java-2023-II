package U2.sem_3_recursion.InvertNumber;

import java.util.Scanner;

public class MainI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        Invert.invert(number);
    }
}
