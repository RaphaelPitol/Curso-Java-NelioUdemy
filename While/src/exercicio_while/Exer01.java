package exercicio_while;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		 int senha;
		 
		 Scanner sc = new Scanner(System.in);
		 senha = sc.nextInt();
		 
		 while(senha != 2002) {
			 System.out.println("Acesso Negado!");
			 System.out.println("Digite a senha correta:");
			 senha = sc.nextInt();
		 }
		 System.out.println("Bem Vindo!");
		
		 sc.close();
	}

}
