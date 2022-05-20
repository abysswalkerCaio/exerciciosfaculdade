package lista4;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double[][] matriz = new double[4][3];
		int linha, coluna;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Informe o valor que será contido em " + (i + 1) + " x " + (j + 1) + ": ");
				matriz[i][j] = Double.parseDouble(leitura.nextLine());
			}
		}

		System.out.println("\nMatriz: ");
		System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
		System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2]);
		System.out.println(matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2]);
		System.out.println(matriz[3][0] + " " + matriz[3][1] + " " + matriz[3][2]);

		System.out.println("\nObservação: O valor inicial de ambas linhas e coluna é 0!");
		System.out.println("Exemplo: (2x2) é equivalente ao original (3x3) na matemática.");

		System.out.print("\nInforme o valor de uma linha: ");
		linha = Integer.parseInt(leitura.nextLine());

		System.out.print("Informe o valor de uma coluna: ");
		coluna = Integer.parseInt(leitura.nextLine());

		leitura.close();

		System.out.println("\nO valor da linha e coluna especificadas: " + matriz[linha][coluna]);
	}
}
