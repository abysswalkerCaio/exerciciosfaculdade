package lista2;

import java.util.Scanner;

public class Exercicio10 {
	Scanner leitura = new Scanner(System.in);
	
	public static void main(String[] args) {
		Exercicio10 instanciar = new Exercicio10();
		instanciar.alterar(0, 0);
	}

	public void alterar(double preco, double desconto) {
		System.out.print("Informe o preço: ");
		preco = Double.parseDouble(leitura.nextLine());
		desconto = preco * 0.10;
		System.out.println("O valor com 10% de desconto: " + (preco - desconto));
	}
}
