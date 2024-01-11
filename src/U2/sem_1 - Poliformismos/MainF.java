package Polimorfismos;

public class MainF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IFigura figura[] = new IFigura[5];
		figura[0] = new Circulo(1.0);
		figura[1] = new Triángulo(1.0,2.0,3.0,1.0,1.0);
		figura[2] = new Circulo(2.0);
		figura[3] = new Triángulo(1.0,2.0,3.0,1.0,1.0);
		figura[4] = new Circulo(10.0);
		
		for(IFigura i:figura) {
			i.calculaArea();
			i.calculaPerimetro();
			
			System.out.println(i.getnombre());
			
			System.out.println(i.getArea());
			System.out.println(i.getPerimetro());
			
			System.out.println("CAMILOOOOO");
		}
	}

}
