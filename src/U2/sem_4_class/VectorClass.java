package U2.sem_4_class;
import java.util.Scanner;
import java.util.Vector;
import Utils.PrintColor;

public class VectorClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintColor.printColor("Ingresa el tamaño del vector: ", PrintColor.BLUE);
        int sizeV = input.nextInt();
        Vector<Integer> vec = new Vector<>(sizeV);
        for (int i = 0; i < sizeV; i++) {
            vec.add((int)(Math.random()*50));
        }
        System.out.println("========================================================");

        PrintColor.printColor("Ingresa el elemento para añadir al vector: ", PrintColor.YELLOW);
        int elm = input.nextInt();
        PrintColor.printColor("Ingresa la posición: ", PrintColor.YELLOW);
        int pos = input.nextInt();

        if(pos > vec.size() || pos < 0) {
            vec.add(elm);
        }else {
            vec.add(pos, elm);
        }
        showVector(vec);
        input.close();
    }

    public static <T> void showVector(Vector<T> vector) { //muestra el vector xd
        System.out.println("Elementos del vector: ");
        for (int i = 0; i < vector.size(); i++) {
            PrintColor.printColor("V["+i+"]: ", PrintColor.GREEN);
            System.out.print(vector.get(i)+"\n");
        }
    }

    public static <T> int checkElement(Vector<T> vector, T elm) { //detecta si tal elemento está en el vector 🐒
        for (int i = 0; i < vector.size(); i++) {
            if(vector.get(i) == elm) {
                return i;
            }
        }

        return -1;
    }

    public static <T> void fillVector(Vector<T> vector) {
        
    }
}
