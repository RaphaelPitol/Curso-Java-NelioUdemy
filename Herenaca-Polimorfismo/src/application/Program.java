package application;

import entities.Account;
import entities.BusinesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1001, "Paulo", 0.0);
		
		BusinesAccount bacc = new BusinesAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinesAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Maria", 0.0, 0.01);
		
		
		//DOUWCASTING
		
		BusinesAccount acc4 = (BusinesAccount)acc2;
		acc4.loan(100.0);
		
		//BusinesAccount acc5 = (BusinesAccount)acc3;
		
		if(acc3 instanceof BusinesAccount) {
			BusinesAccount acc5 = (BusinesAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Emprestimo");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		//Sobreposição de metodos
		
		Account a1 = new SavingsAccount(101, "Rapha", 1000.0, 0.01);
		a1.withdraw(200);
		System.out.println(a1.getBalance());
		
		Account b1 = new BusinesAccount(101, "Bob", 1000.0, 200.0);
		b1.withdraw(200);
		System.out.println(b1.getBalance());
	}

}
