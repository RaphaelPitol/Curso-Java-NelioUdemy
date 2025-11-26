package ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

// Criando um arquivo txt 
		String[] lines = new String[] {"Bom dia", "Boa Tarde", "Boa Noite"};
		String path = "c:\\temp\\out.txt";
	// somente o path o arquivo é recriado, com o true o arquivo é escrito a partir da ultima linha existente	
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
