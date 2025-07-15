package exercicio01;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero ate 10:");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero:");
			vect[i]= sc.nextInt();
		}
		
		System.out.println("Numeros Negativos:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
