package lista4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double[][] matriz = new double[5][5];
		double[][] matrizCubo = new double[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Informe o valor que será contido em " + (i + 1) + " x " + (j + 1) + ": ");
				matriz[i][j] = Double.parseDouble(leitura.nextLine());
			}
		}

		leitura.close();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrizCubo[i][j] = Math.pow(matriz[i][j], 3);
			}
		}
		
		System.out.println("\nObservação: O valor inicial de ambas linhas e coluna é 0!");
		System.out.println("Exemplo: (2x2) é equivalente ao original (3x3) na matemática.");

		System.out.println("\nMatriz Original: ");
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

		System.out.println("\nMatriz Elevada ao Cubo: ");
		System.out.println(matrizCubo[0][0] + " " + matrizCubo[0][1] + " " + matrizCubo[0][2] + " " + matrizCubo[0][3]
				+ " " + matrizCubo[0][4]);

		System.out.println(matrizCubo[1][0] + " " + matrizCubo[1][1] + " " + matrizCubo[1][2] + " " + matrizCubo[1][3]
				+ " " + matrizCubo[1][4]);

		System.out.println(matrizCubo[2][0] + " " + matrizCubo[2][1] + " " + matrizCubo[2][2] + " " + matrizCubo[2][3]
				+ " " + matrizCubo[2][4]);

		System.out.println(matrizCubo[3][0] + " " + matrizCubo[3][1] + " " + matrizCubo[3][2] + " " + matrizCubo[3][3]
				+ " " + matrizCubo[3][4]);

		System.out.println(matrizCubo[4][0] + " " + matrizCubo[4][1] + " " + matrizCubo[4][2] + " " + matrizCubo[4][3]
				+ " " + matrizCubo[4][4]);
	}
}
