package aula3_exercicio11;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto:");
		double valor = teclado.nextDouble();
		
		System.out.println("Informe a quantidade de produto comprado:");
		double quantidade = teclado.nextDouble();
		
		double calculo = valor * quantidade;
		
		System.out.println("Valor total da compra:" + calculo);	
		
		
	}

}
