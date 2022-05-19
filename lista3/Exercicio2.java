package lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int[] numeros = new int[5];
		int contador = 1, x = -1, y = -1;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o valor número " + contador + ": ");
			numeros[i] = leitura.nextInt();
			contador++;
		}

		while (!(x >= 0) || !(x < numeros.length)) {
			System.out.print("\nEscolha um índice do vetor: ");
			x = leitura.nextInt();
			if (!(x >= 0) || !(x < numeros.length)) {
				System.out.println("Esse índice não existe no vetor!");
			}
			else {
				break;
			}
		}

		while (!(y >= 0) || !(y < numeros.length)) {
			System.out.print("Escolha outro índice do vetor: ");
			y = leitura.nextInt();
			if (!(y >= 0) || !(y < numeros.length)) {
				System.out.println("Esse índice não existe no vetor!");
			}
			else {
				break;
			}
		}

		leitura.close();

		for (int i = 0; i <= 5; i++) {
			if (i == x) {
				x = numeros[i];
				break;
			}
		}

		for (int i = 0; i <= 5; i++) {
			if (i == y) {
				y = numeros[i];
				break;
			}
		}

		System.out.println("\nValor do primeiro índice escolhido: " + x);
		System.out.println("Valor do segundo índice escolhido: " + y);
		
		System.out.println("\nSoma de ambos: " + (x + y));
	}
}
