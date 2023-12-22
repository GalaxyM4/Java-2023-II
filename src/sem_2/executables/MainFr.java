package sem_2.executables;
import sem_2.Class.Fracción;

public class MainFr {
	public static void main(String[] args) {
		Fracción f = new Fracción(); //fracción por defecto (1/2)
		f.show(); //el metodo que muestra xd
		Fracción f2 = new Fracción(3,4); // esta fracción con constructores
		f2.show();
	}

}
