package encapsulamento;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o nome do Produto:");
		System.out.print("nome:");
		String nome = sc.nextLine();
		System.out.print("estoque:");
		int estoque = sc.nextInt();
		System.out.print("preco:");
		double preco = sc.nextDouble();
		
		Produto p1 = new Produto(nome, preco, estoque);
		
		System.out.println(p1);
		
		
//		System.out.println("Nome:"+ p1.nome + " Estoque:"+p1.estoque+" Total:"+p1.valorTotal());
		System.out.println("Quanto quer adicionar?");
		int add = sc.nextInt();
		p1.addEstoque(add);
		System.out.println("Nome:"+ p1.getNome() + " Estoque:"+p1.getEstoque()+" Total:"+p1.valorTotal());
		System.out.println("Remova uma quantidade:");
		int rem = sc.nextInt();
		p1.remEstoque(rem);
		System.out.println("Nome:"+ p1.getNome() + " Estoque:"+p1.getEstoque()+" Total:"+p1.valorTotal());
		
		System.out.println(p1.toString());
		
		sc.close();

	}

}
