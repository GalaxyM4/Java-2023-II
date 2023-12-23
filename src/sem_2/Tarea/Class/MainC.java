package Tarea;
import java.util.Scanner;
public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CIRCUNFERENCIA c1 = new CIRCUNFERENCIA("Artu", 5);
		Scanner mongoDB = new Scanner(System.in);
		
		System.out.println("HOLA UNECINO, INGRESA TU NOMBRE DE PILA: ");
		c1.setInicio(mongoDB.nextLine());
		
		System.out.println("Ingresa el radio: ");
		c1.setRadio(mongoDB.nextInt());
		mongoDB.close();
		
		c1.getRadio();
		c1.getInicio();
		c1.consola();

	}

}
