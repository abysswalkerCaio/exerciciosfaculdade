package lista2;

import java.util.Scanner;

public class Exercicio3 {
	Scanner leitura = new Scanner(System.in);

	public static void main(String[] args) {
		Exercicio3 instanciar = new Exercicio3();
		instanciar.parOuImpar(0, 0);
	}
	
	public void parOuImpar(double numero, double resto) {
		System.out.print("Insira um valor: ");
		numero = Double.parseDouble(leitura.nextLine());
		resto = numero % 2;
		if (resto == 0) {
			System.out.print("Número par!");
		}
		else {
			System.out.print("Número ímpar!");
		}
	}
}
