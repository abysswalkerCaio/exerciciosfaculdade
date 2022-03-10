import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    int idade, dias;
    System.out.println("Informe sua idade: ");
    idade = valores.nextInt();
    dias = idade * 365;
    valores.close();
    System.out.println("Idade expressa em dias: " + dias);
  }
}
