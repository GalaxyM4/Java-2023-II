[Volver](../Info.md)
# Clases y objetos
Segundo tema waos.
> Una clase es como un modelo para un objeto, oséa, la clase es el molde de una galleta y el objeto es la galleta 🦆

## Asignar propiedades
Una propiedad, atributo, elemento, como se te salga llamarle, es algo que está dentro de la clase la cual lo puedes cambiar a tu gusto, si es que lo deseas.
> Manualmente, osea desde código, en otras palabras estableces cada propiedad manualmente:

[Ver](../../src/U1/sem_2/Class/Dog.java) archivo.
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

## Constructores
Un constructor es como una función que se usa para establecer las propiedades de una clase al mismo momento en las que se invoca.
> Ejemplo de un constructor, para declararlo tiene que terner el mismo nombre de la clase.

Ver [archivo.](../../src/U1/sem_2/Class/Person.java)
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

Ver [archivo](../../src/U1/sem_2/executables/MainPrs.java)
```java
public class MainPrs {
	public static void main(String[] args) {
		Person pe = new Person("Pedrín", 99); // colocas los parámetros en el mismo orden de la clase 
		pe.show(); // lo muestra 🤓
	}
}
```

## Getters and Setters
Esto normalmente se usa para establecer o obtener las propiedades de una clase, independientemente si esta es privada.
Ver [archivo](../../src/U1/sem_2/Class/PersonGetSet.java)
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

[Ver](../../src/U1/sem_2/executables/MainPrsGetSet.java) archivo.
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
## Un metodo
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

## Sobrecargas
Las sobrecargas se usan para argumentos opcionales, oséa colocar los argumentos que crees que son obligatorios.
> Se define la clase con sobrecargas.

Ver [archivo](../../src/U1/sem_2/Class/Vehicle.java)
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
Ver [arvhivo](../../src/U1/sem_2/executables/MainVehicl.java)
```java
public class MainVehicl {
    public static void main(String[] args) {
        new Vehicle(0, "pedrito"); // los 2 primeros argumentos
        new Vehicle(45, "si", 3); // sobrecarga con número de pasajeros
        new Vehicle(12, "juan", 12, "rojito"); //sobrecarga con color también
    }
}

```