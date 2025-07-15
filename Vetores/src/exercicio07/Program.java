package exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do vetor?");
		int qtd = sc.nextInt();
		double vetValores[] = new double[qtd];
		double valorTotal = 0.0;
		double media = 0.0;
		
		System.out.println("Digite um numero:");
		for(int i = 0; i < vetValores.length; i++) {
			double  n = sc.nextDouble();
			vetValores[i] = n;
		}
		
		for(int i = 0; i < vetValores.length; i++) {
			valorTotal += vetValores[i];
		}
		
		media = valorTotal / vetValores.length;
		
		System.out.printf("MEDIA DOS VALORES: %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vetValores.length; i++) {
			if(media > vetValores[i]) {
				System.out.println(vetValores[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
