package exam_u1.ej2;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String ui = "Hola, estas son las operaciones disponibles: \n1.División \n2.Multiplicación \n3.Potenciacion \n4.Raiz cuadrada\n\nIngresa tu opción: ";
        Scanner input = new Scanner(System.in);
        System.out.print(ui);
        int choice = input.nextInt();

        //clases creadas
        if(choice == 1) {
            System.out.print("\nHas seleccionado la división, \nIngresa el primer número: ");
            double num1 = input.nextDouble();
            System.out.print("\nAhora ingresa el segundo número: ");
            double num2 = input.nextDouble();
            Division div = new Division(num1, num2);
            div.resolver();
        }
        if(choice == 2) {
            System.out.print("\nHas seleccionado la multiplicación, \nIngresa el primer número: ");
            double num1 = input.nextDouble();
            System.out.print("\nAhora ingresa el segundo número: ");
            double num2 = input.nextDouble();
            Multiplicacion mult = new Multiplicacion(num1, num2);
            mult.resolver();
        }
        if(choice == 3) {
            System.out.print("\nHas seleccionado la potenciación, \nIngresa el primer número: ");
            double num1 = input.nextDouble();
            System.out.print("\nAhora ingresa el segundo número: ");
            double num2 = input.nextDouble();
            Potenciacion pot = new Potenciacion(num1, num2);
            pot.resolver();
        }
        if(choice == 4) {
            System.out.print("\nHas seleccionado la raiz cuadrada, \nIngresa el primer número: ");
            double num1 = input.nextDouble();
            System.out.print("\nAhora ingresa el segundo número: ");
            double num2 = input.nextDouble();
            Raiz ra = new Raiz(num1, num2);
            ra.resolver();
        }
    
        input.close();
    }
}
