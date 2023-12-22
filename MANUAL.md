
<img src="https://cdn.discordapp.com/attachments/963177252546314280/1183935527716659221/image.png"> 
<img src="https://img.freepik.com/vector-premium/fondo-banner-azul-marino-oscuro-plantilla-fondo-patron-banner-diseno-grafico-abstracto-vector_181182-18817.jpg" width="900">

# Manual piola insano épico
Grupo 7
* Marín Alcalde Victor Arturo 
* Ruíz Loaysa Deniss Jesús
* Mejía Irigoín Luis Gerardo
# Introducción
Bienvenido a esta basofia de manual, aquí vas a ver algunos temas que se vió en el curso Algoritmos y Estructuras, espero que la persona que esta leyendo esto entienda los códigos xdxdxd, saludos.
## Arreglos pe:
Primer tema omg
> Un arreglo es un conjunto de elementos del mismo tipo *al menos en java*.
### Números pares
Básicamente imprime números pares del 1 al 10.
```java
public static void  by_loop() {
    int[] arr = new int[10];

    for(int i = 0; i < arr.length ; i++) { //un simple bucle 🐒
        arr[i] = i+1;
        System.out.println(arr[i]);
    }
}
```

### Números por scanner
Ahora tú decides el límite de números a mostrar 🦍.
```java
public static void choicexdxd() {
    Scanner input = new Scanner(System.in);
    int limit;
    int[] numbers;
    System.out.println("Habla causa, inserta el límite:");
    limit = input.nextInt(); //aca se inserta el límite
    numbers = new int[limit];
    input.close();
    for(int i = 1; i <= limit; i++) {
        numbers[i] = i;
        System.out.println(i); //Se imprime los números 🦈
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
Facilísimo verdad?
## Clases y objetos
Segundo tema waos.
> Una clase es como un modelo para un objeto, oséa, la clase es el molde de una galleta y el objeto es la galleta 🦆

### Asignar propiedades
Una propiedad, atributo, elemento, como se te salga llamarle, es algo que está dentro de la clase la cual lo puedes cambiar a tu gusto, si es que lo deseas.
> Manualmente, osea desde código, en otras palabras estableces cada propiedad manualmente:
```java
public static void manual() {
    Dog per = new Dog();
    per.name = "pepe";
    per.raza = "chusco";
    Dog per2 = new Dog();
    per.name = "princesito";
    per.raza = "doberman";

    System.out.println("Perro 😺");
    System.out.println("Se llama " + per.name);
    System.out.println("Y es de raza: " + per.raza);
    System.out.println("Perro 2 xd");
    System.out.println("Se llama " + per2.name);
    System.out.println("Y es de raza: " + per2.raza);
}
```
> Ahora desde scanner 🗿, oséa desde scanner vos ponés el nombre del perro y la raza también.
```java
public static void scanner_dog() {
    Dog perros = new Dog();
    System.out.println("Hola pana, inserta el name.");
    perros.name = perros.input.next();
    System.out.println("Ahora la raza (preferible no chusco)");
    perros.raza = perros.input.next();

    System.out.println("Tu perro causa:");
    System.out.println("Se llama " + perros.name);
    System.out.println("Y es de raza: " + perros.raza);
}
```

### Constructores
Un constructor es como una función que se usa para establecer las propiedades de una clase al mismo momento en las que se invoca.
> Ejemplo de un constructor, tien
```java
public class Person {
    //acá van las propiedades de tu clase
    private String name;
    private int age;
    public Person(String nom, int ed) { //este es el constructor
        this.name = nom;
        this.age = ed;
    }

    private void show() { //esta función imprime las propiedades
        System.out.println("Habla colorao");
        System.out.println("Nombre: " + this.name);
        System.out.println("Edad: " + this.age);
    }
}
```
> En otro archivo:
```java
public class App {
    public static void main(String[] args) {
        Person per = new Person("Pedrín", 99); //Colocas los argumentos en el mismo orden.
        per.show(); //y aca muestra las propiedades
    }
}
```