package U3.ListSet;

public class Equals {
    public static void main(String[] args) {
        Person p1 = new Person("Pedro", "Lora");
        Person p2 = new Person("Pedro", "Lora");

        System.out.println(p1.equals(p2));
    }
} 
