package U3.ListSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> friends = new HashMap<>();
        friends.put(669, "Juanito");
        friends.put(500, "Pedrín");
        friends.put(450, "Adolf");
        friends.put(120, "Raúl");

        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el valor a buscar: ");
        String val = input.next();
        input.close();
        checkValue(friends, val);
    }

    public static <K, V> void iterate1(HashMap <K, V> map) {
        map.forEach((K id, V value) -> {
            System.out.println("ID: " + id + " es " + value);
        });
    }

    public static <K, V> void iterate2(HashMap <K, V> map) {
        for (Map.Entry<K, V> idx: map.entrySet()) {
            System.out.println("ID: " + idx.getKey() + " es " + idx.getValue());
        }
    }

    public static <K, V> void checkKey(HashMap<K, V> map, K key) {
        if(map.containsKey(key)) {
            System.out.println("La clave existe y su valor es: " + map.get(key));
        }else {
            System.out.println("La clave no existe");
        }
    }

    public static <K, V> void checkValue(HashMap<K, V> map, V val) {
        if(map.containsValue(val)) {
            System.out.println("El valor existe 🦤🦤🦤");
        }else {
            System.out.println("El valor no existe");
        }
    }
}
 