package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas:");
		int qtd = 0;
		qtd = sc.nextInt();
		double vetor[] = new double[qtd];
		
		double media = 0.0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a altura da "+i+" Pessoa:");
			vetor[i] = sc.nextDouble();
			
			media += vetor[i];
		}
		System.out.printf("media de altura e %.2f%n", media / vetor.length);
		
		
		
		
		sc.close();

	}

}
