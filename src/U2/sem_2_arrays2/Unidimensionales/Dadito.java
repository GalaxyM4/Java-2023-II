package U2.sem_2_arrays2.Unidimensionales;
import java.security.SecureRandom;

public class Dadito {
	public static void main(String[] args) {
		SecureRandom r = new SecureRandom();
		int [] dado = new int[11];

		// Lanzamientos
		for (int i= 0; i<60000 ; i++ ) {
			dado[1+r.nextInt(10)]++;
		}
		System.out.printf("%s%15s%n", "cara", "frecuencia");

		// Mostrar resultados
		for(int cara=1; cara<dado.length; cara++) {

			System.out.printf("%4d%15d%n", cara, dado[cara]);
		}

	}
}
