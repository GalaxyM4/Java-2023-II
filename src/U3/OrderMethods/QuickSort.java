package U3.OrderMethods;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el largo del array: ");
        int length = input.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingresa el elemento de posición " + i + ": ");
            array[i] = input.nextInt();
        }
        
        input.close();
        sort(array, 0, length-1);
        System.out.println("---------------------- ARRAY ORDENADO ----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sort(int[] array, int start, int end) {
        if(start >= end) return;
        int pivot = array[start];
        int elmL = start + 1;
        int elmR = end;

        while (elmL <= elmR) {
            while (elmL <= end && array[elmL] < pivot) {
                elmL++;
            }

            while (elmR > start && array[elmR] >= pivot) {
                elmR--;
            }

            if (elmL < elmR) {
                var temp = array[elmL];
                array[elmL] = array[elmR];
                array[elmR] = temp;
            }
        }

        if(elmR > start){
            int temp = array[start];
            array[start]=array[elmR];
            array[elmR]=temp;
    }
    }
}
