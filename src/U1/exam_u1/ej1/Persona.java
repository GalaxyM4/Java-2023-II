import java.util.Scanner;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void registrar() {
    }

    public void consultar() {
    }

    public void sueldo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el sueldo: ");
        float sueldo = input.nextFloat();
        System.out.println("El sueldo se estableció a " + sueldo);
        input.close();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
 