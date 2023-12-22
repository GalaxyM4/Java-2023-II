package sem_2.Class;

public class Vehicle {
    int prec;
    String name;
    int num_pas = 0;
    String color = "";
    public Vehicle(int pre, String nam) { //argumentos obligatiorios xd
        this.prec = pre;
        this.name = nam;
        System.out.println("Precio: " + pre + " Nombre del carro: " + nam);
    }

    public Vehicle(int pre, String nam, int num_pas) { //sobrecarga de argumentos
        this.prec = pre;
        this.name = nam;
        this.num_pas = num_pas;
        System.out.println("Precio: " + pre + " Nombre del carro: " + nam);
        System.out.println("Número de pasajeros: " + num_pas);
    }

    public Vehicle(int pre, String nam, int num_pas, String color) { //otra sobrecarga mas
        this.prec = pre;
        this.name = nam;
        this.num_pas = num_pas;
        this.color = color;
        System.out.println("Precio: " + pre + " Nombre del carro: " + nam);
        System.out.println("Número de pasajeros: " + num_pas + " Color: " + color);
    }
}
