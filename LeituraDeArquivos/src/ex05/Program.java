package ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//c:\\temp\\subPast\\cv.csv
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<Product>();
		
		System.out.println("Entre com o caminho da pasta:");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		//pega o caminho despresando o nome do arquivo
		String sourceFolderStr = sourceFile.getParent();
		
		//cria um novo diretorio mkdir
		boolean success = new File(sourceFolderStr+"\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\sumary2.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
			String itenCsv = br.readLine();
			while (itenCsv != null) {
				System.out.println(itenCsv);
				
				String[] fields = itenCsv.split(";");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(price, name, quantity));
				
				itenCsv = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
			for(Product iten: list) {
				bw.write(iten.getName()+";"+ String.format("%.2f", iten.total()));
				bw.newLine();
			}
			System.out.println(targetFileStr+ "CREATED");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		sc.close();

	}

}
