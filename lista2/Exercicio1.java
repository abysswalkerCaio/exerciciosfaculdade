package lista2;

public class Exercicio1 {
	public static void main(String [] args) {
		Exercicio1 instanciar = new Exercicio1();
		instanciar.verificarValores(0, 0, 0, false);
	}
	
	public void verificarValores(int a, int b, int c, boolean verificar) {
		a = 3;
		b = 7;
		c = 4;
		
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		System.out.println("Valor de C: " + c);
		
		verificar = (a + c) > b;
		System.out.println(verificar + " - Isso é Mentira!");
		
		verificar = b >= (a + 2);
		System.out.println(verificar + " - Isso é Verdade!");
		
		verificar = c == (b - a);
		System.out.println(verificar + " - Isso é Verdade!");
		
		verificar = (b + a) <= c;
		System.out.println(verificar + " - Isso é Mentira!");
		
		verificar = (c + a) > b;
		System.out.println(verificar + " - Isso é Mentira!");
	}
}
