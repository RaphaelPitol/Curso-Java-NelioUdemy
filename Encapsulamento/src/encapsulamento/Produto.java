package encapsulamento;

public class Produto {
	private String nome;
	private double preco;
	private int estoque;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}


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
