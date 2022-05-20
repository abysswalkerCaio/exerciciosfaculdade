package lista4;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double[][] matriz = new double[4][3];
		int linha;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Informe o valor que será contido em " + (i + 1) + " x " + (j + 1) + ": ");
				matriz[i][j] = Double.parseDouble(leitura.nextLine());
			}
		}

		System.out.print("\nInforme um linha em que todos os elementos da mesma vão ser somados: ");
		linha = Integer.parseInt(leitura.nextLine());

		leitura.close();

		System.out.println("\nMatriz: ");
		System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
		System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2]);
		System.out.println(matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2]);
		System.out.println(matriz[3][0] + " " + matriz[3][1] + " " + matriz[3][2]);

		if (linha == 1) {
			System.out.println("\nSoma dos elementos da linha de número " + linha + ": "
					+ (matriz[0][0] + matriz[0][1] + matriz[0][2]));
		}

		else if (linha == 2) {
			System.out.println("\nSoma dos elementos da linha de número " + linha + ": "
					+ (matriz[1][0] + matriz[1][1] + matriz[1][2]));
		}

		else if (linha == 3) {
			System.out.println("\nSoma dos elementos da linha de número " + linha + ": "
					+ (matriz[2][0] + matriz[2][1] + matriz[2][2]));
		}

		else if (linha == 4) {
			System.out.println("\nSoma dos elementos da linha de número " + linha + ": "
					+ (matriz[3][0] + matriz[3][1] + matriz[3][2]));
		}
	}
}
