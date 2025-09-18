package exercicio02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Programan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> listProducts = new ArrayList<>();
		System.out.println("Quantos Produtos serao registrados?");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Dados do #" + i + " Product:");
			System.out.println("Common, used or imported (c/u/i)?");
			char op = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			if(op == 'i') {
				System.out.print("Free: ");
				double custonFree = sc.nextDouble();
				sc.nextLine();
				listProducts.add(new ImportedProduct(nome, price, custonFree));
			}else if (op == 'u') {
				System.out.print("Manufactured Date(DD/MM/YYYY)");
				String date = sc.nextLine();
				LocalDate d8 = LocalDate.parse(date, form1);
				listProducts.add(new UsedProduct(nome, price, d8));
			}else {
				listProducts.add(new Product(nome, price));
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Price Tags:");
		
		for (Product product : listProducts) {
			System.out.println(product.priceTag());
		}
		
	}

}
