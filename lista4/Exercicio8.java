package lista4;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int[][] matriz = new int[5][6];
		int pares = 0, qtdPares = 0, media;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("Informe o valor que será contido em " + (i + 1) + " x " + (j + 1) + ": ");
				matriz[i][j] = Integer.parseInt(leitura.nextLine());

				if (matriz[i][j] % 2 == 0) {
					pares += matriz[i][j];
					qtdPares++;
				}
			}
		}

		leitura.close();
		
		System.out.println("\nObservação: O valor inicial de ambas linhas e coluna é 0!");
		System.out.println("Exemplo: (2x2) é equivalente ao original (3x3) na matemática.");

		System.out.println("\nMatriz: ");
		System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2] + " " + matriz[0][3] + " "
				+ matriz[0][4] + " " + matriz[0][5]);

		System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2] + " " + matriz[1][3] + " "
				+ matriz[1][4] + " " + matriz[1][5]);

		System.out.println(matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2] + " " + matriz[2][3] + " "
				+ matriz[2][4] + " " + matriz[2][5]);

		System.out.println(matriz[3][0] + " " + matriz[3][1] + " " + matriz[3][2] + " " + matriz[3][3] + " "
				+ matriz[3][4] + " " + matriz[3][5]);

		System.out.println(matriz[4][0] + " " + matriz[4][1] + " " + matriz[4][2] + " " + matriz[4][3] + " "
				+ matriz[4][4] + " " + matriz[4][5]);

		media = pares / qtdPares;

		System.out.println("\nQuantidade de pares na matriz: " + qtdPares);
		System.out.println("A soma de todos os pares: " + pares);
		System.out.println("Média do total de pares: " + media);
	}
}
