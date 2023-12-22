package sem_2.Class;
import java.util.Scanner;
public class Circulito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radio;
		String nombre;
		
		Scanner exe = new Scanner(System.in);
		System.out.println("HOLA CAUSA, INGRESA TU NOMBRE: ");
		nombre=exe.nextLine();
		
		System.out.println(nombre + ". Ingresa  el Radio de la Circunferencia: ");
		radio = exe.nextInt();
		exe.close();

		System.out.println("El Área es: "+Math.pow(radio, radio)+"π");
		System.out.println("La Longitud es: "+ 2*Math.PI*radio);
	}

}
