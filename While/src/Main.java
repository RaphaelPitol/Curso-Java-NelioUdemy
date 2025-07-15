import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		 int n = sc.nextInt();
		
		int soma = 0;
		
		while (n != 0) {
			n = sc.nextInt();
			soma = soma + n;
		}
		System.out.println("Soma e "+ soma);
	}

}
