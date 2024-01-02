package sem_3.Tarea.Class;

public class City {
    public String name;
    protected long population;
    protected float area;

    public City() {
        this.name = "New York";
        this.population = 8468000000l;
        this.area = 1213.37f;
    }

    public City(String name, long population, float area) {
        this.name = name;
        this.population = population;
        this.area = area;

        if(population < 0) {
            System.out.println("El número de ciudadanos tiene que ser un número positivo.");
            population = 0;
        }
    }
    //Métodos de obtener y establecer, :moyai:
    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getArea() {
        return area;
    }

    //otros metodosa
    public void showAll() {
        System.out.println(name + " con población de " + population + " y un area de " + area + " km²");
    }
}