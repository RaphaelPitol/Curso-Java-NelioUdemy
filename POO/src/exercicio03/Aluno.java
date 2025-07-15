package exercicio03;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	
	public double calculaMedia() {
		media = (nota1 + nota2 + nota3);
		return media;
	}
	
	public String aprovadoOuNao() {
		if(media >= 60.0) {
			return nome + " Passd";
		}else {
			double dif = 60 - media;
			return nome+" Failed, falta "+dif+"pontos";
		}
	}

}
