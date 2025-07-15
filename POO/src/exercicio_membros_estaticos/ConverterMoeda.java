package exercicio_membros_estaticos;

public class ConverterMoeda {
	
	public static double dolar(double preco, int qtd) {
		//6% iof
		double iof = (preco * qtd / 100) * 6;
		double total = (preco * qtd) + iof;
		return total;
		
	}

}
