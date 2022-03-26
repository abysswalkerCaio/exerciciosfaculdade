package lista2;

import java.util.Scanner;

public class Exercicio4 {
	Scanner leitura = new Scanner(System.in);

	public static void main(String[] args) {
		Exercicio4 instanciar = new Exercicio4();
		instanciar.calcularAltura(0, 0, null);
	}

	public void calcularAltura(double altura, double peso, String sexo) {
		System.out.print("Informe sua altura: ");
		altura = Double.parseDouble(leitura.nextLine());
		System.out.print("Informe seu sexo: Masculino (Masculino) ou Feminino (Feminino): ");
		sexo = leitura.nextLine();
		switch (sexo) {
		case "Masculino":
			peso = (72.7 * altura) - 58;
			System.out.println("Seu peso ideal: " + peso);
			break;
		case "Feminino":
			peso = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal: " + peso);
			break;
		default:
			System.out.println("Sexo inválido inserido!");
		}
	}
}
