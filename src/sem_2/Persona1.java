package Algoritmos;

public class Persona {
	public String nombre;
	public int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	} 
	
	public void mostrar() {
		System.out.println("El nombre es: "+nombre); 
		System.out.println("La edad es: "+edad);
	}

}

