package produto;

public class Produto {
	public String nome;
	public double preco;
	public int estoque;

	public double valorTotal() {
		double total = estoque * preco;
		return total;
	}

	public void addEstoque(int estoque) {
		this.estoque += estoque;
	}

	public void remEstoque(int estoque) {
		this.estoque -= estoque;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome 
				+ ", R$" 
		+ String.format("%.2f", preco) 
		+ ", " 
		+ estoque 
		+" un, Total: R$"
		+ String.format("%.2f", valorTotal());
	}
}
