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