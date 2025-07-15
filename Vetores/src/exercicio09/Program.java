package exercicio09;

import java.util.Locale;
import java.util.Scanner;

import exercicio09.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a quantidade de Pessoas?");
		int qtd = sc.nextInt();

		Pessoa[] vetPessoa = new Pessoa[qtd];
		String[] nomes;
		int idadeMaior = 0;
		String nomeP = "";

		for (int i = 0; i < vetPessoa.length; i++) {
			sc.nextLine();
			int a = i + 1;
			System.out.println("Qual o nome da " + a + "a pessoa:");
			String nome = sc.nextLine();
			System.out.println("Qual idade " + a + "a pessoa:");
			int idade = sc.nextInt();

			vetPessoa[i] = new Pessoa(nome, idade);

		}

		for (int i = 0; i < vetPessoa.length; i++) {
			if (vetPessoa[i].getIdade() > idadeMaior) {
				idadeMaior = vetPessoa[i].getIdade();
				nomeP = vetPessoa[i].getNome();
			}
		}
		System.out.println("PESSOA MAIS VELHA: "+ nomeP);
		sc.close();

	}

}
