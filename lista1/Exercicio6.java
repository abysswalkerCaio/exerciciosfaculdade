package lista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);
		
		int idade, dias;
		
		System.out.println("Informe sua idade: ");
		idade = Integer.parseInt(valores.nextLine());
		
		dias = idade * 365;
		
		valores.close();
		
		System.out.println("Idade expressa em dias: " + dias);
	}
}
