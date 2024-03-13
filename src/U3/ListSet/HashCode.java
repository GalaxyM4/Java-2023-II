package U3.ListSet;
import java.util.*;

public class HashCode {
    public static void main(String[] args) {
        
    }

    public static void linkedHash() {
        LinkedHashSet<String> people = new LinkedHashSet<>();
        people.add("Hitler");
        people.add("Kurt Kobain");
        people.add("Pinochet");
        people.add("Osama bin Laden");

        for (String string : people) {
            System.out.println("Hascode "+ ": " + string);
        }
    }

    public static void hashSet() {
        HashSet<String> people = new HashSet<>();
        people.add("Hitler");
        people.add("Kurt Kobain");
        people.add("Pinochet");
        people.add("Osama bin Laden");

        for (String string : people) {
            System.out.println("Hascode "+ ": " + string);
        }
    }

    public static void hashCodeList() {
        List<String> people = new ArrayList<>();
        people.add("Hitler");
        people.add("Kurt Kobain");
        people.add("Pinochet");
        people.add("Osama bin Laden");

        for (String string : people) {
            System.out.println("Hascode " + string + ": " + string.hashCode());
        }
    }

    public boolean checkHash(Object elm1, Object elm2) {
        return elm1.hashCode() == elm2.hashCode();
    }

    public <T> void checkHasckIterator(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            T obj1 = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                T obj2 = list.get(i);

                if(obj1.hashCode() == obj2.hashCode()) {
                    System.out.println("Los HashCode de " + obj1 + " y " + obj2 + " son iguales.");
                }
            }
        }
    }
}
