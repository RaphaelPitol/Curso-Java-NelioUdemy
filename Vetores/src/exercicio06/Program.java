package exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do vetor?");
		int qtd = sc.nextInt();
		
		int vet1[] = new int[qtd];
		int vet2[] = new int[qtd];
		int vetSoma[] = new int[qtd];
		
		
		System.out.println("Digite os numeros do Vetor A");
		for(int i = 0; i < vet1.length; i++) {
			int  n = sc.nextInt();
			vet1[i] = n;
		}
		System.out.println("Digite os numeros do Vetor B");
		for(int i = 0; i < vet2.length; i++) {
			int  n = sc.nextInt();
			vet2[i] = n;
		}
		System.out.println("Vetor Resultante:");
		for(int i = 0; i < vetSoma.length; i++) {
			vetSoma[i] = vet1[i] + vet2[i];
			
			System.out.println(vetSoma[i]);
			
		}
		
		
		
		sc.close();

	}

}
