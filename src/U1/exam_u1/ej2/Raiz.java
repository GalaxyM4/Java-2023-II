package exam_u1.ej2;

public class Raiz extends Operacion {
    public Raiz(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void resolver() {
        System.out.println("El resultado de la raices de √" + num1 + " y √" + num2);
        System.out.println("Es " + Math.sqrt(num1) + " y " + Math.sqrt(num2));
    }
}