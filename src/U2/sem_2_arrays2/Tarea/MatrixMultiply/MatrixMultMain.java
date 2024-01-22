import java.util.Scanner;

public class MatrixMultMain {

    public static void main(String[] args) {
        Scanner MM = new Scanner(System.in);
        System.out.println("----Primera Matrix----");
        System.out.println("Coloca la longitud (filas) de la matriz: ");
        int lx = MM.nextInt();
        System.out.println("Coloca la longitud (columnas) de la matriz: ");
        int ly = MM.nextInt();

        MatrixClassMultiply Primera = new MatrixClassMultiply(lx,ly);
        System.out.println("MATRIZ A: ");
        Primera.Digita();

        System.out.println("----Segunda Matrix----");
        System.out.println("Coloca la longitud (filas) de la matriz: ");
        int llx = MM.nextInt();
        System.out.println("Coloca la longitud (columnas) de la matriz: ");
        int lly = MM.nextInt();

        MatrixClassMultiply Segunda = new MatrixClassMultiply(llx,lly);
        System.out.println("MATRIZ B: ");
        Segunda.Digita();

        MatrixClassMultiply resultado = Primera.MultMatrix(Segunda);
        resultado.Consola();
        MM.close();
    }
}
