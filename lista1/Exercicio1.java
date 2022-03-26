package lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner valores = new Scanner(System.in);
		double cotacao, valordolar, resultadoreal;
		System.out.println("Insira a cotação do dólar: ");
		cotacao = Double.parseDouble(valores.nextLine());
		System.out.println("Insira o valor em dólar: ");
		valordolar = Double.parseDouble(valores.nextLine());
		resultadoreal = cotacao * valordolar;
		valores.close();
		System.out.println("O valor em real: R$ " + df.format(resultadoreal));
	}
}
