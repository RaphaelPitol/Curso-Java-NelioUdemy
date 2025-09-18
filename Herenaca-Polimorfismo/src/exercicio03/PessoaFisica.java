package exercicio03;

public class PessoaFisica extends Contribuinte {
	private Double gastoSaude = 0.0;

	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	int minimo = 20000;
	int taxaMenor = 15;
	int taxaMaior = 25;
	int saudeDesconto = 50;
	@Override
	public double calculaImposto() {
		double impostoDevido = 0;
		if(this.rendaAnual < minimo) {
			double imposto = ((this.rendaAnual / 100) * taxaMenor);
			double descontoSaude = ((this.gastoSaude / 100) * saudeDesconto);
			
			impostoDevido = imposto - descontoSaude;
		} else {
			double imposto = ((this.rendaAnual / 100) * taxaMaior);
			double descontoSaude = ((this.gastoSaude / 100) * saudeDesconto);
			
			impostoDevido = imposto - descontoSaude;
		}
		
		return impostoDevido;
	}
	
	
}
