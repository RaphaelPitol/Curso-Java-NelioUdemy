package estruturaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		metodo1();
	}
	
	public static void metodo1(){
		System.out.println("****Metodo 1 Inicio****");
		metodo2();
		System.out.println("****Metodo 1 Fim****");
	}
	
	public static void metodo2() {
		System.out.println("****Metodo 2 Inicio****");
		Scanner sc = new Scanner(System.in);
		String[] vect = sc.nextLine().split(" ");
		
		
		try {
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Input Invalido");
		}
			
		sc.close();
		System.out.println("****Metodo 2 Fim****");
	}

}
