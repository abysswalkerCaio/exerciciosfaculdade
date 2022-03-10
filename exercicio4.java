import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    int numero, antecessor;
    System.out.println("Digite um número: ");
    numero = valores.nextInt();
    antecessor = numero - 1;
    valores.close();
    System.out.println("O antecessor do valor inserido é: " + antecessor);
  }
}
