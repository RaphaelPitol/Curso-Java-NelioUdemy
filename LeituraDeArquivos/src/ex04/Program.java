package ex04;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho da pasta:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Fordes:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);

		System.out.println("File:");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subPast").mkdir();
		System.out.println("Diretorio criado com sucesso "+ success);
		
		sc.close();
	}

}
