public class Circulo extends Figura implements IFigura {

	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void calculaArea() {
		// TODO Auto-generated method stub
		area=Math.PI*radio*radio;
	}

	@Override
	public void calculaPerimetro() {
		// TODO Auto-generated method stub
		perimetro=2.0*Math.PI*radio;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return perimetro;
	}

	@Override
	public String getnombre() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
