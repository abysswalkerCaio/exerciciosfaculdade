import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    double salario, reajuste, valor, valorreajuste;
    System.out.println("Informe o salário: ");
    salario = valores.nextDouble();
    System.out.println("Informe o percentual de reajuste: ");
    reajuste = valores.nextDouble();
    valor = salario * (reajuste / 100);
    valorreajuste = valor + salario;
    valores.close();
    System.out.println("Valor reajustado: " + valorreajuste);
  }
}
