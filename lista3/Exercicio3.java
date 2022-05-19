package lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int[] numeros = new int[10];
		int contador = 1, pares = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o valor número " + contador + ": ");
			numeros[i] = leitura.nextInt();
			contador++;
		}
		
		leitura.close();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println("Quantidade de números pares: " + pares);
	}
}
