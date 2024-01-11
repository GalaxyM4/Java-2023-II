package exam_u1.ej3;
import java.util.Calendar;

public class Main3 {
    public static void main(String[] args) {
        Calendar fecha = Calendar.getInstance();
        fecha.set(1945, Calendar.AUGUST, 6);
        Empleado empl1 = new Empleado(); //sin argumentos
        empl1.mostrar();
        Empleado empl2 = new Empleado("Pedro"); //solo nombre
        empl2.mostrar();
        Empleado empl3 = new Empleado("Juan", "Vergara"); //2 argumentos
        empl3.mostrar();
        Empleado empl4 = new Empleado("Noe", "Morales", "Yurayacu"); //3 argumentos
        empl4.mostrar();
        Empleado empl5 = new Empleado("Juanito", "Montenegro", "Lima", fecha); //todos los argumentos
        empl5.mostrar();
    }
}