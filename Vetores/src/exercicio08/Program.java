package exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do vetor?");
		int qtd = sc.nextInt();
		int vetValores[] = new int[qtd];
		double valorTotal = 0.0;
		double media = 0.0;
		int pares = 0;
		System.out.println("Digite um numero:");
		for(int i = 0; i < vetValores.length; i++) {
			int  n = sc.nextInt();
			vetValores[i] = n;
			if(vetValores[i] % 2 == 0) {
				valorTotal += vetValores[i];
				pares += 1;
			}
		}
		
		if(pares > 0) {
			media = valorTotal / pares;
			System.out.printf("MEDIA DOS PARES %.2f%n", media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();

	}

}
