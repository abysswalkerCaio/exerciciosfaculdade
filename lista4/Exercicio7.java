package lista4;

public class Exercicio7 {
	public static void main(String[] args) {
		double[][] matriz = new double[7][8];

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 8; j++) {
				matriz[i][j] = i + j;
			}
		}

		System.out.println("Observação: O valor inicial de ambas linhas e coluna é 0!");
		System.out.println("Exemplo: (2x2) é equivalente ao original (3x3) na matemática.");

		System.out.println("\nMatriz: ");
		System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2] + " " + matriz[0][3] + " "
				+ matriz[0][4] + " " + matriz[0][5] + " " + matriz[0][6] + " " + matriz[0][7]);

		System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2] + " " + matriz[1][3] + " "
				+ matriz[1][4] + " " + matriz[1][5] + " " + matriz[1][6] + " " + matriz[1][7]);

		System.out.println(matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2] + " " + matriz[2][3] + " "
				+ matriz[2][4] + " " + matriz[2][5] + " " + matriz[2][6] + " " + matriz[2][7]);

		System.out.println(matriz[3][0] + " " + matriz[3][1] + " " + matriz[3][2] + " " + matriz[3][3] + " "
				+ matriz[3][4] + " " + matriz[3][5] + " " + matriz[3][6] + " " + matriz[3][7]);

		System.out.println(matriz[4][0] + " " + matriz[4][1] + " " + matriz[4][2] + " " + matriz[4][3] + " "
				+ matriz[4][4] + " " + matriz[4][5] + " " + matriz[4][6] + " " + matriz[4][7]);

		System.out.println(matriz[5][0] + " " + matriz[5][1] + " " + matriz[5][2] + " " + matriz[5][3] + " "
				+ matriz[5][4] + " " + matriz[5][5] + " " + matriz[5][6] + " " + matriz[5][7]);

		System.out.println(matriz[6][0] + " " + matriz[6][1] + " " + matriz[6][2] + " " + matriz[6][3] + " "
				+ matriz[6][4] + " " + matriz[6][5] + " " + matriz[6][6] + " " + matriz[6][7]);
	}
}
