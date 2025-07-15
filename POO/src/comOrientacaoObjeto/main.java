package comOrientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo t1 = new Triangulo();
		System.out.println("Digite as dimensoes do triangulo X:");
		t1.a = sc.nextDouble();
		t1.b = sc.nextDouble();
		t1.c = sc.nextDouble();
		System.out.println("Digite as dimensoes do triangulo Y:");
		Triangulo t2 = new Triangulo();
		t2.a = sc.nextDouble();
		t2.b = sc.nextDouble();
		t2.c = sc.nextDouble();
		
		double result1 = t1.area();
		double result2 = t2.area();
		
		
		System.out.printf("Area do Triangulo: X %.4f%n", result1);
		System.out.printf("Area do Triangulo:Y %.4f%n", result2);
		
		if(result1 > result2) {
			System.out.println("Tringulo X e maior");
		}else {
			System.out.println("Tringulo Y e maior");
			
		}
		
		
		sc.close();
	}

}
