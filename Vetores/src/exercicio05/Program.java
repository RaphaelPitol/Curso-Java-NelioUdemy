package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos numeros do Vetor:");

		int qtd = sc.nextInt();
		double[] numeros = new double[qtd];

		double maiorValor = 0.0;
		int position = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Agora digite um numero:");
			numeros[i] = sc.nextDouble();

			if (numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				position = i;
			}
		}

		System.out.println("MAIOR VALOR = " + maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = " + position);
		sc.close();

	}

}
