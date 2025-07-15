package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de Pessoas?");
		int qtd = sc.nextInt();
		
		Pessoa[] vetPessoa = new Pessoa[qtd];
		String[] nomes;
		
		double alturaMedia = 0.0;
		double porcentagemPessoa = 100 / vetPessoa.length;
		int qtdMenos16 = 0;
		
		for(int i = 0; i < vetPessoa.length; i++) {
			sc.nextLine();
			 int a = i + 1; 
			System.out.println("Qual o nome da "+a+"a pessoa:");
			String nome = sc.nextLine();
			System.out.println("Qual idade "+a+"a pessoa:");
			int idade = sc.nextInt();
			System.out.println("Qual altura "+a+"a pessoa:");
			double altura = sc.nextDouble();
			
			vetPessoa[i] = new Pessoa(nome, altura, idade);
			
			alturaMedia += vetPessoa[i].getAltura();
			
			if(vetPessoa[i].getIdade() < 16) {
				qtdMenos16 += 1;
			}
		}
			
		
		System.out.printf("Altura media: %.2f%n", alturaMedia / vetPessoa.length);
		System.out.println("Pessoas com menos de 16 anos "+qtdMenos16 * porcentagemPessoa +"%");
		
		for(int i = 0; i < vetPessoa.length; i++) {
			if(vetPessoa[i].getIdade() < 16) {
				System.out.println("nome:"+vetPessoa[i].getNome());
			}
		}
		
		sc.close();

	}

}
