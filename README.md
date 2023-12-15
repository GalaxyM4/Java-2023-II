# hola xdxdxd
## Arreglos pe:
Bien chistoso que en casi ninguno sea necesario los arrays.
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