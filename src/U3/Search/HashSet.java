package U3.sem3_colecciones_mapas;
import java.util.HashSet;
import java.util.Iterator;

public class PruebaHashSet {
    public static void main(String[] args) {
        HashSet <String> escritores = new HashSet<>();
        escritores.add("Vallejo");
        escritores.add("García");
        escritores.add("Vargas");
        escritores.add("Llosa");
        escritores.add("Pérez");
        escritores.add("Imanol");

    
    //    for(String escritor:escritores) {
    //       System.out.println();
    //    }

    Iterator<String> it=escritores.iterator();
    while (it.hasNext()) {                          // Mientras haya elementos en el conjunto
        String nombre = it.next();                  // Me devuelve el primer elemento y pasa al siguiente
        System.out.println(nombre);                   
    } 
    }
}

   
