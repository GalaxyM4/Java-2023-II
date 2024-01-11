import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String ui = "Hola, estas son las clases a modificar: \n1.Administrativo \n2.Docente \n3.Personal limpieza\n\nIngresa tu opción: ";
        Scanner input = new Scanner(System.in);
        System.out.print(ui);
        int choice = input.nextInt();

        //clases creadas
        if(choice == 1) {
            System.out.print("\nHas seleccionado la clase Administrativo, ingresa el nombre: ");
            String nombre = input.next();
            System.out.print("\nAhora ingresa el área: ");
            String area = input.next();
            Administrativo admin = new Administrativo(nombre, area);
            admin.sueldo();
            admin.consultar();
        }
        if(choice == 2) {
            System.out.print("\nHas seleccionado la clase Docente, ingresa el nombre: ");
            String nombre = input.next();
            System.out.print("\nAhora ingresa el cargo: ");
            String cargo = input.next();
            System.out.print("\nAhora ingresa las horas trabajadas: ");
            float horas = input.nextFloat();
            Docente doc = new Docente(nombre, cargo, horas);
            doc.sueldo();
            doc.consultar();
        }
        if(choice == 3) {
            System.out.print("\nHas seleccionado la clase Personal de Limpieza, ingresa el nombre: ");
            String nombre = input.next();
            System.out.print("\nAhora ingresa el turno: ");
            String turno = input.next();
            PersonalLimpieza pers = new PersonalLimpieza(nombre, turno);
            pers.sueldo();
            pers.consultar();
        }
    
        input.close();
    }
}
