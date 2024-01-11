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
