package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class ProgramEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data:");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Hoolder: ");
		sc.nextLine();
		String hoolder = sc.nextLine();
		System.out.print("Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Limit: ");
		double limit = sc.nextDouble();
		
		Account acc = new Account(number, hoolder, balance, limit);
		
		System.out.println();
		System.out.print("WithDrow: ");
		double amount = sc.nextDouble();
		try {
			acc.withDrow(amount);			
			System.out.println(acc);
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
		sc.close();

	}

}
