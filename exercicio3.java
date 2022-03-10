import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    double unidade, totalvendas, calculoporc, pagamentocomissao;
    System.out.println("Valor total de uma unidade: ");
    unidade = valores.nextDouble();
    System.out.println("Total de unidades vendidas: ");
    totalvendas = valores.nextDouble();
    calculoporc = unidade + totalvendas;
    pagamentocomissao = calculoporc * 0.05;
    System.out.println("Sua comissão: " + pagamentocomissao);
  }
}
