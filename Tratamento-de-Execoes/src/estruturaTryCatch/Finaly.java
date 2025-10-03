package estruturaTryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:\\ini.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String string = (String) sc.next();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sempre executado
		finally {
			System.out.println("Finallizou o Programa!");
		}

	}
}