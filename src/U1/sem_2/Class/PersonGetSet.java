package sem_2.Class;

public class PersonGetSet { //grasias arturo no termine el getset xdxd
    private String nombre;
	private int edad;
	
	public PersonGetSet(String nombre, int edad) { //el constructor con sus respectivos parámetros
		this.nombre = nombre;
		this.edad = edad;
	}

	//Estos son los getters (Se usa para obtener la propiedad)
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	//Y estos los setters (Se usa para establecer la propiedad)
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//creo que no es necesario explicar que hace esta función 🗿
	public void mostrar() {
		System.out.println("Nombre:"+nombre);
		System.out.println("Edad: "+edad);
	}
}
