package lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);
		double um, dois, tres, quatro, qrdum, qrddois, qrdtres, qrdquatro, resultado;
		System.out.println("Digite o primeiro valor: ");
		um = Double.parseDouble(valores.nextLine());
		System.out.println("Digite o segundo valor: ");
		dois = Double.parseDouble(valores.nextLine());
		System.out.println("Digite o terceiro valor: ");
		tres = Double.parseDouble(valores.nextLine());
		System.out.println("Digite o quarto valor: ");
		quatro = Double.parseDouble(valores.nextLine());
		qrdum = um * um;
		qrddois = dois * dois;
		qrdtres = tres * tres;
		qrdquatro = quatro * quatro;
		resultado = qrdum + qrddois + qrdtres + qrdquatro;
		valores.close();
		System.out.println("A soma dos quadrados dos números fornecidos: " + resultado);
	}
}
