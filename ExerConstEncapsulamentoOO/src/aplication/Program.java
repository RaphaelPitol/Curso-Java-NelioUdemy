package aplication;

import java.util.Locale;
import java.util.Scanner;

import entity.Account;
import entity.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numeroConta;
		double deposito;
		
		Account conta;
		
		Pessoa p = new Pessoa();
	
		System.out.println("Digite o numero da conta:");
		numeroConta = sc.nextInt();
		System.out.println("Digite o nome do titular:");
		sc.nextLine();
		String nome = sc.nextLine();
		p.setNome(nome);
		
		System.out.println("Deseja fazer depodito inicial? S ou N");
		char opcao = sc.next().charAt(0);
		System.out.println(opcao);
		
		if(opcao == 's') {
			System.out.println("Informe o valor do deposito inicial:");
			deposito = sc.nextDouble();			
			conta = new Account(numeroConta, p, deposito);
		}else {
			conta = new Account(numeroConta, p);
		}
	
		System.out.println(conta.toString());
		
		System.out.println("fazer um saque:");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println(conta.toString());
		
		System.out.println("Fazer deposito");
		deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println(conta.toString());
				
		
		sc.close();

	}

}
