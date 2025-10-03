package exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		System.out.println("Quantos contribuintes:");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Que tipo fisico/ juridico (f / j):");
			char ch = sc.next().charAt(0);
			
			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(ch == 'f') {
				System.out.print("Despesas com saude: ");
				double despesasSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, despesasSaude));
			}else {
				System.out.print("Quantidade de funcionarios: ");
				int quantFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, quantFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("Imposto a Pagar:");
		double impostoTotal = 0.0;
		for(Contribuinte contribuinte : list) {
			System.out.println(contribuinte.nome+ " "+String.format("%.2f", contribuinte.calculaImposto()));
			impostoTotal += contribuinte.calculaImposto();
		}
		System.out.println();
		System.out.println("Imposto total: R$"+ String.format("%.2f", impostoTotal));
		
		sc.close();

	}

}
