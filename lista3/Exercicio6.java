package lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double[] numeros = new double[12];
		int contador = 1;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o valor número " + contador + ": ");
			numeros[i] = leitura.nextInt();
			contador++;
		}

		leitura.close();

		System.out.println();
		
		for(int i = 0; i < numeros.length - 1; i++){
		    for(int j = i + 1; j < numeros.length; j++){
		        if(numeros[i] == numeros[j]){
		           System.out.println("O valor " + numeros[i] + " que está no índice " + i + ", é o mesmo valor que está no índice " + j);
		        }
		    }
		}
	}
}
