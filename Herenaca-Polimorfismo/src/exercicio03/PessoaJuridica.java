package exercicio03;

public class PessoaJuridica extends Contribuinte{
	private int numeroFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	int minimo = 10;
	int taxaMenor = 14;
	int taxaMaior = 16;
	
	@Override
	public double calculaImposto() {
		double impostoDevido = 0;
		if(this.numeroFuncionarios > minimo) {
			double imposto = ((this.rendaAnual / 100) * taxaMenor);
			
			impostoDevido = imposto;
		} else {
			double imposto = ((this.rendaAnual / 100) * taxaMaior);
			
			impostoDevido = imposto;
		}
		
		return impostoDevido;
	}
	
	
}
