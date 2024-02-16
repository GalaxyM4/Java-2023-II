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
