import java.util.Scanner;

public class Docente extends Persona {
    private String cargo;
    private float horasTrabajadas;

    public Docente(String nombre, String cargo, float horasTrabajadas) {
        super(nombre);
        this.cargo = cargo;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void registrar() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nHas seleccionado la clase Docente, ingresa el nombre: ");
        String nombre = input.next();
        this.setNombre(nombre);
        System.out.print("\nAhora ingresa el cargo: ");
        String cargo = input.next();
        this.setCargo(cargo);
        System.out.print("\nAhora ingresa las horas trabajadas: ");
        float horas = input.nextFloat();
        this.setHorasTrabajadas(horas);
        input.close();
    }

    @Override
    public void consultar() {
        System.out.println(" ------------------ Mostrando datos del objeto... ------------------ ");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Horas trabajadas: " + this.getHorasTrabajadas());
    }

    public void sueldo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el sueldo: ");
        float sueldo = input.nextFloat();
        System.out.println("El sueldo en función a las horas trabajadas es " + (sueldo*horasTrabajadas));
        input.close();
    }

    //getters y setters
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
