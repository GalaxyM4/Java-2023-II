package sem_2.Tarea.ClassObj;

public class CUADRADO {
	private String causa;
	private int lado;
	
	public CUADRADO(String causa, int lado) {
		this.causa = causa;
		this.lado = lado;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public void imprime() {
		if (lado<=0) {
			System.out.println("Un lado negativo o con valor 0 no existe 🤓☝");
			return;
		}
		System.out.println(causa +". El resultado de tu ejercicio es: ");
		System.out.println("El perímetro es: "+ (4*lado));
		System.out.println("EL área es: "+ Math.pow(lado,2));
	}
}
