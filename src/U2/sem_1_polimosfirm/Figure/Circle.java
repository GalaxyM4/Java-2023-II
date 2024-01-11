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
