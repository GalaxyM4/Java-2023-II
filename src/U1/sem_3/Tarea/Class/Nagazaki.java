package sem_3.Tarea.Class;

public class Nagazaki extends City {
    private String tourist_place;
    private String mayor;
    public Nagazaki() {
        super();
        this.name = "Nagazaki";
        this.population = 429508l;
        this.area = 405.9f;
        this.mayor = "Shirō Suzuki";
        this.tourist_place = "El Parque de la Paz";
    }
    //get set
    public String getTourist_place() {
        return tourist_place;
    }

    public void setTourist_place(String tourist_place) {
        this.tourist_place = tourist_place;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    @Override
    public void showAll() {
        System.out.println(" --------------------------- Nagazaki --------------------------- ");
        System.out.println(name + " ciudad de Japón, con una población de " + population + ", y una extensión de " + area + " km²");
        System.out.println("Con " + mayor + " de alcalde y " + tourist_place + " como su lugar turístico. ");
    }

    public void nuclear() throws InterruptedException {
        System.out.println(" --------------------------- Nagazaki ---------------------------");
        System.out.println("9 de agosto de 1945");
        Thread.sleep(1000);
        System.out.println("El avión \"Bockscar\" lanza la bomba \"Fat man\" sobre la ciudad de Nagazaki.");
        Thread.sleep(1500);
        System.out.println("Dejando entre 40000 a 80000 muertos.");
        this.setPopulation(0);
        Thread.sleep(1000);
        System.out.println("La población de Nagazaki se estableció a 0");
    }
}
