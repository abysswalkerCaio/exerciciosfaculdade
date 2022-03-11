package lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
	    Scanner valores = new Scanner(System.in);
	    int numero, antecessor;
	    System.out.println("Digite um número: ");
	    numero = Integer.parseInt(valores.nextLine());
	    antecessor = numero - 1;
	    valores.close();
	    System.out.println("O antecessor do valor inserido é: " + antecessor);
	  }
}
