package lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio3 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner valores = new Scanner(System.in);

		double unidade, totalvendas, calculoporc, pagamentocomissao;

		System.out.print("Valor total de uma unidade: ");
		unidade = Double.parseDouble(valores.nextLine());

		System.out.print("Total de unidades vendidas: ");
		totalvendas = Double.parseDouble(valores.nextLine());
		
		calculoporc = unidade + totalvendas;
		pagamentocomissao = calculoporc * 0.05;
		
		valores.close();
		
		System.out.println("Sua comissão: R$ " + df.format(pagamentocomissao));
	}
}
