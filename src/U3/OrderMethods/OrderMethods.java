package U3.OrderMethods;
import java.util.Scanner;

public class OrderMethods {
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
        mergeNatural(array, 0, length-1);
        System.out.println("---------------------- ARRAY ORDENADO ----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] orderInsection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int aux = array[i];

            while (pos > 0 && array[pos-1] > aux) {
                array[pos] = array[pos-1];
                pos--;
            }

            array[pos] = aux;
        }

        return array;
    }

    public static int[] orderBubble(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int actual_elm = array[i];
            int id2 = i;
            while ((id2 > 0) && (array[id2-1] < actual_elm)) {
                array[id2] = array[id2-1];
                id2--;
            }
            array[id2] = actual_elm;
        }

        return array;
    }

    public static int[] orderSelection(int[] array) {
        int min;
        int aux;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                min = j;
            }

            aux = array[i];
            array[i] = array[min];
            array[min] = aux;
        }

        return array;
    }

    public static int[] orderShell(int[] array) {
        int j, k, aux;
        int jump = array.length/2;

        while (jump > 0) {
            for (int i = jump; i < array.length; i++) {
                j = i - jump;
                while (j >= 0) {
                    k = j + jump;
                    if(array[j] <= array[k]) {
                        j = -1;
                    }else {
                        aux = array[j];
                        array[j] = array[k];
                        array[k] = aux;
                        j-=jump;
                    }
                }
            }

            jump/=2;
        }
        return array;
    }

    public static void mergeNatural(int[] array, int start, int end) {
        if(start < end) {
            int half = (start+end)/2;
            mergeNatural(array, start, half);
            mergeNatural(array, half+1, end);
            merge(array, start, half, end);
        }
    }

    public static void merge(int[] array, int start, int half, int end) {
        int n1 = half-start+1;
        int n2 = end-start;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < left.length; i++) {
            left[i] = array[start+i];
        }
        for (int i = 0; i <= right.length; i++) {
            right[i] = array[half+i+1];
        }

        int i = 0, j = 0, k = start;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            }else {
                array[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = right[i];
            j++;
            k++;
        }
    }
}
