package instanciando_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://docs.oracle.com/javase/8/docs/api///?java/time/format/DateTimeFormatter.html
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d1 = LocalDate.now();
		
		
		LocalDateTime d2 = LocalDateTime.now();
		
		//Gera data hora GMT
		Instant d3 = Instant.now();
		
		//Convertendo texto para Data 
		LocalDate d4 = LocalDate.parse("2021-10-30");
		LocalDateTime d5 = LocalDateTime.parse("2021-10-30T01:59:11");
		Instant d6 = Instant.parse("2021-10-30T01:30:11Z");
		//salva a hora do timeZone UTC Londres -03:00 especifica o fusorario
		Instant d7 = Instant.parse("2021-10-30T01:30:11-03:00");
		
		//formatando apartir do DateTimeFormate
		LocalDate d8 = LocalDate.parse("22/10/2009", form1);
		LocalDateTime d9 = LocalDateTime.parse("22/10/2009 01:55", form2);
		//pode ser feito direto no argumento
		LocalDateTime d10 = LocalDateTime.parse("22/10/2009 01:55", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		//passando dia mes e ano e hora isoladamente;
		LocalDate d11 = LocalDate.of(2025, 1, 31);
		LocalDateTime d12 = LocalDateTime.of(2035, 2, 27, 10, 10);
		
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		System.out.println("d3: "+d3);
		System.out.println("d4: "+d4);
		System.out.println("d5: "+d5);
		System.out.println("d6: "+d6);
		System.out.println("d7: "+d7);
		System.out.println("d8: "+d8);
		System.out.println("d9: "+d9);
		System.out.println("d10: "+d10);
		System.out.println("d11: "+d11);
		System.out.println("d12: "+d12);
	}

}
