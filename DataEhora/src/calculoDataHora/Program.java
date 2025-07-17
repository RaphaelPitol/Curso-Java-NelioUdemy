package calculoDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d4 = LocalDate.parse("2021-10-30");
		LocalDateTime d5 = LocalDateTime.parse("2021-10-30T01:59:11");
		Instant d6 = Instant.parse("2021-10-30T01:30:11Z");
		
		LocalDate semanaPassaDateTime = d4.minusDays(7);
		LocalDate proximaSemanaDateTime = d4.plusDays(7);
		LocalDate anoDateTime = d4.plusYears(1);
		
		System.out.println("semanaPassaDateTime = "+semanaPassaDateTime);
		System.out.println("proximaSemanaDateTime = "+proximaSemanaDateTime);
		System.out.println("anoDateTime = "+anoDateTime);
		
		System.out.println();
		
		LocalDateTime semanaPassadateTime = d5.minusDays(4);
		LocalDateTime proximaSemanadateTime = d5.plusWeeks(2);
		LocalDateTime anoLocalDateTime = d5.plusYears(5);
		
		System.out.println("semanaPassadateTime = "+semanaPassadateTime);
		System.out.println("proximaSemanadateTime = "+proximaSemanadateTime);
		System.out.println("anoLocalDateTime = "+anoLocalDateTime);
		
		System.out.println();
		
		Instant semanaPassadaInstant = d6.minus(7, ChronoUnit.DAYS);
		Instant nextSemanainstant = d6.plus(7, ChronoUnit.DAYS);
		
		System.out.println("semanaPassadaInstant = "+semanaPassadaInstant);
		System.out.println("nextSemanainstant = "+ nextSemanainstant);
		
		
		Duration t1 = Duration.between(semanaPassaDateTime.atStartOfDay(), d4.atStartOfDay());
		Duration t2 = Duration.between(semanaPassadateTime, d5);
		Duration t3 = Duration.between(semanaPassadaInstant, d6);
		Duration t4 = Duration.between(d6, semanaPassadaInstant);
		
		System.out.println("t1 = "+t1.toDays());
		System.out.println("t2 = "+t2.toDays());
		System.out.println("t3 = "+t3.toDays());
		System.out.println("t4 = "+t4.toDays());
	}

}
