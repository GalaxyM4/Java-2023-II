package exam_u1.ej2;

public class Potenciacion extends Operacion {
    public Potenciacion(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void resolver() {
        System.out.println("El resultado de " + num1 + " elevado a " + num2);
        System.out.println("Es " + Math.pow(num1, num2));
    }
}
