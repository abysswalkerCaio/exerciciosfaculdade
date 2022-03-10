import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    int idade, meses, dias, ttidade, ttmeses, totalgeral;
    System.out.println("Informe sua idade: ");
    idade = valores.nextInt();
    System.out.println("Informe os meses: ");
    meses = valores.nextInt();
    System.out.println("Informe os dias: ");
    dias = valores.nextInt();
    ttidade = idade * 365;
    ttmeses = meses * 30;
    totalgeral = ttidade + ttmeses + dias;
    valores.close();
    System.out.println("Idade expressa em dias: " + totalgeral);
  }
}
