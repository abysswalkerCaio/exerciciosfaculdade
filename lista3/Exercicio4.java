package lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int[] numeros = new int[15];
		int contador = 1, maiorIndice = 0, menorIndice = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o valor número " + contador + ": ");
			numeros[i] = leitura.nextInt();
			contador++;
		}
		
		int maior = numeros[0] , menor = numeros[0];

		leitura.close();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
				maiorIndice = i;
			} 
			
			if (numeros[i] < menor) {
				menor = numeros[i];
				menorIndice = i;
			}
		}
		System.out.println("\nMaior: " + maior + ", que foi o valor entrado no índice " + maiorIndice);
		System.out.println("Menor: " + menor + ", que foi o valor entrado no índice " + menorIndice);
	}
}
