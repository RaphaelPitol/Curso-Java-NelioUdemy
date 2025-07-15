package exercicio11;

public class Pessoa {
	private String genero;
	private double altura;
	public Pessoa(String genero, double altura) {
		super();
		this.genero = genero;
		this.altura = altura;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
