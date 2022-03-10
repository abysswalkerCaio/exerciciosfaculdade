import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);
    int totaleleit, brancos = 0, nulos = 0, validos = 0, percbrancos, percnulos, percvalidos;
    System.out.println("Informe o total de eleitores: ");
    totaleleit = valores.nextInt();
    System.out.println("Informe o total de votos brancos: ");
    brancos = valores.nextInt();
    if (brancos <= totaleleit && totaleleit >= brancos + nulos + validos) {
      System.out.println("Informe o total de votos nulos: ");
      nulos = valores.nextInt();
      if (nulos <= totaleleit && totaleleit >= brancos + nulos + validos) {
        System.out.println("Informe o total de votos validos: ");
        validos = valores.nextInt();
        if (validos <= totaleleit && totaleleit >= brancos + nulos + validos) {
          System.out.println("Totalizando...");
        }
        else {
          System.out.println("O número de votos válidos não pode ser maior do que o de eleitores!");
          System.exit(0);
        }
      }
      else {
        System.out.println("O número de votos nulos não pode ser maior do que o de eleitores!");
        System.exit(0);
      }  
    }
    else {
      System.out.println("O número de votos brancos não pode ser maior do que o de eleitores!");
      System.exit(0);
    }
    percbrancos = brancos * 100 / totaleleit;
    percnulos = nulos * 100 / totaleleit;
    percvalidos = validos * 100 / totaleleit;
    valores.close();
    System.out.println("Percentual que os votos brancos representam do total de eleitores: " + percbrancos + "%");
    System.out.println("Percentual que os votos nulos representam do total de eleitores: " + percnulos + "%");  
    System.out.println("Percentual que os votos validos representam do total de eleitores: " + percvalidos + "%");  
  }
}
