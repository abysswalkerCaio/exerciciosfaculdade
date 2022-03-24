package lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio10 {
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);
		double custo, imposto, distribuidor, custofinal;
		System.out.println("Informe o custo de fábrica: ");
		custo = Double.parseDouble(valores.nextLine());
		imposto = custo * 0.45;
		distribuidor = custo * 0.28;
		custofinal = custo + imposto + distribuidor;
		valores.close();
		System.out.println("O custo final do carro: " + df.format(custofinal));
	}
}
