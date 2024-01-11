package sem_3.Class;

public class Plane extends Transport {
    public Plane(int capa, String p, String color) {
        super(capa, p, color);
    }
    //Lo mismo, los metodos se sobrecargan para que no salga como en la clase padre
    @Override
    public void run() {
        System.out.println("El avionsito avanzó.");
    }

    @Override
    public void stop() {
        System.out.println("El avionsito paró.");
    }

    //Ahora este metodo es propio de la clase Plane
    public void planear() {
        System.out.println("Planea de la manera mas épica posible");
    }
}
