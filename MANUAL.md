<img src="https://cdn.discordapp.com/attachments/963177252546314280/1183935527716659221/image.png">

# Manual piola insano épico
Grupo 7
* Marín Alcalde Victor Arturo 
* Ruíz Loaysa Deniss Jesús
* Mejía Irigoín Luis Gerardo
## Arreglos pe:
Primer tema omg
### Números pares
Básicamente imprime números pares del 1 al 10.
```java
public static void  by_loop() {
    int[] arr = new int[10];

    for(int i = 0; i < arr.length ; i++) {
        arr[i] = i+1;
        System.out.println(arr[i]);
    }
}
```

### Números por scanner
Ahora tú decides el límite de números a mostrar 🐒.
```java
public static void choicexdxd() {
    Scanner input = new Scanner(System.in);
    int limit;
    int[] numbers;
    System.out.println("Habla causa, inserta el límite:");
    limit = input.nextInt();
    numbers = new int[limit];
    input.close();
    for(int i = 1; i <= limit; i++) {
        numbers[i] = i;
        System.out.println(i);
    }
}
```

### Ordenar arrays
El título lo dice 🦤.
#### Explicación:
Bien, el código lo que hace es comprobar elemento por elemento del array para verificar si este es mayor o menor al elemento anterior, para ir llevando al número mayor o menor al índice 0 y lo demas al final.

> **Orden Ascendente**
```java
public static void causa_ascendente() { //de menor a mayor
        int limit;
        int[] numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Hola pe, inserta la cantidad de números.");
        limit = input.nextInt();
        numbers = new int[limit];
        // este loop recolecta los números
        for (int i = 0; i < limit; i++) {
            System.out.print("Coloca el número de posición " + i + ": ");
            numbers[i] = input.nextInt();
        }
        input.close();
        //este loop ordena 🐒
        for (int i = 1; i < limit; i++) {
            int actual_elm = numbers[i];
            int id2 = i;
            while ((id2 > 0) && (numbers[id2-1] > actual_elm)) {
                numbers[id2] = numbers[id2-1];
                id2--;
            }
            numbers[id2] = actual_elm;
        }
        System.out.println(Arrays.toString(numbers));
    }
```
>**Orden Descendente**
```java
public static void causa_decendente() { // de mayor a menor, un copia y pega insano
        int limit;
        int[] numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Hola pe, inserta la cantidad de números.");
        limit = input.nextInt();
        numbers = new int[limit];
        // este loop recolecta los números
        for (int i = 0; i < limit; i++) {
            System.out.print("Coloca el número de posición " + i + ": ");
            numbers[i] = input.nextInt();
        }
        input.close();
        //este loop ordena 🐒
        for (int i = 1; i < limit; i++) {
            int actual_elm = numbers[i];
            int id2 = i;
            while ((id2 > 0) && (numbers[id2-1] < actual_elm)) {
                numbers[id2] = numbers[id2-1];
                id2--;
            }
            numbers[id2] = actual_elm;
        }
        System.out.println(Arrays.toString(numbers));
    }
```
