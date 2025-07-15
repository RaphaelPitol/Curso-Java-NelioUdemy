package entity;

public class Account {
	private int numeroConta;
	private Pessoa pessoa;
	private double saldo;
	private int taxa = 5;
	
	public Account(int numeroConta, Pessoa pessoa) {
		this.numeroConta = numeroConta;
		this.pessoa = pessoa;
	}
	public Account(int numeroConta, Pessoa pessoa, Double deposito) {
		this.numeroConta = numeroConta;
		this.pessoa = pessoa;
		deposito(deposito);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void saldoInicial(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	public void saque(double saque) {
		this.saldo = saldo - saque - taxa;
	}
	
	@Override
	public String toString() {
		
		return "Conta:"
				+numeroConta
				+" Titula: "
				+pessoa.getNome()
				+" Saldo R$"
				+ String.format("%.2f", saldo);
		
	}
	
}
