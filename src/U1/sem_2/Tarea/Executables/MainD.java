package sem_2.Tarea.Executables;
import java.util.Scanner;
import sem_2.Tarea.ClassObj.CUADRADO;

public class MainD {
	public static void main(String[] args) {
		CUADRADO d1 = new CUADRADO("PepitoElMasCapito", 6);
		Scanner she = new Scanner(System.in);
		
		System.out.println("Unecino, ingesa tu nombre: ");
		d1.setCausa(she.nextLine());
		
		System.out.println("Ingresa un lado: ");
		d1.setLado(she.nextInt());
	
		she.close();
		d1.imprime();
	}
}
