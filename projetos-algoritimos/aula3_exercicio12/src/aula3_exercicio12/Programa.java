package aula3_exercicio12;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto:");
		double valor = teclado.nextDouble();
		
		System.out.println("Informe a quantidade de produto comprado:");
		double quantidade = teclado.nextDouble();
		
		double total = valor * quantidade; 
		double desconto = total - (total * 10 / 100);
		
		System.out.println("Valor da compra com 10% de desconto:" + desconto);
		
		
	}
}
