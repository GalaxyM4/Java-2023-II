package sem_3.Tarea.executable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sem_3.Tarea.Class.*;

public class MainC {
    public static void main(String[] args) throws InterruptedException{
        //uinterfaz
        Scanner input = new Scanner(System.in);
        List<City> listCities = new ArrayList<>();
        System.out.println("");
        System.out.println(" --------------------------- hola ---------------------------");
        System.out.println("Estas en la interfaz de la clase \"City\", opciones: ");
        System.out.println("1. Crear nuevo objeto City.");
        System.out.println("2. Ejecutar el objeto Hiroshima");
        System.out.println("3. Ejecutar el objeto Nagazaki");
        System.out.print("Insertar opción: ");
        //selección
        int selection = input.nextInt();
        //Quería hacerlo con funciones aparte pero va a ser mas complicado asi que mejor con ifs xdxd
        if(selection == 1) {
            System.out.println(" --------------------------- Crear ciudad --------------------------- ");
            System.out.print("Inserte nombre: ");
            String name = input.next();
            System.out.print("Inserte cantidad de población: ");
            long population = input.nextLong();
            System.out.print("Inserte la extensión de su territorio: ");
            float area = input.nextFloat();
            City new_c = new City(name, population, area);
            listCities.add(new_c);
            Thread.sleep(2000);
            main(args);
        }
        if(selection == 2) {
            Hiroshima c = new Hiroshima();
            c.showAll();
            c.nuclear();
        }
        if(selection == 3) {
            Nagazaki c = new Nagazaki();
            c.showAll();
            c.nuclear();
        }
        input.close();
    }
}