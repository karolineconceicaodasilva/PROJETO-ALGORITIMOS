package aula3_exercicio6;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Primeiro valor:");
		double valor1 = teclado.nextDouble();
		
		System.out.println("Segundo valor:");
		double valor2 = teclado.nextDouble();
		
		System.out.println("Terceiro valor:");
		double valor3 = teclado.nextDouble();
		
		double media = (valor1 * 1 + valor2 * 2 + valor3 * 3) / 6;
		
	    System.out.println("Resultado:" + media);
	}

}
