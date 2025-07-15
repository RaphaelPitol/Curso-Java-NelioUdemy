package exercicio12;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno[] quartos = new Aluno[10];
		
		System.out.println("Quantos Alunos vao alugar?");
		int qtdAlugueis = sc.nextInt();
		
		for(int i = 0; i < qtdAlugueis; i++) {
			sc.nextLine();
			System.out.println("Qual o nome do Aluno?");
			String nome = sc.nextLine();
			System.out.println("Qual o email do Aluno?");
			String email = sc.nextLine();
			System.out.println("Informe o numero do quarto de 0 a 9:");
			int quarto = sc.nextInt();
			
			quartos[quarto] = new Aluno(nome, email);
		}
		
		System.out.println("Quartos Alugados:");
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i + " : "+ quartos[i].getNome()+", "+ quartos[i].getEmail());
			}
		}
		
		sc.close();
	}
}
