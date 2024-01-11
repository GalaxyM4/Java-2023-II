package sem_2.Class;
import java.util.Scanner;

public class Dog {
    String name;
    String raza;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        scanner_dog();
    }

    public static void manual() {
        Dog per = new Dog();
        per.name = "pepe";
        per.raza = "chusco";
        Dog per2 = new Dog();
        per2.name = "princesito";
        per2.raza = "doberman";

        System.out.println("Perro 😺");
        System.out.println("Se llama " + per.name);
        System.out.println("Y es de raza: " + per.raza);
        System.out.println("Perro 2 xd");
        System.out.println("Se llama " + per2.name);
        System.out.println("Y es de raza: " + per2.raza);
    }

    public static void scanner_dog() {
        Dog perros = new Dog();
        System.out.println("Hola pana, inserta el name.");
        perros.name = perros.input.next();
        System.out.println("Ahora la raza (preferible no chusco)");
        perros.raza = perros.input.next();

        System.out.println("Tu perro causa:");
        System.out.println("Se llama " + perros.name);
        System.out.println("Y es de raza: " + perros.raza);
    }
}
