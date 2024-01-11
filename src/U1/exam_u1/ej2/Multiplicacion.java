package exam_u1.ej2;

public class Multiplicacion extends Operacion {
    public Multiplicacion(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void resolver() {
        System.out.println("El resultado de la multiplicación de " + num1 + "/" + num2);
        System.out.println("Es " + (num1*num2));
    }
}