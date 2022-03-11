package lista1;

import java.util.Scanner;

public class Exercicio5 {
	 public static void main(String[] args) {
		    Scanner valores = new Scanner(System.in);
		    double base, altura, area;
		    System.out.println("Insira a base do retângulo: ");
		    base = Double.parseDouble(valores.nextLine());
		    System.out.println("Insira a altura do retângulo: ");
		    altura = Double.parseDouble(valores.nextLine());
		    area = base * altura;
		    valores.close();
		    System.out.println("Área do retângulo: " + area);
		  }
}
