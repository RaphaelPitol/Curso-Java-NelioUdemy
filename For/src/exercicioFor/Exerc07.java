package exercicioFor;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			
			int n1 = i;
			int n2 = i * i;
			int n3 = i * i * i;
//			System.out.print(i);
//			System.out.print("."+i * i);
//			System.out.println("."+i * i * i);
			System.out.printf("%d %d %d%n", n1, n2, n3);
		}
		
		sc.close();
	}

}
