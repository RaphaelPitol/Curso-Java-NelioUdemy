package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun1 = new Funcionario();
		
		System.out.println("Qual o nome do funcionario:");
		fun1.nome = sc.nextLine();
		System.out.println("Qual o Salario:");
		fun1.salario = sc.nextDouble();
		
		System.out.printf("Nome: "+fun1.nome+" salario liquido: R$ %.2f", fun1.salarioLiquido());
		System.out.println("");
		System.out.println("Digite o aumento em % porcentagem:");
		double aumento = sc.nextDouble();
		fun1.aumentoSalario(aumento);
		
		System.out.printf(" Update -- Nome: "+fun1.nome+" salario liquido: R$ %.2f", fun1.salarioLiquido());
		
		sc.close();

	}

}
