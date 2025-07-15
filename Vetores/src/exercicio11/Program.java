package exercicio11;

import java.util.Locale;
import java.util.Scanner;

import exercicio10.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a quantidade de Generos:?");
		int qtd = sc.nextInt();

		Pessoa[] pessoas = new Pessoa[qtd];

		double menor = 0.0;
		double maior = 0.0;

		for (int i = 0; i < pessoas.length; i++) {
			sc.nextLine();
			int a = i + 1;
			System.out.println("Qual o genero da :" + a + "a Pessoa:");
			String genero = sc.nextLine();
			System.out.println("Qual o Altura da :" + a + "a Pessoa:");
			double altura = sc.nextDouble();
			pessoas[i] = new Pessoa(genero, altura);
		}
		
		menor = pessoas[0].getAltura();
		maior = pessoas[0].getAltura();
		
		for(int i = 1; i < pessoas.length; i++ ) {
			if(pessoas[i].getAltura() > maior) {
				maior = pessoas[i].getAltura();
			}
			if(pessoas[i].getAltura() < menor) {
				menor = pessoas[i].getAltura();
			}
		}
		
		
		System.out.printf("Menor altura: %.2f%n", menor);
		System.out.printf("Maior altura: %.2f%n", maior);

		int contadorM = 0;
		double alturaMulhres = 0.0;
		int qtdHomes = 0;
		
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getGenero().equals("f")) {
				contadorM += 1;
				alturaMulhres += pessoas[i].getAltura();
			}else {
				qtdHomes += 1;
			}
		}
		double media = alturaMulhres / contadorM;
		System.out.printf("Media das mulheres ;  %.2f%n", media);
		System.out.println("Quantidade de Homens: "+ qtdHomes);
		
		

		sc.close();

	}

}
