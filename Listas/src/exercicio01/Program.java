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
		System.out.println("Quantos funcionarios serao registrados?");
		int tamanhoDaLista = sc.nextInt();
		sc.nextLine();
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		for(int i = 0; i < tamanhoDaLista; i++) {
			System.out.println("Funcionario #"+(i+1));
			int id = sc.nextInt();
			sc.nextLine();
			
			//Verifica se o id ja existe na lista
			while (hasId(funcionarios, id)) {
				System.out.println("Id ja existe, digite outro:");
				id = sc.nextInt();
				sc.nextLine();
			}
			
			String nome = sc.nextLine();
			double salario = sc.nextDouble();
			funcionarios.add(new Funcionario(id, nome, salario));
			System.out.println("--------");
		}
		
		System.out.println("Digite o Id do funcionario para receber aumento");
		int id = sc.nextInt();
		sc.nextLine();
		
		Funcionario emp = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Funcionario nao Existe!");
		}else {
			System.out.println("Digite a porcentagem do aumento");
			double p = sc.nextDouble();
			emp.aumento(p);
			
		}
		
		
		System.out.println("Lista de Funcionarios:");
		for(Funcionario f : funcionarios) {
			System.out.println(f.toString());
		}
		
		sc.close();
		 
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
