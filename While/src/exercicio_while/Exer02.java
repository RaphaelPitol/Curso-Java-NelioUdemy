package exercicio_while;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		String y = "";
		String x = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(y != null || x != null) {
			try {
				
				System.out.println("Digite a cordenada Y:");
				y = sc.nextLine();
				int a = Integer.parseInt(y);
				System.out.println("Digite a cordenada X:");
				x = sc.nextLine();
				int b = Integer.parseInt(x);
				
				if(a > 0 && b > 0) {
					System.out.println("Primeiro");
				}
				if(a > 0 && b < 0) {
					System.out.println("Quarto");
				}
				if(a < 0 && b > 0) {
					System.out.println("Segundo");
				}
				if(a < 0 && b < 0) {
					System.out.println("Terceiro");
				}
			} catch (Exception e) {
				System.out.println("Erro Finalizado");
				y = null;
				x = null;
			}
			
		}
		sc.close();

	}

}
