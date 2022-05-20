package lista4;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double[][] matriz = new double[3][3];
		
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Informe o valor que será contido em " + (i + 1) + " x " + (j + 1) + ": ");
				matriz[i][j] = Double.parseDouble(leitura.nextLine());
			}
		}
		
		leitura.close();
		
		System.out.println("\nMatriz: ");
		System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
		System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2]);
		System.out.println(matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2]);
		
		System.out.println("\nSoma dos elementos na diagonal principal: " + (matriz[0][0] + matriz[1][1] + matriz[2][2]));
	}
}
