package sem_3.Class;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if(radius <= 0) {
            System.out.println("Pero dale pibe, poné un número mayor a 0");
            radius = 1;
        }
    }

    @Override
    public void showArea() {
        System.out.println("El área del circulito: " + (Math.pow(radius, 2)*Math.PI));
    }

    @Override
    public void showPerimeter() {
        System.out.println("Perímetro: " + 2*Math.PI*radius);
    }
}
