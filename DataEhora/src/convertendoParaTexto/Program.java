package convertendoParaTexto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d4 = LocalDate.parse("2021-10-30");
		LocalDateTime d5 = LocalDateTime.parse("2021-10-30T01:59:11");
		Instant d6 = Instant.parse("2021-10-30T01:30:11Z");
		//salva a hora do timeZone UTC Londres -03:00 especifica o fusorario
		Instant d7 = Instant.parse("2021-10-30T01:30:11-03:00");
		
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Desta forma considera o fusorario do sistema local no caso do computador usado
		//Instant não tem a função format
		DateTimeFormatter form3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		DateTimeFormatter form4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter form5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d4: "+ d4.format(form1));
		System.out.println("d4: "+ form1.format(d4));
		System.out.println("d4: "+ d4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d5: "+ d5.format(form1));
		System.out.println("d5: "+ d5.format(form2));
		
		System.out.println("d6: "+ form3.format(d6));
		
		System.out.println("d5: "+ form4.format(d5) );
		System.out.println("d7: "+ form5.format(d7) );
	}

}
