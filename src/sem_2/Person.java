package sem_2;

public class Person {
    private String name;
    private int age;
    public Person(String nom, int ed) {
        this.name = nom;
        this.age = ed;
    }

    public void show() {
        System.out.println("Habla colorao");
        System.out.println("Nombre: " + this.name);
        System.out.println("Edad: " + this.age);
    }
}