package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor:");
		int n = sc.nextInt();

		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero:");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		System.out.print("Valores = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i]+" ");
			sum += vect[i];
		}
		System.out.println("");
		System.out.println("Soma = "+ sum);
		System.out.println("Media = "+ sum / vect.length);

		sc.close();

	}

}
