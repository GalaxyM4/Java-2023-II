
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
public class Dog {
    String name;
    String raza;
    Scanner input = new Scanner(System.in);
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
}
```
> Ahora desde scanner 🗿, oséa desde scanner vos ponés el nombre del perro y la raza también.
```java
public class Dog {
    String name;
    String raza;
    Scanner input = new Scanner(System.in);
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
}
```

### Constructores
Un constructor es como una función que se usa para establecer las propiedades de una clase al mismo momento en las que se invoca.
> Ejemplo de un constructor, para declararlo tiene que terner el mismo nombre de la clase.
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
> En otro archivo (El que vas a ejecutar):
```java
public class MainPrs {
	public static void main(String[] args) {
		Person pe = new Person("Pedrín", 99); // colocas los parámetros en el mismo orden de la clase 
		pe.show(); // lo muestra 🤓
	}
}
```

### Getters and Setters
Esto normalmente se usa para establecer o obtener las propiedades de una clase, independientemente si esta es privada.
> Creando la clase con los Getters y Settters 🦍
```java
public class PersonGetSet { //grasias arturo no termine el getset xdxd
    private String nombre;
	private int edad;
	
	public PersonGetSet(String nombre, int edad) { //el constructor con sus respectivos parámetros
		this.nombre = nombre;
		this.edad = edad;
	}

	//Estos son los getters (Se usa para obtener la propiedad)
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	//Y estos los setters (Se usa para establecer la propiedad)
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//creo que no es necesario explicar que hace esta función 🗿
	public void mostrar() {
		System.out.println("Nombre:"+nombre);
		System.out.println("Edad: "+edad);
	}
}
```
> En otro archivo (El que vas a ejecutar):
```java
public class MainPrsGetSet {
	public static void main(String[] args) {
		PersonGetSet p1 = new PersonGetSet("Luis el más activo", 19); //lo voy a dejar xd
		p1.setEdad(99); //ahora tiene 99 anos digo años
		p1.setNombre("Patatudo"); //nose si es nombre pero es su nuevo valor
		p1.getEdad(); //esto retorda la edad, se le puede asignar a una variable
		p1.mostrar(); //🤓
	}
}
```
### Un metodo
La función `toString()` va a retornar un valor String de la clase. 
```java
public class DogOver {
    String name;
    int age;

    public String toString() {
        return "Gato perro, nombre: "+this.name+" edad: "+this.age;
    }
}
```

### Sobrecargas
Las sobrecargas se usan para argumentos opcionales, oséa colocar los argumentos que crees que son obligatorios.
> Se define la clase con sobrecargas.
```java
public class Vehicle {
    int prec;
    String name;
    int num_pas = 0;
    String color = "";
    public Vehicle(int pre, String nam) { //argumentos obligatiorios xd
        this.prec = pre;
        this.name = nam;
        System.out.println("Precio: " + pre + " Nombre del carro: " + nam);
    }

    public Vehicle(int pre, String nam, int num_pas) { //sobrecarga de argumentos
        this.prec = pre;
        this.name = nam;
        this.num_pas = num_pas;
        System.out.println("Precio: " + pre + " Nombre del carro: " + nam);
        System.out.println("Número de pasajeros: " + num_pas);
    }

    public Vehicle(int pre, String nam, int num_pas, String color) { //otra sobrecarga mas
        this.prec = pre;
        this.name = nam;
        this.num_pas = num_pas;
        this.color = color;
        System.out.println("Precio: " + pre + " Nombre del carro: " + nam);
        System.out.println("Número de pasajeros: " + num_pas + " Color: " + color);
    }
}
```
>En el archivo ejecutable:
```java
public class MainVehicl {
    public static void main(String[] args) {
        new Vehicle(0, "pedrito"); // los 2 primeros argumentos
        new Vehicle(45, "si", 3); // sobrecarga con número de pasajeros
        new Vehicle(12, "juan", 12, "rojito"); //sobrecarga con color también
    }
}

```

### Tarea insana de Clases
Esta es la tarea de los 3 polígonos que los vamos a crear en Clases independientes, salu2 ♻️♻️

> **Circunferencia class**
```java
package sem_2.Tarea.ClassObj;

public class CIRCUNFERENCIA {
	private String inicio; //las propiedades de la clase son privadas por los getters y setters 🤓
	private int radio;
	
	public CIRCUNFERENCIA(String inicio, int radio) { //el constructor con 2 parámetros que son
		this.inicio = inicio; //el nombre xd
		this.radio = radio; //el radio del círculo 🗿
	}
	
	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public void consola() { //una función para que muestre todo 
		if (radio<=0) {
			System.out.println("Un radio negativo o con valor 0 no existe 🤓☝");
			return;
		}

		System.out.println("El Área es: "+ Math.pow(radio, radio)+"π");
		System.out.println("La Longitud es: "+ Math.PI*radio);  //mexikong
	}	
}
```
> **Cuadrado class**
```java
package sem_2.Tarea.ClassObj;

