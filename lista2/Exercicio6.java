package lista2;

import java.util.Scanner;

public class Exercicio6 {
	Scanner leitura = new Scanner(System.in);
	
	public static void main(String [] args) {
		Exercicio6 instanciar = new Exercicio6();
		instanciar.media(0, 0, 0, 0);
	}
	
	public void media(double n1, double n2, double n3, double mediaFinal) {
		System.out.print("Informe a primeira nota: ");
		n1 = leitura.nextInt();
		System.out.print("informe a segunda nota: ");
		n2 = leitura.nextInt();
		System.out.print("Informe a terceira nota: ");
		n3 = leitura.nextInt();
		mediaFinal = (n1 + n2 + n3) / 3;
		System.out.println("A média: " + mediaFinal);	
	}
}
