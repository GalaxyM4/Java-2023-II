package U2.sem_2_arrays2.Unidimensionales;
import java.util.Scanner;

public class LeerArreglos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Número de elementos");
		int n=sc.nextInt();
		int [] camilo = new int[n];

		// Leer vector

		// for(int i=0; i<camilo.length; i++) {
		//System.out.printf("c[" + (i+1) +"]");
		//camilo[i] = sc.nextInt();
		// }

		// Generar el Vector
		for(int i=0; i<camilo.length; i++) { 
			camilo[i] = (int)(Math.random()*50);
		}

		// Mostrar el vector

		for(int i=0; i<camilo.length; i++) {
			System.out.print(camilo[i] + "\t");
		}
		System.out.println();

		sc.close();

	}
}