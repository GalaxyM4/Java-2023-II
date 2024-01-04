import java.util.Scanner;

public class Administrativo extends Persona {
    private String area;

    public Administrativo(String nombre, String area) {
        super(nombre);
        this.area = area;
    }

    @Override
    public void registrar() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nRegistrando al administrativo, ingresa el nombre: ");
        String nombre = input.next();
        this.setNombre(nombre);
        System.out.print("\nAhora ingresa el área: ");
        String area = input.next();
        this.setArea(area);
        input.close();
    }

    @Override
    public void consultar() {
        System.out.println(" ------------------ Mostrando datos del objeto... ------------------ ");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Area: " + this.getArea());
    }
    
    public void sueldo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el sueldo: ");
        float sueldo = input.nextFloat();
        System.out.println("El sueldo se estableció a " + sueldo);
        input.close();
    }

    //Getters and setters
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
}
