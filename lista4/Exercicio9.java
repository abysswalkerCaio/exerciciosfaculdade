package lista4;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int[][] matriz = new int[7][4];
		int menor = matriz[0][0], maior = matriz[0][0], linhaMenor = 0, colunaMenor = 0, linhaMaior = 0,
				colunaMaior = 0;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Informe o valor que será contido em " + (i + 1) + " x " + (j + 1) + ": ");
				matriz[i][j] = Integer.parseInt(leitura.nextLine());
			}
		}

		leitura.close();

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				if (matriz[i][j] <= menor) {
					menor = matriz[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}

				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
			}
		}

		System.out.println("\nObservação: O valor inicial de ambas linhas e coluna é 0!");
		System.out.println("Exemplo: (2x2) é equivalente ao original (3x3) na matemática.");

		System.out.println("\nMatriz: ");
		System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2] + " " + matriz[0][3]);
		System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2] + " " + matriz[1][3]);
		System.out.println(matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2] + " " + matriz[2][3]);
		System.out.println(matriz[3][0] + " " + matriz[3][1] + " " + matriz[3][2] + " " + matriz[3][3]);
		System.out.println(matriz[4][0] + " " + matriz[4][1] + " " + matriz[4][2] + " " + matriz[4][3]);
		System.out.println(matriz[5][0] + " " + matriz[5][1] + " " + matriz[5][2] + " " + matriz[5][3]);
		System.out.println(matriz[6][0] + " " + matriz[6][1] + " " + matriz[6][2] + " " + matriz[6][3]);

		System.out.println("\nMenor número da matriz: " + menor + ", que está na linha " + linhaMenor + " e na coluna "
				+ colunaMenor);
		System.out.println("Maior número da matriz: " + maior + ", que está na linha " + linhaMaior + " e na coluna "
				+ colunaMaior);
	}
}
