import java.util.Scanner;

public class PersonalLimpieza extends Persona{
    private String turno; //mañana tarde o noche

    public PersonalLimpieza(String nombre, String turno) {
        super(nombre);
        this.turno = turno;
    }

    @Override
    public void registrar() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nRegistrando al personal, ingresa el nombre: ");
        String nombre = input.next();
        this.setNombre(nombre);
        System.out.print("\nAhora ingresa el área: ");
        String turno = input.next();
        this.setTurno(turno);
        input.close();
    }

    @Override
    public void consultar() {
        System.out.println(" ------------------ Mostrando datos del objeto... ------------------ ");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Turno: " + this.getTurno());
    }
    
    public void sueldo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el sueldo: ");
        float sueldo = input.nextFloat();
        System.out.println("El sueldo se estableció a " + sueldo);
        input.close();
    }

    //getters y setters
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
