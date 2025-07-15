package exercicioFor;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			if(b == 0) {
				System.out.println("divisão imppossivel!");
			}else {
				double d = (double)a / b;
				System.out.println(d);
			}
		}
		
		
		sc.close();

	}

}
