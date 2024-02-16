package U2.exam_u2.ej3;

import java.util.Scanner;
import Utils.PrintColor;
@SuppressWarnings("resource")
public class MainV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int size = input.nextInt();
        VectorEx vec = new VectorEx(size);
        
        vec.fillVectorScanner();
        vec.showVector();
        while (true) {
            int x = getOpt(vec);
            executeMenu(x, vec);
        }
    }

    public static int getOpt(VectorEx vec) {
        Scanner input = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        vec.showVector();
        PrintColor.printlnColor("Ahora que?", PrintColor.YELLOW);
        System.out.println("1. Eliminar elemento por posición.");
        System.out.println("2. Eliminar elemento específico.");
        System.out.println("3. Verificar si un elemento existe.");
        System.out.println("4. Añadir un elemento.");
        System.out.println("5. Añadir un elemento por posición.");
        
        return input.nextInt();
    }

    public static void executeMenu(int opt, VectorEx vec) {
        Scanner input = new Scanner(System.in);
        if(opt == 1) {
            System.out.print("Ingresa la posición del elemento a eliminar: ");
            int elm = input.nextInt();
            vec.deleteByPos(elm);;
        }

        if(opt == 2) {
            System.out.print("Ingresa el elemento a eliminar: ");
            int elm = input.nextInt();
            vec.deleteByElm(elm);;

        }

        if(opt == 3) {
            System.out.print("Ingresa el elemento a checkear: ");
            int elm = input.nextInt();
            if(vec.checkElement(elm) >= 0) {
                System.out.println("El elemento si existe y está en la posición: " + vec.checkElement(elm));
            }else {
                System.out.println("El elemento no existe.");
            }
            try{
                Thread.sleep(5000);
            }catch (Exception e) {
                System.err.println(e);
            }
            
        }

        if(opt == 4) {
            System.out.print("Ingresa el elemento: ");
            int elm = input.nextInt();
            vec.addElmP(elm);
        }

        if(opt == 5) {
            System.out.print("Ingresa el elemento: ");
            int elm = input.nextInt();
            System.out.print("Ingresa la posición a añadir: ");
            int pos = input.nextInt();
            vec.addElm(elm, pos);
        }
    }
}