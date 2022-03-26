package lista2;

public class Exercicio2 {
	public static void main(String [] args) {
		Exercicio2 instanciar = new Exercicio2();
		instanciar.verificarValores(0, 0, 0, 0, false);
	}
	
	public void verificarValores(int a, int b, int c, int d, boolean verificar) {
		a = 5;
		b = 4;
		c = 3;
		d = 6;
		
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		System.out.println("Valor de C: " + c);
		System.out.println("Valor de D: " + d);
		
		verificar = (a > c) && (c <= d);
		System.out.println(verificar + " - Isso é Verdade!");
		
		verificar = (a + b) > 10 || (a + b) == (c + d);
		System.out.println(verificar + " - Isso é Verdade!");
		
		verificar = (a >= c) && (d >= c);
		System.out.println(verificar + " - Isso é Verdade!");
	}
}
