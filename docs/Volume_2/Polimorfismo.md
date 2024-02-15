# Polimorfismo
Primer tema de la segunda unidad, omg.
Empezamos con que el polimorfismo es que una clase responda al momento de una invocación de una manera distinta según el tipo de parámetros que se le brinde.

## Clases abstractas
Una clase abstracta es una clase que por si sola no tiene función alguna, pero que se usa como modelo para crear otra clase, ejm:

> Clase abstracta:

[Ver](../../src/U2/sem_1_polimosfirm/Account/Account.java) archivo.
```java
public abstract class Account { //Esta clase no tiene función 🤓
    public String numCount;
    public double saldo;
    public String titular;

    public abstract double interes(); //Este método lo van a tener todas las clases que se deriven de esta.
}

```

## Clases derivadas de la abstracta
Estas clases son las que se van a derivar de la [clase padre](#clases-abstractas), para crearse.

> Clase derivada de la clase anterior:

[Ver](../../src/U2/sem_1_polimosfirm/Account/AccountFixed.java) Archivo.
```java
package U2.sem_1_polimosfirm.Account;

public class AccountFixed extends Account {
    @Override
    public double interes() { // El metodo que debe de tener 😺
        return this.saldo;
    }
}
```

> Otra clase derivada:

[Ver](../../src/U2/sem_1_polimosfirm/Account/AccountSaving.java) archivo.
```java
public class AccountSaving extends Account{
    @Override
    public double interes() { // El metodo que debe de tener otra vez 😺
        return this.saldo*0.05d;
    }
}
```

## Clase interfaz
Estas clases normalmente se usan para crear metodos que luego en las subclases se tienen que definir con una acción, ademas de la siguiente clase se van a mostrar mas clases que deriven de Figura.

>**Clase interfaz**

Ver [archivo](../../src/U2/sem_1_polimosfirm/Figure/IFigura.java)

```java
package U2.sem_1_polimosfirm.Figure;

public interface IFigura{
    void showArea();
    void showPerimeter();
}
```

>**Clase abstracta**

Ver [archivo](../../src/U2/sem_1_polimosfirm/Figure/Figura.java)
```java
package U2.sem_1_polimosfirm.Figure;

public abstract class Figura {
    protected double area;
    protected double perimeter;

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
```

>**Clases derivada**

Estas clases son extendidas de la clase anterior.

Ver [archivo.](../../src/U2/sem_1_polimosfirm/Figure/Circle.java)
```java
package U2.sem_1_polimosfirm.Figure;

public class Circle extends Figura implements IFigura {
    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void showArea() {
        double area =  Math.PI*Math.pow(radius, 2);
        this.area = area;
        System.out.println("Area del círculo insano: " + area);
    }

    @Override
    public void showPerimeter() {
        double perimeter = Math.PI*radius*2;
        this.perimeter = perimeter;
        System.out.println("Perímetro del círculo insano: " + perimeter);
    }
}
```

Ver [archivo.](../../src/U2/sem_1_polimosfirm/Figure/Triangle.java)
```java
package U2.sem_1_polimosfirm.Figure;

public class Triangle extends Figura implements IFigura {
    public double l1, l2, l3;
    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public void showArea() {
        double sp = (l1+l2+l3)/2;
        double area = Math.sqrt((sp*(sp-l1)*(sp-l2)*(sp-l3)));
        this.area = area;
        System.out.println("Area del triangulo insano: " + area);
    }

    @Override
    public void showPerimeter() {
        double perimeter = l1+l2+l3;
        this.perimeter = perimeter;
        System.out.println("Perímetro del triangulo insano: " + perimeter);
    }
}
```