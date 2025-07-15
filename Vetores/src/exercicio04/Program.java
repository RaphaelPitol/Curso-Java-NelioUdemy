package exercicio04;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros:");
		
		int qtd = sc.nextInt();		
		int[] numeros = new int[qtd];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Agora digite um numero:");
			numeros[i] = sc.nextInt();
		}
		System.out.println("Numeros Pares:");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print("    "+numeros[i]);
			}
		}
		System.out.println("");
		System.out.println("Quantidade de Numeros Pares = "+ numeros.length);
		sc.close();
	}

}
