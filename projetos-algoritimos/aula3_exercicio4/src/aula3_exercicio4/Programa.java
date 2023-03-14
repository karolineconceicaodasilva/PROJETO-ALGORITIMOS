package aula3_exercicio4;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor da primeira doação:");
		double valor1 = teclado.nextDouble();
		
		System.out.println("Valor da segunda doação:");
		double valor2 = teclado.nextDouble();
		
		System.out.println("Valor da terceira doação:");
		double valor3 = teclado.nextDouble();
		
		System.out.println("Valor da quarta doação:");
		double valor4 = teclado.nextDouble();
		
		System.out.println("Valor da quinta doação:");
		double valor5 = teclado.nextDouble();
		
		System.out.println("Valor da sexta doação:");
		double valor6 = teclado.nextDouble();
		
		System.out.println("Valor da setima doação:");
		double valor7 = teclado.nextDouble();
		
		System.out.println("Valor da oitava doação:");
		double valor8 = teclado.nextDouble();
		
		System.out.println("Valor da nona doação:");
		double valor9 = teclado.nextDouble();
		
		System.out.println("Valor da decima doação:");
		double valor10 = teclado.nextDouble();
		
		double soma = valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8+ valor9+ valor10;
		
		System.out.println("Valor total das doações:");
		System.out.println(soma);
		
	}

}
