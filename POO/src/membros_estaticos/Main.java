package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
//		Calculadora calc = new Calculadora();
		
		System.out.println("Entre com o Raio:");
		double raio = sc. nextDouble();
		
		double c = Calculadora.circunferencia(raio);
		double v = Calculadora.volume(raio);
		
		System.out.printf("Circunferencia , %.2f%n", c);
		System.out.printf("Volume , %.2f%n", v);
		System.out.printf("PI: , %.2f%n", Calculadora.PI);
		
		
		sc.close();

	}
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}

}
