# Vectores
Un vector se diferencia en que solo tiene una dimensión, para este ejemplo se va a crear una clase donde se contiene un vector para modificarlo a gusto.

Ver [archivo](../../src/U2/sem_4_class/VectorNew.java)
```java
package U2.sem_4_class;
import java.util.Scanner;
import java.util.Vector;

public class VectorNew {
    private Vector<Integer> vector;
    public VectorNew(int size){
        this.vector = new Vector<>(size);
    }

    /**
     * Muestra el vector de la clase :V
     */
    public void showVector() {
        System.out.println("Elementos del vector: ");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print("V["+i+"]: ");
            System.out.print(vector.get(i)+"\n");
        }
    }

    /**
     * Comprueba si un elemento está en el vector.
     * @param elm El elemento a comprobar
     * @return La posición si el elemento se encuentra, de lo contrario retorna -1 🚬
     */
    public int checkElement(int elm) { 
        for (int i = 0; i < vector.size(); i++) {
            if(vector.get(i) == elm) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Versión mejorada para añadir elemento, si la posición se sale de los parámetros, lo añade al final 🎈
     * @param elm El elemento a añadir
     * @param pos La posición
     */
    public void addElm(int elm, int pos) {
        if(pos > vector.size() || pos < 0) {
            vector.add(elm);
        }else {
            vector.add(pos, elm);
        }
    }

    /**
     * Llena el vector pidiendo datos al usuario.
     */
    public void fillVectorScanner() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vector.size(); i++) {
            System.out.print("Ingresa el elemento de posición " + i + ": ");
            vector.set(i, input.nextInt());
        }

        input.close();
    }

    /**
     * Llena el vector con elementos random.
     * @param limit El límite del random.
     */
    public void fillVectorRandom(int limit) {
        for (int i = 0; i < vector.size(); i++) {
            vector.set(i, (int)(Math.random()*limit));
        }
    }
}

```