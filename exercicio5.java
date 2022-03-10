import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    double base, altura, area;
    System.out.println("Insira a base do retângulo: ");
    base = valores.nextDouble();
    System.out.println("Insira a altura do retângulo: ");
    altura = valores.nextDouble();
    area = base * altura;
    valores.close();
    System.out.println("Área do retângulo: " + area);
  }
}
