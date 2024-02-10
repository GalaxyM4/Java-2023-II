## Recursión
Esto consiste en usar un método dentro de otro método el cual es el mismo método, en otras palabras, usas la misma función dentro de la misma, lo cual genera un bucle.

### Ejemplo básico de recursividad
En este ejemplo se va a imprimir el número que se de en el argumento iniciando del 0 hasta que sea el argumento.

Ver [archivo](../../src/U2/sem_3_recursion/Recursion/RShow.java)
```java
package U2.sem_3_recursion.Recursion;
public class RShow {
    public void show(int x) {
        System.out.println(x);
        x++;
        if(x <= 10) {
            show(x);
        }
    }
}
```


### Clase recursiva multiplicación
Como sabemos una multiplicación es una suma repetida, en este ejemplo vamos a usar la recursividad para generar un método que sume los números y así se genere una multiplicación. ♻️

Ver [archivo](../../src/U2/sem_3_recursion/MultiplySum/Multiply.java)
```java
package U2.sem_3_recursion.MultiplySum;

public class Multiply {
    public static float mult(float n1, float n2) {
        if(n1 == 0 || n2 == 0) return 0; // Si cualquiera de los números es 0, pues que retorne 0 :V
        if(n2 < 1) { 
            return n1;
        }else {
            return mult(n1, n2-1)+n1; //aquí es donde sucede la recursividad, pues se usa el mismo método.
        }
    }
}
```

