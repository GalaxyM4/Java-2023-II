package U3.Search;

import java.util.Scanner;
import U3.OrderMethods.OrderMethods;

public class SearchMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el largo del array: ");
        int length = input.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingresa el elemento de posición " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.println("Ordenando elemento...");
        int[] orderArray = OrderMethods.orderBubble(array);
        System.out.println(" ---------------------------- Arrays Elementos ---------------------------- ");
        showArray(orderArray);
        System.out.print("Ahora ingresa el elemento a buscar: ");
        int elm = input.nextInt();
        int search = binarySearch(orderArray, elm);

        if( search > 0) {
            System.out.println("El elemento "+ elm +" SI existe y está en la posición " + search);
        }else {
            System.out.println("El elemento no existe");
        }
        input.close();
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento de posición " + i + ": " + array[i]);
        }
    }
    
    public static int progresiveSearch(int[] array, int elm) {
        for (int i = 0; i < array.length; i++) {
            if(elm == array[i]) return i;
        }

        return -1;
    }

    public static int binarySearch(int[]array, int elm) {
		int left = 0; 
		int right = array.length - 1; 

		while(left<=right) {
			int half = (left+right)/2;
			
			if(array[half] == elm) {
				return half;
			}

			if(array[half] < elm) {
				left = half+1;
			}else {
				right = half-1;
			}
		}
		return -1;
	}

    public static int recursiveSearch(int[]array, int elm, int left, int right) {
		if(left <= right) {
			int half = left + (right-left) / 2;

			if(elm==array[half]) {
				return half;
			}
			
			if(array[half] < elm) {
				return recursiveSearch(array, elm, half+1, right);
			}else {
				return recursiveSearch(array, elm, left, half-1);
			}
		}
		return -1;
	}

}
