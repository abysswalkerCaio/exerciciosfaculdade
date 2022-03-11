package lista1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);
		int idade, meses, dias, ttidade, ttmeses, totalgeral;
		System.out.println("Informe sua idade: ");
		idade = Integer.parseInt(valores.nextLine());
		System.out.println("Informe os meses: ");
		meses = Integer.parseInt(valores.nextLine());
		System.out.println("Informe os dias: ");
		dias = Integer.parseInt(valores.nextLine());
		ttidade = idade * 365;
		ttmeses = meses * 30;
		totalgeral = ttidade + ttmeses + dias;
		valores.close();
		System.out.println("Idade expressa em dias: " + totalgeral);
	}
}
