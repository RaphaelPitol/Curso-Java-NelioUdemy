package entiti;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enun.WorkerLevel;

public class Worker {
	private String name;
	private double baseSalary;
	private WorkerLevel level;
	private Departament departament;
	private List<HourContract> contracts =  new ArrayList<>();;
	

	public Worker() {
		// TODO Auto-generated constructor stub
	}
	public Worker(String name, double baseSalary, WorkerLevel level, Departament departament) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.level = level;
		this.departament = departament;
	}
	
	public String getDepartament() {
		return departament.getName();
	}
	
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Worker [name=" + this.name + ", baseSalary=" + this.baseSalary + ", level=" + this.level + "]";
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract contract: contracts) {
			cal.setTime(contract.getDate());
			int y = cal.get(Calendar.YEAR);
			//coloca mais um porque o Calendar começa com 0
			int m = 1 + cal.get(Calendar.MONTH);
	
			if( m == month && y == year) {
				 sum += contract.totalValue();
			}
		}
		
		return sum;
		
	}

}
