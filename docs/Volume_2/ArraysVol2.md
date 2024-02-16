[Volver](../Info.md)
# Arrays con dimensiones específicas
## Unidimensionales
Estos arrays (listas) tienen una sola dimension, para entenderlo imaginate los elementos de la lista ordenados de forma lineal.

Ejm:

<img src="https://codesitio.com/wp-content/uploads/2017/12/TABLA.png" width=500>

<br />

>**Ejemplo del dado**

Este código va a lanzar un dado 60000 veces.

Ver [código](../../src/U2/sem_2_arrays2/Unidimensionales/Dadito.java)
```java
package U2.sem_2_arrays2.Unidimensionales;
import java.security.SecureRandom;

public class Dadito {
	public static void main(String[] args) {
		SecureRandom r = new SecureRandom();
		int [] dado = new int[11];

		// Lanzamientos
		for (int i= 0; i<60000 ; i++ ) {
			dado[1+r.nextInt(10)]++;
		}
		System.out.printf("%s%15s%n", "cara", "frecuencia");

		// Mostrar resultados
		for(int cara=1; cara<dado.length; cara++) {

			System.out.printf("%4d%15d%n", cara, dado[cara]);
		}

	}
}
```

>**Array con elementos aleatorios**

Esta lista tiene un array con elementos pseudo aleatorios.
```java
package U2.sem_2_arrays2.Unidimensionales;
import java.util.Scanner;

public class LeerArreglos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Número de elementos");
		int n=sc.nextInt();
		int [] camilo = new int[n];

		// Leer vector

		// Generar el Vector
		for(int i=0; i<camilo.length; i++) { 
			camilo[i] = (int)(Math.random()*50);
		}

		// Mostrar el vector

		for(int i=0; i<camilo.length; i++) {
			System.out.print(camilo[i] + "\t");
		}
		System.out.println();

		sc.close();

	}
}
```