import java.util.Scanner;

class Main {
  public static void main (String [] args) {
    Scanner valores = new Scanner(System.in);
      double cotacao, valordolar, resultadoreal;
      System.out.println("Insira a cotação do dólar: ");
      cotacao = valores.nextDouble();
      System.out.println("Insira o valor em dólar: ");
      valordolar = valores.nextDouble();
      resultadoreal = cotacao * valordolar;
      valores.close();
      System.out.println("O valor em real: " + resultadoreal);
    }
}
