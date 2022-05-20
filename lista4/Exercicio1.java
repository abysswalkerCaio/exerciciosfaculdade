package lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double[][] matriz = new double[3][4];
		
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Informe o valor que será contido em " + (i + 1) + " x " + (j + 1) + ": ");
				matriz[i][j] = Double.parseDouble(leitura.nextLine());
			}
		}
		
		leitura.close();
		
		System.out.println("\nObservação: O valor inicial de ambas linhas e coluna é 0!");
		System.out.println("Exemplo: (2x2) é equivalente ao original (3x3) na matemática.");
		
		System.out.print("\nMatriz: ");
		System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2] + " " + matriz[0][3]);
		System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2] + " " + matriz[1][3]);
		System.out.println(matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2] + " " + matriz[2][3]);
		
		System.out.println("\nValor no canto superior esquerdo (1x1): " + matriz[0][0]);
		System.out.println("Valor no canto inferior direito (3x4): " + matriz[2][3]);
	}
}
