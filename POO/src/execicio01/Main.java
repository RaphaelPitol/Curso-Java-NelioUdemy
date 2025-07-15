package execicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo rt = new Retangulo();
		System.out.println("Digite Altura depois a largura do Triangulo:");
		rt.altura = sc.nextDouble();
		rt.largura = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", rt.area());
		System.out.printf("Perimetro: %.2f%n", rt.perimetro());
		System.out.printf("Diagonal: %.2f%n", rt.diagonal());
		sc.close();
	}

}
