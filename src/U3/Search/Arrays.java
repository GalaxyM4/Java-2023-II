package ---;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList <String> escritores = new ArrayList<>();
        escritores.add("Vallejo");
        escritores.add("García");
        escritores.add("Vargas");
        escritores.add("Llosa");
        escritores.add("Pérez");
        escritores.add("Imanol");

    
    //    for(String escritor:escritores) {
    //       System.out.println();
    //    }

        escritores.set(1, "Benito");
        for (String escritor:escritores) {
            System.out.println(escritor);
        }

        // Otra forma de iterar 
        for (int i=0; i<escritores.size(); i++) {
            System.out.println("Escritor " + i + escritores.get(i));

        }
    }
}

   
