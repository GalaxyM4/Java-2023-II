[Volver](../Info.md)
# Ejercicio 1
El profesor encargado del curso de Algoritmos y Estructura de Datos ha registrado los nombres de sus N alumnos en un vector, y ha almacenado las 3 notas obtenidas por cada uno durante el semestre en una matriz. Se solicita crear un programa que presente el promedio académico de cada estudiante. Además, se debe exhibir el nombre de aquellos alumnos que han aprobado el curso, dado que la calificación mínima para aprobar es 12.

## Solución
Para este problema se consideró crear una matriz de vectores de tipo float como se ve en el código, para luego pedir a cada alumno su nombre, y finalmente sus 3 notas.

Una vez terminado se calculará el promedio y si es mayor o igual a 12, estará aprobado.

Ver [archivo](../../src/U2/exam_u2/ej1/Notes.java)
```java
import java.util.Scanner;
import java.util.Vector;
import Utils.PrintColor;

public class Notes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de estudiantes: ");
        int students = input.nextInt();
        String[] names = new String[students];
        @SuppressWarnings("unchecked")
        Vector<Float>[] list_notes = new Vector[students];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Ingresa el nombre del estudiante " + i);
            names[i] = input.next();
        }
        
        for (int i = 0; i < list_notes.length; i++) {
            Vector<Float> note = new Vector<>(3);
            for (int j = 0; j < note.capacity(); j++) {
                System.err.print("Ingresa la nota N°" + (j+1) + " de " + names[i] + ": ");
                note.add(input.nextFloat());
            }
            list_notes[i] = note;
        }

        for (int i = 0; i < list_notes.length; i++) {
            float promedio = 0;
            Vector<Float> actual_notes = list_notes[i];
            for (int j = 0; j < actual_notes.capacity(); j++) {
                float note = actual_notes.get(j);
                promedio+=note;
            }
            promedio/=actual_notes.capacity();

            if(promedio >= 12) {
                PrintColor.printlnColor("Promedio de "+names[i]+": "+promedio + " (APROBADO)", PrintColor.GREEN);
            }else {
                PrintColor.printlnColor("Promedio de "+names[i]+": "+promedio + " (DESAPROBADO)", PrintColor.RED);
            }
        }

        input.close();
    }
}

```

# Ejercicio 2
Programar un algoritmo recursivo que permita sumar los dígitos de un número. 

Ejemplo: Entrada: 183 Resultado:12

## Solución
Recursividad pura y simple, simplemente lo divide entre 10 y luego se obtiene el resudio con 10 lo cual es la cifra a sumar.

Ver [archivo](../../src/U2/exam_u2/ej2/SumDigits.java)
```java
package U2.exam_u2.ej2;

import java.util.Scanner;
import Utils.PrintColor;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el número: ");
        int n = input.nextInt();
        PrintColor.printlnColor("La suma de cifras es: "+sumD(n), PrintColor.GREEN);
        input.close();
    }

    public static int sumD(int number) {
        int div = number;
        
        if(number < 10) {
            return div%10;
        }else {
            int cifra = div%10;
            return sumD(div/10)+cifra;
        }
    }
}

```

# Ejercicio 3
Crear una clase vector de nombre M, que permita ingresar n elementos únicamente de tipo enteros.
* Insertar un elemento X en la posición P, en caso de que no exista esa posición, colocar X como último elemento del vector.
* Eliminar un elemento de una posición determinada del vector M
* Eliminar un elemento del vector M
* Verificar si un elemento está dentro del vector M

## Solución
Para este caso, se crearon 2 archivos, el Main que es donde se creó un menú con las opciones que se pide, y la clase del Vector donde irá cada método de lo que el ejercicio solicita.

<br />

> **Clase Vector**

Ver [archivo](../../src/U2/exam_u2/ej3/VectorEx.java)
```java
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
```
<br />

> **Clase Main (Menú)**

Ver [archivo](../../src/U2/exam_u2/ej3/MainV.java)

```java
package U2.exam_u2.ej3;

import java.util.Scanner;
import Utils.PrintColor;
@SuppressWarnings("resource")
public class MainV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int size = input.nextInt();
        VectorEx vec = new VectorEx(size);
        
        vec.fillVectorScanner();
        vec.showVector();
        while (true) {
            int x = getOpt(vec);
            executeMenu(x, vec);
        }
    }

    public static int getOpt(VectorEx vec) {
        Scanner input = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        vec.showVector();
        PrintColor.printlnColor("Ahora que?", PrintColor.YELLOW);
        System.out.println("1. Eliminar elemento por posición.");
        System.out.println("2. Eliminar elemento específico.");
        System.out.println("3. Verificar si un elemento existe.");
        System.out.println("4. Añadir un elemento.");
        System.out.println("5. Añadir un elemento por posición.");
        
        return input.nextInt();
    }

    public static void executeMenu(int opt, VectorEx vec) {
        Scanner input = new Scanner(System.in);
        if(opt == 1) {
            System.out.print("Ingresa la posición del elemento a eliminar: ");
            int elm = input.nextInt();
            vec.deleteByPos(elm);;
        }

        if(opt == 2) {
            System.out.print("Ingresa el elemento a eliminar: ");
            int elm = input.nextInt();
            vec.deleteByElm(elm);;

        }

        if(opt == 3) {
            System.out.print("Ingresa el elemento a checkear: ");
            int elm = input.nextInt();
            if(vec.checkElement(elm) >= 0) {
                System.out.println("El elemento si existe y está en la posición: " + vec.checkElement(elm));
            }else {
                System.out.println("El elemento no existe.");
            }
            try{
                Thread.sleep(5000);
            }catch (Exception e) {
                System.err.println(e);
            }
            
        }

        if(opt == 4) {
            System.out.print("Ingresa el elemento: ");
            int elm = input.nextInt();
            vec.addElmP(elm);
        }

        if(opt == 5) {
            System.out.print("Ingresa el elemento: ");
            int elm = input.nextInt();
            System.out.print("Ingresa la posición a añadir: ");
            int pos = input.nextInt();
            vec.addElm(elm, pos);
        }
    }
}
```