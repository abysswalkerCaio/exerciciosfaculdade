package lista2;

import java.util.Scanner;

public class Exercicio8 {
	Scanner leitura = new Scanner(System.in);
	
	public static void main(String [] args) {
		Exercicio8 instanciar = new Exercicio8();
		instanciar.areaCirculo(0, 0);
	}
	
	public void areaCirculo(double raio, double area) {
		System.out.print("Informe o raio do círculo: ");
        raio = Double.parseDouble(leitura.nextLine());
		area = Math.PI * Math.pow(raio, 2);
		System.out.println("Área do circulo: " + Math.round(area));
	}
}
