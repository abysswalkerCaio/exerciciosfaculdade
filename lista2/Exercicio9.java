package lista2;

import java.util.Scanner;

public class Exercicio9 {
	Scanner leitura = new Scanner(System.in);
	
	public static void main(String[] args) {
		Exercicio9 instanciar = new Exercicio9();
		instanciar.numero(0);
	}

	public void numero(double valor) {
		System.out.print("Digite um valor: ");
		valor = Double.parseDouble(leitura.nextLine());
		System.out.println("Valor ao quadrado: " + Math.pow(valor, 2));
		System.out.println("Valor ao cubo: " + Math.pow(valor, 3));
		System.out.println("Raiz quadrada do valor: " + Math.sqrt(valor));
	}
}
