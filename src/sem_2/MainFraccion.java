package Fracciones;

public class MainF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frac1 f= new Frac1();
		f.numerador=5;
		f.denominador=0;
		
		
		if (f.denominador == 0) {
			f.numerador=f.numerador; 
			f.denominador=1;
		}
		else {
			f.numerador=f.numerador;
			f.denominador=f.denominador; 
		}
		
		System.out.println(f.numerador + "/" + f.denominador);
	}

}
