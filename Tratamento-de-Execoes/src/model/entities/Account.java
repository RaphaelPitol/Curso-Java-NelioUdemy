package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String hoolder;
	private Double balance = 0.0;
	private Double withDrowLimit;
	
	public Account(Integer number, String hoolder, Double balance, Double withDrowLimit) {
		this.number = number;
		this.hoolder = hoolder;
		this.balance = balance;
		this.withDrowLimit = withDrowLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public String getHoolder() {
		return hoolder;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithDrowLimit() {
		return withDrowLimit;
	}
	
	public void deposit(Double deposit) {
		this.balance += deposit;
	}
	
	public void withDrow(Double amount) {
		if(amount > balance || amount > withDrowLimit) {
			throw new DomainException("The amount exeeds whitdrow limit");
		}else {
			this.balance -= amount;			
		}
	}
	
	
	@Override
	public String toString() {
		return "New Balance: "+ balance;
	}
	
	
	

}
