package sem_2.Tarea.ClassObj;

public class CIRCUNFERENCIA {
	private String inicio;
	private int radio;
	
	public CIRCUNFERENCIA(String inicio, int radio) {
		this.inicio = inicio;
		this.radio = radio;
	}
	
	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public void consola() {
		if (radio<=0) {
			System.out.println("Un radio negativo o con valor 0 no existe 🤓☝");
			return;
		}

		System.out.println("El Área es: "+ Math.pow(radio, radio)+"π");
		System.out.println("La Longitud es: "+ Math.PI*radio);  //mexikong
	}	
}