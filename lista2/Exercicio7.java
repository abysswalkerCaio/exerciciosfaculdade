package lista2;

import java.util.Scanner;

public class Exercicio7 {
	Scanner leitura = new Scanner(System.in);
	
	public static void main(String [] args) {
		Exercicio7 instanciar = new Exercicio7();
		instanciar.areaTriangulo(0, 0, 0);
	}
	
	public void areaTriangulo(double base, double altura, double area) {
		System.out.print("Informe a base do triângulo: ");
		base = Double.parseDouble(leitura.nextLine());
		System.out.print("Informe a altura do triângulo: ");
		altura = Double.parseDouble(leitura.nextLine());
		area = (base * altura) / 2;
		System.out.println("Área do triângulo: " + area);
	}
}
