[Volver](../Info.md)
# Tarea insana de Clases
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
### Herencia de clases
La herencia de clases es basicamente usar propiedades de una clase superior para no volver a escribirla, una subclase puede _heredar_ las propiedades y metodos de su clase superior.

> **La super clase:**

Basicamente aquí esta lo que se va a heredar para las subclases.
```java
package sem_3.Class;

public class Transport {
    public int capacity;
    public String placa;
    public String color;

    //Este constructor es el por defecto
    public Transport() {
        this.capacity = 0;
        this.placa = "000-000";
        this.color = "null";
    }

    public Transport(int capa, String placa, String color) {
        //son 3 atributos los que va a tener la superclase, que son los 3 siguientes 🐒
        this.capacity = capa;
        this.placa = placa;
        this.color = color;
    }

    //Estos son los metodos por defecto de la clase Transport
    public void run() {
        System.out.println("El vehículo insano se mueve.");
    }

    public void stop() {
        System.out.println("El vehículo insano paró.");
    }
}
```
>**Una subclase (Car)**

Esta es una subclase, es decir es de tipo Tranport pero los metodos son distintos, en vez de vehículo insano, ahora es terrneitor.
```java
package sem_3.Class;

public class Car extends Transport{
    public Car(int capa, String p, String color) {
        super(capa, p, color);    
    }

    //Estos metodos se sobrecargan para que no salga como en la clase padre
    @Override
    public void run() {
        System.out.println("El terreneitor avanzó.");
    }

    @Override
    public void stop() {
        System.out.println("El terreneitor paró.");
    }

    //Este método es propio de Car
    public void derrapar() {
        System.out.println("Derrapación god.");
    }

    //Muestra toda la info
    public void show_all() {
        System.out.println("Vehículo insano god.");
        System.out.println("Capacidad: " + capacity);
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
    }
}

```
>**Otra subclase (Plane)**
Esta es otra subclase, esta vez es un avionsito insano.
```java
package sem_3.Class;

public class Plane extends Transport {
    public Plane(int capa, String p, String color) {
        super(capa, p, color);
    }
    //Lo mismo, los metodos se sobrecargan para que no salga como en la clase padre
    @Override
    public void run() {
        System.out.println("El avionsito avanzó.");
    }

    @Override
    public void stop() {
        System.out.println("El avionsito paró.");
    }

    //Ahora este metodo es propio de la clase Plane
    public void planear() {
        System.out.println("Planea de la manera mas épica posible");
    }
}

```
>**En el ejecutable:**

Aquí vamos a usar los ejemplos de clase, sublcase y superclase.
```java
package sem_3.executable;
import sem_3.Class.*;

public class MainT {
    public static void main(String[] args) {
        System.out.println(" -------------- Transporte (No heredación) -------------- ");
        Transport t = new Transport(5, "AD2-SR3", "Morao");
        t.run(); //va a imprimir lo del vehículo insano
        t.stop(); //va a parar el vehículo insano
        System.out.println(" -------------- Carro -------------- ");
        Car c = new Car(5, "ADN-313", "Rojo");
        c.run(); //ahora en vez de vehículo será terreneitor
        c.stop();
        c.derrapar(); //esta función es única de esta clase
        System.out.println(" -------------- Avión -------------- ");
        Plane a = new Plane(20, "789", "Blanco");
        a.run(); //y ahora va a aparecer avión
        a.stop();
        a.planear(); //planear xdxd
    }
}
```

>**En otro ejecutable**

Esto es con scanner porque es taréa, xd.
```java
public class MainTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserta capacidad.");
        int cap = input.nextInt();
        System.out.println("Inserta placa.");
        String placa = input.next();
        System.out.println("Inserta inserta color.");
        String color = input.next();
        input.close();
        System.out.println(" -------------- Avión -------------- ");
        Plane a = new Plane(cap, placa, color);
        a.run(); //y ahora va a aparecer avión
        a.stop();
        a.planear(); //planear xdxd
        a.show_all();
    }
}
```