package U2.sem_1_polimosfirm.executables;
import U2.sem_1_polimosfirm.Figure.*;

public class MainF {
    public static void main(String[] args) {
        IFigura[] figures = new IFigura[4];
        figures[0] = new Circle(5);
        figures[1] = new Triangle(3,3,3);
        figures[2] = new Circle(2);
        figures[3] = new Triangle(2,3,5);

        for (IFigura figura : figures) {
            figura.showArea();
            figura.showPerimeter();
        }
    }
}
