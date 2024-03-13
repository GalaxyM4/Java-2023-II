package U3.sem3_colecciones_mapas;
import java.util.ArrayList;
import java.util.List;
public class PruebaHashCode {

    public static void main(String[] args) { 
        List <String> escritores = new ArrayList<>();
        escritores.add("Vallejo");
        escritores.add("García");
        escritores.add("Vargas");
        escritores.add("Llosa");
        escritores.add("Pérez");
        escritores.add("Huamán");

        for(String escritor:escritores) {
            System.out.println("HashCode" + escritor + ": " + escritor.hashCode());
        }

        for(int i=0; i<escritores.size(); i++) {
            String escritor1 = escritores.get(i); 
            int hashCode1 = escritor1.hashCode();
        
        
        // Comparar el HashCode del Escritor Actual con el HashCode de los demás escritores 
        for (int j=i+1; j<escritores.size(); j++) {
           String escritor2 = escritores.get(j); 
           int hashCode2 = escritor2.hashCode();

              // Si los HashCode son iguales, entonces tendrán direcciones iguales
              if(hashCode1==hashCode2) {
                System.out.println("Las direcciones de " + escritor1 + " y " + escritor2 + " son iguales ");
            }
           
        }
        }
    }

    }
