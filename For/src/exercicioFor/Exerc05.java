package exercicioFor;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc. nextInt();
		
		int f = 1;
		
		for(int i = 1; i <= n; i++) {
			
			f = f * i;
		}
		if(f == 0) {
			f = 1;
		}
		System.out.println(f);
		sc.close();
	}

}
