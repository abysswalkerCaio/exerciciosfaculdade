import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    int carrosvendidos;
    double salario, valorvendas, valorcarro, salariofinal, comissaocarrovendido, comissaovendas;
    System.out.println("Informe a quantidade de carros vendidos: ");
    carrosvendidos = valores.nextInt();
    System.out.println("Informe o valor total das vendas: ");
    valorvendas = valores.nextDouble();
    System.out.println("Informe o salário fixo: ");
    salario = valores.nextDouble();
    System.out.println("Informe o valor recebido por cada carro vendido: ");
    valorcarro = valores.nextDouble();
    comissaocarrovendido = carrosvendidos * (valorcarro * 0.05);
    comissaovendas = valorvendas * 0.05;
    salariofinal = salario + comissaovendas + comissaocarrovendido;
    valores.close();
    System.out.println("Salário final do funcionário: " + salariofinal);
  }
}
