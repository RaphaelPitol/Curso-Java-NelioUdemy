package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		try {
			System.out.print("Numero do Quarto:");
			int numero = sc.nextInt();
			System.out.print("Data de Entrada (dd/MM/yy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data de Saida (dd/MM/yy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reserva = new Reservation(numero, checkIn, checkOut);
			
			System.out.println("Reservation: "+reserva);
			
			System.out.println();
			System.out.println("Entre coom os dados para atualizar a Reserva:");
			System.out.print("Data de Entrada (dd/MM/yy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de Saida (dd/MM/yy): ");
			checkOut = sdf.parse(sc.next());
			
			reserva.updateDates(checkIn, checkOut);
			System.out.println("Reserva: "+ reserva);
		}
		catch (ParseException e) {
			System.out.println("Data Invalida.");
			// TODO: handle exception
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: "+e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error:");
		}
		sc.close();

	}

}
