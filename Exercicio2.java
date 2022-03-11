import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    double um, dois, tres, quatro, qrdum, qrddois, qrdtres, qrdquatro, resultado;
    System.out.println("Digite o primeiro valor: ");
    um = valores.nextDouble();
    System.out.println("Digite o segundo valor: ");
    dois = valores.nextDouble();
    System.out.println("Digite o terceiro valor: ");
    tres = valores.nextDouble();
    System.out.println("Digite o quarto valor: ");
    quatro = valores.nextDouble();
    qrdum = um * um;
    qrddois = dois * dois;
    qrdtres = tres * tres;
    qrdquatro = quatro * quatro;
    resultado = qrdum + qrddois + qrdtres + qrdquatro;
    valores.close();
    System.out.println("A soma dos quadrados dos números fornecidos: " + resultado);
  }
}
