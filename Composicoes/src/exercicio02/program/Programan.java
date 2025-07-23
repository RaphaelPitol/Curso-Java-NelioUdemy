package exercicio02.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exercicio02.entities.Comments;
import exercicio02.entities.Post;

public class Programan {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments("Have a nice trip!");
		Comments c2 = new Comments("Wow that's awesome!");
		
		Post p1 = new Post(
				sdf.parse("221/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this winderful country",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1.toString());
		
	}
}
