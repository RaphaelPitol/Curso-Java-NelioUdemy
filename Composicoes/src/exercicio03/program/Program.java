package exercicio03.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio03.entities.Client;
import exercicio03.entities.Order;
import exercicio03.entities.OrderItem;
import exercicio03.entities.Product;
import exercicio03.enun.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		
		System.out.print("Name:");
		String nameClient = sc.nextLine();
		System.out.print("Email:");
		String emailClient = sc.nextLine();
		System.out.print("Birth Date:");
		Date birthDate = sdf.parse(sc.nextLine());
		
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		String status = sc.nextLine();
		
		System.out.println("How many items to this order?");
		int qtdProducts = sc.nextInt();
//		sc.nextLine();
		
		Client client = new Client(nameClient, emailClient, birthDate);
		System.out.println(sdf.format(client.getBithDate()));
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		System.out.println(order.getMoment());
		
		for(int i = 1; i <= qtdProducts; i++) {
			System.out.println("Enter #0"+i+" item data:");
			System.out.print("Product name:");
			String name = sc.next();
			System.out.print("Product price:");
			double price = sc.nextDouble();
			System.out.print("Quantity:");	
			int quantity = sc.nextInt();
			Product product = new Product(name, price);
			OrderItem orderItem = new OrderItem(quantity, product);
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.println(order);
		sc.close();
	}

}
