package exercicio10;

import java.util.Locale;
import java.util.Scanner;

import exercicio09.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a quantidade de Alunos?");
		int qtd = sc.nextInt();

		Aluno[] alunos = new Aluno[qtd];

		for (int i = 0; i < alunos.length; i++) {
			sc.nextLine();
			int a = i + 1;
			System.out.println("Qual o nome do " + a + "a Aluno:");
			String nome = sc.nextLine();
			System.out.println("Qual 1 nota  nota Aluno:");
			double n1 = sc.nextDouble();
			System.out.println("Qual 2 nota nota Aluno:");
			double n2 = sc.nextDouble();

			alunos[i] = new Aluno(nome, n1, n2);

		}
		
		System.out.println("ALUNOS APROVADOS:");
		for(int i = 0; i < alunos.length; i++) {
			double media = (alunos[i].getN1() + alunos[i].getN2()) / 2;
			if(media >= 6.0) {
				System.out.println(alunos[i].getNome()+ "Media: "+media);
			}
		}
		sc.close();

	}

}
