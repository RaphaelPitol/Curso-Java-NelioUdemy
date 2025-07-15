package exercicio_membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o preco do Dolar:");
		double preco = sc.nextDouble();
		System.out.print("Informe quantos Dolares voce quer comprar:");
		int qtdDolares = sc.nextInt();
		
		System.out.printf("Total em reais com iof R$, %.2f", ConverterMoeda.dolar(preco, qtdDolares));
		
		sc.close();
	}

}
