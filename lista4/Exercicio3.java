package lista4;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double[][] matriz = new double[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Informe o valor que será contido em " + (i + 1) + " x " + (j + 1) + ": ");
				matriz[i][j] = Double.parseDouble(leitura.nextLine());
			}
		}

		leitura.close();

		System.out.println("\nMatriz: ");
		System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
		System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2]);

		System.out.println("\nMatriz Transposta: ");
		System.out.println(matriz[0][0] + " " + matriz[1][0]);
		System.out.println(matriz[0][1] + " " + matriz[1][1]);
		System.out.println(matriz[0][2] + " " + matriz[1][2]);
	}
}
