## Polimorfismo
Primer tema de la segunda unidad, omg.
Empezamos con que el polimorfismo es que una clase responda al momento de una invocación de una manera distinta según el tipo de parámetros que se le brinde.

### Clases abstractas
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

### Clases derivadas de la abstracta
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

Luego añado los otros ejemplos 🦍