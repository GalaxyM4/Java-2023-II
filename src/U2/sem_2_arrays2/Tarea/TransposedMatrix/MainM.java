package U2.sem_2_arrays2.Tarea.TransposedMatrix;

public class MainM {
    public static void main(String[] args) {
        Matrix2d ma = new Matrix2d(4, 4);
        ma.generateRandom(50);
        ma.generateTransposed();
        ma.printMatrix();
    }
}
