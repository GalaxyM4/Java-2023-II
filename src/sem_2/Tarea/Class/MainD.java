package Tarea;
import java.util.Scanner;
public class MainD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CUADRADO d1 = new CUADRADO("a", 6);
		Scanner she = new Scanner(System.in);
		
		System.out.println("Unecino, ingesa tu nombre: ");
		d1.setCausa(she.nextLine());
		
		System.out.println("Ingresa un lado: ");
		d1.setLado(she.nextInt());
	
		she.close();
			
		d1.getCausa();
		d1.getLado();
		d1.imprime();
	}

}
