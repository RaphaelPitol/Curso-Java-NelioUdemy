package exercicio;

import java.util.Scanner;

public class Exercicio {
	/*Exercicio de fixação
	 * definimos o tamanho da matriz
	 * depois populamos com numeros inteiros
	 * e por fim dizemos a posição do numero escolhido
	 * mostrando os numeros vizinhos se houver.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a qantidade de linhas:");
		int m = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a qantidade de colunas:");
		int n = sc.nextInt();
		sc.nextLine();

		int[][] matriz = new int[m][n];
		System.out.println("Digite os numero inteiros:");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Digite um numero da Matriz");
		int r = sc.nextInt();
		sc.nextLine();

		int coluna = 0;
		int linha = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] == r) {
					linha = i;
					coluna = j;
					System.out.println("Posicao:" + i + "," + j);
					if(coluna > 0) {
						System.out.println("Left: "+matriz[i][j-1]);
					}
					if(coluna < matriz.length -1) {
						System.out.println("Right: "+matriz[i][j+1]);
					}
					if(linha > 0) {
						System.out.println("Up: "+matriz[i-1][j]);
					}
					if(linha < matriz.length -1) {
						System.out.println("Down: "+matriz[i+1][j]);
					}
				}
			
			}
		}
		sc.close();

	}

}
