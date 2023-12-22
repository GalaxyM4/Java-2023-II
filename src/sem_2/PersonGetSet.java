package sem_2;

public class PersonGetSet { //grasias arturo no termine el getset xdxd
    private String nombre;
	private int edad;
	
	public PersonGetSet(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	} 
		
	public void mostrar() {
		System.out.println("Nombre:"+nombre);
		System.out.println("Edad: "+edad);
	}
}
