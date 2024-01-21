package U2.sem_2_arrays2.Tarea.TransposedMatrix;

public class Matrix2d {
    public int[][] mainMatrix;
    public int[][] transposedMatrix;
    public int x_l;
    public int y_l;
    // private
    private boolean transpoosed = false;
    private boolean normal = false;

    public Matrix2d(int length, int width) {
        this.mainMatrix = new int[length][width];
        this.transposedMatrix = new int[length][width];
        this.x_l = length;
        this.y_l = width;
    }

    public void generateRandom(int limit) {
        normal = true;
        for (int i = 0; i < mainMatrix.length; i++) {
            for (int j = 0; j < mainMatrix[0].length; j++) {
                mainMatrix[i][j] = (int)(Math.random()*limit);
            }
        }
    }

    public void generateOrder(int start) {
        normal = true;
        for (int i = 0; i < mainMatrix.length; i++) {
            for (int j = 0; j < mainMatrix[0].length; j++) {
                mainMatrix[i][j] = start;
                start++;
            }
        }
    }

    public void generateTransposed() {
        if(!normal) {
            throw new Error("Para generar la matriz transpuesta se necesita la normal, usa generateRandom() o generateOrder().");
        }
        transpoosed = true;
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                transposedMatrix[i][j] = mainMatrix[j][i];
            }
        }
    }

    public void printMatrix() {
        System.out.println("\n -------------------------- NORMAL --------------------------");
        if(!normal) {
            System.out.println("(Not generated)");
            return;
        }
        for (int i = 0; i < mainMatrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < mainMatrix[0].length; j++) {
                String number = String.format("%02d", mainMatrix[i][j]);
                System.out.print(" " + number);
            }
        }

        System.out.println("\n -------------------------- TRANSPOSED --------------------------");
        if(!transpoosed) {
            System.out.println("(Not generated)");
            return;
        }
        for (int i = 0; i < transposedMatrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                String number = String.format("%02d", transposedMatrix[i][j]);
                System.out.print(" " + number);
            }
        }
    }
}