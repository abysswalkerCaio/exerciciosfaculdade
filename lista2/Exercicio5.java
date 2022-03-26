package lista2;

import java.util.Scanner;

public class Exercicio5 {
	Scanner leitura = new Scanner(System.in);
	
	public static void main(String [] args) {
		Exercicio5 instanciar = new Exercicio5();
		instanciar.soma(0, 0, 0);
	}
	
	public void soma(int n1, int n2, int n3) {
		System.out.print("Digite o primeiro número: ");
		n1 = leitura.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = leitura.nextInt();
		System.out.print("Digite o terceiro número: ");
		n3 = leitura.nextInt();
		System.out.println("O resultado da adição: " + (n1 + n2 + n3));
	}
}
