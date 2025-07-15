package exercicio_while;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int g = 0;
		int d = 0;
		int codigo = 0;
		while (codigo != 4) {
			System.out.println("Digite 1 Gasolina");
			System.out.println("Digite 2 Alcool");
			System.out.println("Digite 3 Disel");
			System.out.println("Digite 4 Sair");

			codigo = sc.nextInt();

			if (codigo == 1) {
				a += 1;
			}
			if (codigo == 2) {
				g += 1;
			}
			if (codigo == 3) {
				d += 1;
			}

		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool= " + a);
		System.out.println("Gasolina= " + g);
		System.out.println("Diesel= " + d);
		sc.close();

	}

}
