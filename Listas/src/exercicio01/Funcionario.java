package exercicio01;

public class Funcionario {
	private String nome;
	private int id;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumento(double porcentagem) {
		double valor = (this.salario / 100) * porcentagem;
		this.salario = salario + valor;
	}
	
	@Override
	public String toString() {
		
		return "ID"+id+", Nome:"+nome+", Salario R$"+salario;
	}
	
}
