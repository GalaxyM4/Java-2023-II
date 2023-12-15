package sem_1;
import java.util.Scanner;

public class ArraysS1 {
    public static void by_number() {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void  by_loop() {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length ; i++) {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }

    public static void two_by_two() {
        for(int i = 0 ; i < 9 ; i++) {
            System.err.println((i+1)*2);
        }
    }

    public static void choicexdxd() {
        Scanner input = new Scanner(System.in);
        int limit;
        int[] numbers;
        System.out.println("Habla causa, inserta el límite:");
        limit = input.nextInt();
        numbers = new int[limit];
        input.close();
        for(int i = 1; i <= limit; i++) {
            numbers[i] = i;
            System.out.println(i);
        }
    }
}