package aula3_exercicio8;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
	 Scanner teclado = new Scanner(System.in);
	 
	 System.out.println("Qual o comprimento do muro:");
	 double comprimento = teclado.nextDouble();
	 
	 System.out.println("Qual altura do muro:");
	 double altura = teclado.nextDouble();
	 
	 double area = comprimento * altura;
	 
	 System.out.println("A área do muro é:" + area);
	 
	}
}
