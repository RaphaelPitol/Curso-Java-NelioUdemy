package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entiti.Departament;
import entiti.HourContract;
import entiti.Worker;
import enun.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter departament'n name:");
		String departament = sc.nextLine();
		System.out.println("Enter Worker data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Level:");
		String level = sc.nextLine();
		System.out.print("Salary base:");
		double baseSalary = sc.nextDouble();

		Worker w1 = new Worker(name, baseSalary, WorkerLevel.valueOf(level), new Departament(departament));

		System.out.print("How many contracts to this worker?");
		int qtdContracts = sc.nextInt();

		for (int i = 1; i <= qtdContracts; i++) {

			System.out.println("Enter contract #0" + i + " data:");
			System.out.print("Date (DD/MM/YYYY:) ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per Hour:");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration('hours'):");
			int durationHour = sc.nextInt();
			sc.nextLine();

			w1.addContract(new HourContract(contractDate, valuePerHour, durationHour));
		}
		
		
		System.out.print("Enter month and years to calculate income(MM/YYYY):");
		String monthAndYears = sc.next();
		//pega a string do primeiro caracter até o segundo e converte para inteiro
		int month = Integer.parseInt(monthAndYears.substring(0, 2));
		int year = Integer.parseInt(monthAndYears.substring(3));
	
		System.out.println("Name: "+w1.getName());
		System.out.println("Departament: "+w1.getDepartament());
		System.out.println("Income for "+monthAndYears+": "+String.format("%.2f",w1.income(year, month)));
		System.out.println("==========Fim==========");
		sc.close();

	}

}
