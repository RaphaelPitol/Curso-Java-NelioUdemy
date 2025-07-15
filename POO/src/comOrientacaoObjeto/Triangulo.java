package comOrientacaoObjeto;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double ar;
		double p = (a + b + c) / 2;
		
		ar = Math.sqrt(p*(p - a)*(p -b)*(p - c));
		
		return ar;
	}

}
