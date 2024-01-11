package sem_3.Class;

public class Triangle extends Figure {
    private double l1;
    private double l2;
    private double l3;

    public Triangle(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        if(l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("El mas inteligente creando un lado menor a 0 🧠");
            this.l1 = this.l2 = this.l3 = 0;
        }
    } 

    @Override
    public void showArea() {
        double sp = (l1+l2+l3)/2;
        System.out.println("El area pe: " + Math.sqrt((sp)*(sp-l1)*(sp-l2)*(sp-l3)));
    }

    @Override
    public void showPerimeter() {
        System.out.println("El perímetro pe: " + (l1+l2+l3));
    }
}
