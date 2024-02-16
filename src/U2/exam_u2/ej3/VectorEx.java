package U2.exam_u2.ej3;
import java.util.Scanner;
import java.util.Vector;

@SuppressWarnings("resource")
public class VectorEx {
    public Vector<Integer> vector;
    public VectorEx(int size){
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
        if(vector.contains(Integer.valueOf(elm))) {
            return vector.indexOf(Integer.valueOf(elm));
        };
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
     * Versión mejorada para añadir elemento, si la posición se sale de los parámetros, lo añade al final 🎈
     * @param elm El elemento a añadir
     * @param pos La posición
     */
    public void addElmP(int elm) {
        vector.add(elm);
    }

    /**
     * Eliminar un elemento del vector, según la posición.
     * @param pos La posición del elemento a borrar.
     */
    public void deleteByPos(int pos) {
        if(pos > vector.size() || pos < 0) {
            throw new Error("La posición no existe.");
        }else {
            vector.remove(pos);
        }
    }

    /**
     * Eliminar un elemento del vector, de argumento el valor a eliminar.
     * @param elm El elemento a eliminar.
     */
    public void deleteByElm(int elm) {
        vector.remove(Integer.valueOf(elm));
    }

    /**
     * Llena el vector pidiendo datos al usuario.
     */
    public void fillVectorScanner() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vector.capacity(); i++) {
            System.out.print("Ingresa el elemento de posición " + i + ": ");
            vector.add(input.nextInt());
        }
    }

    /**
     * Llena el vector con elementos random.
     * @param limit El límite del random.
     */
    public void fillVectorRandom(int limit) {
        for (int i = 0; i < this.vector.capacity(); i++) {
            this.vector.add((int)(Math.random()*limit));
        }
    }
}

