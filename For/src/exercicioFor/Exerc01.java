package exercicioFor;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int n = sc.nextInt();
		
		for(int i=0; i <= n; i++) {
			double r = i % 2;
			if (r != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
