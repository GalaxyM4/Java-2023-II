package sem_2.executables;
import sem_2.Class.Vehicle;

public class MainVehicl {
    public static void main(String[] args) {
        new Vehicle(0, "pedrito"); // los 2 primeros argumentos
        new Vehicle(45, "si", 3); // sobrecarga con número de pasajeros
        new Vehicle(12, "juan", 12, "rojito"); //sobrecarga con color tambien
    }
}
