package exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> empresa = new ArrayList<>();
		System.out.println("Quantos funcionarios serão registrados?");
		int qtdfunc = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= qtdfunc; i++) {
			System.out.println("Dados do #" + i + " funcionario:");
			System.out.println("E tercerizado (y/n)?");
			char op = sc.next().charAt(0);
			
			System.out.print("Nome");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas");
			int horas = sc.nextInt();
			System.out.print("Valor por hora");
			double vlrHora = sc.nextDouble();
			sc.nextLine();

			if (op == 'n') {
				empresa.add(new Employee(nome, horas, vlrHora));
			} else {
				System.out.print("Valor da despesa");
				double despesa = sc.nextDouble();
				sc.nextLine();
				empresa.add(new OutsideEmployee(nome, horas, vlrHora, despesa));
			}

		}

		System.out.println("Pagamentos");

		for (Employee employee : empresa) {
			System.out.println(employee.name + " - " + employee.paiment());
		}

		sc.close();
	}

}
