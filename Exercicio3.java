package lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio3 {
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);
		double unidade, totalvendas, calculoporc, pagamentocomissao;
		System.out.println("Valor total de uma unidade: ");
		unidade = Double.parseDouble(valores.nextLine());
		System.out.println("Total de unidades vendidas: ");
		totalvendas = Double.parseDouble(valores.nextLine());
		calculoporc = unidade + totalvendas;
		pagamentocomissao = calculoporc * 0.05;
		valores.close();
		System.out.println("Sua comissão: R$ " + df.format(pagamentocomissao));
	}
}
