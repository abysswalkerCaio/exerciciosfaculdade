package lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double[] numeros = new double[5];
		int contador = 1;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o valor número " + contador + ": ");
			numeros[i] = leitura.nextInt();
			contador++;
		}
		
		double resultado = 0, media = 0, maior = numeros[0] , menor = numeros[0];

		leitura.close();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			} 
			
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			
			resultado += numeros[i];
			
			if (i == numeros.length - 1) {
				media = resultado / (i + 1);
			}
		}
		
		System.out.println("\nMaior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média: " + media);
	}
}
