# Recursión
Esto consiste en usar un método dentro de otro método el cual es el mismo método, en otras palabras, usas la misma función dentro de la misma, lo cual genera un bucle.

## Ejemplo básico de recursividad
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

## Clase recursiva multiplicación
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

## Clase recursiva división
Así como la multiplicación es una suma repetida, se podría considerar la división como una resta repetida, ahora solo se aplica el mismo concepto de recursividad para poder hallar el cociente.


Ver [archivo](../../src/U2/sem_3_recursion/SubstractionDiv/Division.java)
```java
package U2.sem_3_recursion.SubstractionDiv;

import Utils.PrintColor;

public class Division {
    public static int div(int num, int den) {
        if(den == 0) {
            throw new Error(PrintColor.RED + "El denominador tiene que ser diferente de 0" + PrintColor.RESET);
        }
        if(den > num) {
            return 0;
        }else {
            return div(num-den, den)+1;
        }
    }
}
```

## Función factorial
La función factorial en matemática se define por x!, y es multiplicar por todos los números anteriores a este hasta llegar a uno, se tiene por dominio solo los enteros positivos 🤓, como se ve en la siguiente ecuación.

<img src="https://cdn.discordapp.com/attachments/858111859910770719/1207534635840700427/invert.png?ex=65dfff44&is=65cd8a44&hm=a8ec2a6fa43e120961b0c99f4d0cf275a7d5e77ec888eb7c0619973d361f8ce2&" width=170>

Y este también tiene un dominio:

<img src="https://cdn.discordapp.com/attachments/858111859910770719/1207534748453568552/invert.png?ex=65dfff5e&is=65cd8a5e&hm=4cf2159a67c40d58a4a8fe349db5a9c31a3caa0a6aabdfb75b86a2ee5201f199&" width=500>

Ver [archivo](../../src/U2/sem_3_recursion/Factorial/FactorialFunction.java)
```java
public class FactorialFunction {
    public static int fact(int n) {
        if(n < 0) {
            throw new Error(PrintColor.RED+"El factorial tiene por dominio los Z+."+PrintColor.RESET);
        };
        if(n == 0) return 1;
        if(n == 1) {
            return 1;
        }else {
            return fact(n-1)*(n);
        }
    }
}
```

## Teorema de eculides
El método de euclides para hallar el MCD de 2 números tambien se podría aplicar el principio de recursividad.

Imagen de referencia:

<img src="https://cdn.discordapp.com/attachments/858111859910770719/1207535884556304444/image.png?ex=65e0006d&is=65cd8b6d&hm=4484fcf47f7200c811cd5998be1d292e048e5215ae8a41a6b098eb7bcbe96e8b&" width=500>

Ver [archivo](../../src/U2/sem_3_recursion/Euclides/Euclid.java)
```java
public class Euclid {
    public static int euclid(int n1, int n2) {
        int res = n1%n2;
        System.out.print(n1 + " ");
        if(res == 0) {
            System.out.print(n2);
            return n2;
        }else {
            return euclid(n2, res);
        }
    }
}
```

## Invertir un número
Otra manera de usar recursividad es invertir un número, como se ve en el ejemplo.

Ver [archivo](../../src/U2/sem_3_recursion/InvertNumber/Invert.java)

```java
public class Invert {
    public static void invert(int n) {
        int div = n/10;
        int res = n%10;

        PrintColor.printColor("El número invertido es: "+res, PrintColor.GREEN);
        if(div != 0) {
            n = div;
            invert(n);
        }
    }
}
```

## 