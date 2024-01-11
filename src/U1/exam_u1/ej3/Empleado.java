package exam_u1.ej3;
import java.util.Calendar;

public class Empleado {
    public String nombre;
    public String apellidos;
    public String lugar_nacimiento;
    public Calendar fecha_nacimiento;

    public Empleado() {
        this.nombre = "No especificado";
        this.apellidos = "No especificado";
        this.lugar_nacimiento = "No especificado";
        this.fecha_nacimiento = Calendar.getInstance();
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.apellidos = "No especificado";
        this.lugar_nacimiento = "No especificado";
        this.fecha_nacimiento = Calendar.getInstance();
    }

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.lugar_nacimiento = "No especificado";
        this.fecha_nacimiento = Calendar.getInstance();
    }

    public Empleado(String nombre, String apellido, String lugar_nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.lugar_nacimiento = lugar_nacimiento;
        this.fecha_nacimiento = Calendar.getInstance();
    }

    public Empleado(String nombre, String apellido, String lugar_nacimiento, Calendar fecha_nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.lugar_nacimiento = lugar_nacimiento;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void mostrar() {
        System.out.println(" ------------------ EMPLEADO ------------------");
        System.out.println("El empleado se llama " + nombre + " " + apellidos + " nació en " + lugar_nacimiento + " y nació el " + fecha_nacimiento.getTime().toString());
    }
}
