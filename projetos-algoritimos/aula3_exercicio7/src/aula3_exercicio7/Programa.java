package aula3_exercicio7;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		double peso = teclado.nextDouble();
		
		System.out.println("Digite sua altura:");
		double altura = teclado.nextDouble();
		
		double soma = peso / (altura * altura);
		
		
		System.out.println("Resultado de seu IMC:" + soma);
	}
}
