package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		System.out.println("Infome o nome:");
		a1.nome = sc.nextLine();
		System.out.println("Infome a Nota 1 ate 30 pontos");
		a1.nota1 = sc.nextDouble();
		System.out.println("Infome a Nota 2 ate 35 pontos");
		a1.nota2 = sc.nextDouble();
		System.out.println("Infome a Nota 3 ate 35 pontos");
		a1.nota3 = sc.nextDouble();
		
		System.out.println("Media: "+ a1.calculaMedia());
		System.out.println(a1.aprovadoOuNao());
		
		sc.close();
				
	}

}
