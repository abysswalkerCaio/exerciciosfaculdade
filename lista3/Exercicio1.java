package lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int[] numeros = new int[5];
		int contador = 1;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o valor número " + contador + ": ");
			numeros[i] = leitura.nextInt();
			contador++;
		}

		leitura.close();

		System.out.print("Números na ordem inversa: " + numeros[4] + ", " + numeros[3] + ", " + numeros[2] + ", "
				+ numeros[1] + ", " + numeros[0] + ".");
	}
}
