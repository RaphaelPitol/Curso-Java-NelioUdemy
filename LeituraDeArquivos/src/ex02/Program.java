package ex02;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "c:\\temp\\ini.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} 

	}

}
