package sem_3.Class;

public class Transport {
    public int capacity;
    public String placa;
    public String color;

    //Este constructor es el por defecto
    public Transport() {
        this.capacity = 0;
        this.placa = "000-000";
        this.color = "null";
    }

    public Transport(int capa, String placa, String color) {
        //son 3 atributos los que va a tener la superclase, que son los 3 siguientes 🐒
        this.capacity = capa;
        this.placa = placa;
        this.color = color;
    }

    //Estos son los metodos por defecto de la clase Transport
    public void run() {
        System.out.println("El vehículo insano se mueve.");
    }

    public void stop() {
        System.out.println("El vehículo insano paró.");
    }

    //Muestra toda la info
    public void show_all() {
        System.out.println("Vehículo insano god.");
        System.out.println("Capacidad: " + capacity);
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
    }
}