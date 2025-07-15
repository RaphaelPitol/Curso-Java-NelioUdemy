package vetor2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de Produto:");
		
		int qtd = sc.nextInt();		
		Produto[] lista = new Produto[qtd];
		
		double precomedio = 0.0;
		
		for(int i = 0; i < lista.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do Produto");
			String nome = sc.nextLine();
			
			double preco = sc.nextDouble();
			lista[i] = new Produto(nome, preco);
			
			precomedio += lista[i].getPreco(); 
		}
		
		System.out.printf("Preco medio R$ %.2f%n",precomedio / lista.length);
		
		sc.close();

	}

}
