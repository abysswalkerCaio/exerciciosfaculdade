import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    double custo, imposto, distribuidor, custofinal;
    System.out.println("Informe o custo de fábrica: ");
    custo = valores.nextDouble();
    imposto = custo * 0.45;
    distribuidor = custo * 0.28;
    custofinal = custo + imposto + distribuidor;
    valores.close();
    System.out.println("O custo final do carro: " + custofinal);
  }
}
