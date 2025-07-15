package funcoesString;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "abcd FGHIJ abc DEFG  ";
		// transforma a string em minusculo
		String s01 = original.toLowerCase();
		// transforma a string em maiusculo
		String s02 = original.toUpperCase();
		// Elimina os espaços em branco no final
		String s03 = original.trim();
		//pega a string apartir do index e forma nova string
		String s04 = original.substring(2);
		//gera nova string apartir do primeiro argumanto até o proximo argumento
		String s05 = original.substring(2, 9);
		//substitui o primeiro argumento pelo segundo em todos os lugares
		String s06 = original.replace('a', 'x');
		//substitui o primeiro argumento pelo segundo em todos os lugares
		String s07 = original.replace("abc", "xy");
		// pega a posição do argumento apartir do inicio da string
		int i = original.indexOf("bc");
		// pega a posição do argumento apartir do fim da string
		int y = original.lastIndexOf("bc");
		
		
		
		String s = "Raphael Pitol Juliani";
		// pega os espaços vazios e retorna um vetor
		String[]nome= s.split(" ");
		String firstName = nome[0];
		String sobreName = nome[1];
		String lastName = nome[2];
		
		System.out.println(firstName);
		System.out.println(sobreName);
		System.out.println(lastName);
		
		System.out.println("Original: -"+original+"-");
		System.out.println("toLowerCase: -"+s01+"-");
		System.out.println("toUpperCase: -"+s02+"-");
		System.out.println("trim: -"+s03+"-");
		System.out.println("substring (2): -"+s04+"-");
		System.out.println("substring (2, 9): -"+s05+"-");
		System.out.println("replace ('a', 'x'): -"+s06+"-");
		System.out.println("replace ('abc', 'xy'): -"+s07+"-");
		System.out.println("indexOf ('bc'): -"+i+"-");
		System.out.println("LastindexOf ('bc'): -"+y+"-");
		
	}

}
