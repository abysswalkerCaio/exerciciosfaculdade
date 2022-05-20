package lista4;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double[][] matriz = new double[5][5];
		double somaLinha = 0, somaColuna, diagonalPrincipal, diagonalSecundaria, somaElementos = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Informe o valor que será contido em " + (i + 1) + " x " + (j + 1) + ": ");
				matriz[i][j] = Double.parseDouble(leitura.nextLine());
			}
		}

		leitura.close();

		System.out.println("\nObservação: O valor inicial de ambas linhas e coluna é 0!");
		System.out.println("Exemplo: (2x2) é equivalente ao original (3x3) na matemática.");

		System.out.println("\nMatriz: ");
		System.out.println(
				matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2] + " " + matriz[0][3] + " " + matriz[0][4]);

		System.out.println(
				matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2] + " " + matriz[1][3] + " " + matriz[1][4]);

		System.out.println(
				matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2] + " " + matriz[2][3] + " " + matriz[2][4]);

		System.out.println(
				matriz[3][0] + " " + matriz[3][1] + " " + matriz[3][2] + " " + matriz[3][3] + " " + matriz[3][4]);

		System.out.println(
				matriz[4][0] + " " + matriz[4][1] + " " + matriz[4][2] + " " + matriz[4][3] + " " + matriz[4][4]);
		
		for (int i = 3; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				somaLinha += matriz[i][j];
			}
		}
		
		somaColuna = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1] + matriz[4][1];
		diagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3] + matriz[4][4];
		diagonalSecundaria = matriz[0][4] + matriz[1][3] + matriz[2][2] + matriz[3][1] + matriz[4][0];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				somaElementos += matriz[i][j];
			}
		}
		
		System.out.println("\nSoma de todos os elementos na quarta linha: " + somaLinha);
		System.out.println("Soma de todos os elementos na segunda coluna: " + somaColuna);
		System.out.println("Soma de todos os elementos na diagonal principal: " + diagonalPrincipal);
		System.out.println("Soma de todos os elementos na diagonal secundária: " + diagonalSecundaria);
		System.out.println("Soma de todos os elementos na matriz: " + somaElementos);
	}
}
