package sem_3.Class;

public class Car extends Transport{
    public Car(int capa, String p, String color) {
        super(capa, p, color);    
    }

    //Estos metodos se sobrecargan para que no salga como en la clase padre
    @Override
    public void run() {
        System.out.println("El terreneitor avanzó.");
    }

    @Override
    public void stop() {
        System.out.println("El terreneitor paró.");
    }

    //Este método es propio de Car
    public void derrapar() {
        System.out.println("Derrapación god.");
    }
}