public class CUADRADO { // lo mismo, propiedades privadas
	private String causa;
	private int lado;
	
	public CUADRADO(String causa, int lado) { //el constructor
		this.causa = causa;
		this.lado = lado;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public void imprime() { //una función insana para la consola
		if (lado<=0) {
			System.out.println("Un lado negativo o con valor 0 no existe 🤓☝");
			return;
		}
		System.out.println(causa +". El resultado de tu ejercicio es: ");
		System.out.println("El perímetro es: "+ (4*lado));
		System.out.println("EL área es: "+ Math.pow(lado,2));
	}
}
```
> **Triángulo class**
```java
package sem_2.Tarea.ClassObj;

public class TRIANGULO {
    private String Pololo; //esta propiedad es el nombre 🤓
    private int l1;
    private int l2;
    private int l3;

    public TRIANGULO(String pololo, int l1, int l2, int l3) {
        Pololo = pololo;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    public String getPololo() {
        return Pololo;
    }
    public void setPololo(String pololo) {
        Pololo = pololo;
    }
    public int getL1() {
        return l1;
    }
    public void setL1(int l1) {
        this.l1 = l1;
    }
    public int getL2() {
        return l2;
    }
    public void setL2(int l2) {
        this.l2 = l2;
    }
    public int getL3() {
        return l3;
    }
    public void setL3(int l3) {
        this.l3 = l3;
    }
    
    public void consola() {
        double semip = (l1+l2+l3) / 2; // el semiperímetro, es para calcular el área xd
        double eq = Math.sqrt(semip * (semip - l1) * (semip - l2) * (semip - l3));
        if (eq<=0){
            System.out.println("El mas inteligente creando un triangulo con un lado menor a 0 🧠");
            return;
        }

        System.out.println(Pololo+"El Resultado es: ");
        System.out.println("El área es: " + eq);
        System.out.println("El perímetro es: "+ (l1+l2+l3));
    }
}
```
Esos fueron las clases de cada polígono es para ejecutarlos en otros archivos los ejecutables 😺
> **Círculo ejecutable** 

Esto ejecuta e invoca la clase de la circunferencia, igual con los demás ejecutables.
```java
package sem_2.Tarea.Executables;
import java.util.Scanner;

import sem_2.Tarea.ClassObj.CIRCUNFERENCIA;
public class MainC {

	public static void main(String[] args) {
        //no hay mucho que explicar un simple scanner nada mas
		CIRCUNFERENCIA c1 = new CIRCUNFERENCIA("Artu🧠", 5);
		Scanner mongoDB = new Scanner(System.in);
		
		System.out.println("HOLA UNECINO, INGRESA TU NOMBRE DE PILA: ");
		c1.setInicio(mongoDB.nextLine());
		
		System.out.println("Ingresa el radio: ");
		c1.setRadio(mongoDB.nextInt());
		mongoDB.close();
		
		c1.consola();
	}
}
```
> **Cuadrado ejecutable**
```java
package sem_2.Tarea.Executables;
import java.util.Scanner;

import sem_2.Tarea.ClassObj.CUADRADO;
public class MainD {

	public static void main(String[] args) {
		CUADRADO d1 = new CUADRADO("PepitoElMasCapito", 6);
		Scanner she = new Scanner(System.in);
		
		System.out.println("Unecino, ingesa tu nombre: ");
		d1.setCausa(she.nextLine());
		
		System.out.println("Ingresa un lado: ");
		d1.setLado(she.nextInt());
	
		she.close();
		d1.imprime();
	}

}
```
> **Triángulo ejecutable**
```java
package sem_2.Tarea.Executables;
import java.util.Scanner;

import sem_2.Tarea.ClassObj.TRIANGULO;

public class MainT {

    public static void main(String[] args) {
        Scanner tri = new Scanner(System.in);
        TRIANGULO t1 = new TRIANGULO("JuanitoElMasCapito", 1, 2, 3);
        
        System.out.println("Unecino, ingesa tu nombre: ");
		t1.setPololo(tri.nextLine());
		
		System.out.println("Ingresa un lado 1: ");
		t1.setL1(tri.nextInt());
		
		System.out.println("Ingresa un lado 2: ");
		t1.setL2(tri.nextInt());
		
		System.out.println("Ingresa un lado 3: ");
		t1.setL3(tri.nextInt());
		
		tri.close();
        t1.consola();
    }
}
```