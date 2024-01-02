package sem_3.Tarea.Class;

public class Hiroshima extends City {
    public Hiroshima() {
        super();
        this.name = "Hiroshima";
        this.population = 1194000000l;
        this.area = 906.7f;
    }

    @Override
    public void showAll() {
        System.out.println(" --------------------------- Hiroshima --------------------------- ");
        System.out.println(name + " ciudad de Japón, con una población de " + population + ", y una extensión de " + area + " km²");
    }

    public void nuclear() throws InterruptedException {
        System.out.println(" --------------------------- Hiroshima ---------------------------");
        System.out.println("6 de agosto de 1945");
        Thread.sleep(2000);
        System.out.println("El avión \"Enola Gay\" lanza la bomba \"Little Boy\" sobre la ciudad de Hiroshima.");
        Thread.sleep(200);
        System.out.println("Dejando entre 40000 a 80000 muertos.");
        setPopulation(0);
        Thread.sleep(2000);
        System.out.println("La población de Hiroshima se estableció a 0");
        Thread.sleep(2000);
    }
}
