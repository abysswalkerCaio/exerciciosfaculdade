package lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio9 {
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);
		double salario, reajuste, valor, valorreajuste;
		System.out.println("Informe o salário: ");
		salario = Double.parseDouble(valores.nextLine());
		System.out.println("Informe o percentual de reajuste: ");
		reajuste = Double.parseDouble(valores.nextLine());
		valor = salario * (reajuste / 100);
		valorreajuste = valor + salario;
		valores.close();
		System.out.println("Valor reajustado: R$ " + df.format(valorreajuste));
	}
}
