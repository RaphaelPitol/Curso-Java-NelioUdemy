package exercicio02;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto = 1000;
	
	public double salarioLiquido() {
		return salario - imposto;
	}
	public double aumentoSalario(double aumento) {
		this.salario += salario / 100 * aumento;
		return salario;
	}

}
