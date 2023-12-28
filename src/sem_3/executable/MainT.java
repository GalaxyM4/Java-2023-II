package sem_3.executable;
import sem_3.Class.*;

public class MainT {
    public static void main(String[] args) {
        System.out.println(" -------------- Transporte (No heredación) -------------- ");
        Transport t = new Transport(5, "AD2-SR3", "Morao");
        t.run(); //va a imprimir lo del vehículo insano
        t.stop(); //va a parar el vehículo insano
        System.out.println(" -------------- Carro -------------- ");
        Car c = new Car(5, "ADN-313", "Rojo");
        c.run(); //ahora en vez de vehículo será terreneitor
        c.stop();
        c.derrapar(); //esta función es única de esta clase
        System.out.println(" -------------- Avión -------------- ");
        Plane a = new Plane(20, "789", "Blanco");
        a.run(); //y ahora va a aparecer avión
        a.stop();
        a.planear(); //planear xdxd
    }
}
