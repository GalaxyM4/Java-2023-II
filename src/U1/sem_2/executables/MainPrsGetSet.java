package sem_2.executables;
import sem_2.Class.PersonGetSet;

public class MainPrsGetSet {
	public static void main(String[] args) {
		PersonGetSet p1 = new PersonGetSet("Luis el más activo", 19); //lo voy a dejar xd
		p1.setEdad(99); //ahora tiene 99 anos digo años
		p1.setNombre("Patatudo"); //nose si es nombre pero es su nuevo valor
		p1.getEdad(); //esto retorda la edad, se le puede asignar a una variable
		p1.mostrar();
	}
}
