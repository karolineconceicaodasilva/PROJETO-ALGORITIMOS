package aula3_exercicio14;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	    System.out.println("A seguir digite 3 números "
	    		+ "que serão usados para medir a área "
	    		+ "de um círculo, quadrado, retângulo "
	    		+ "e triângulo!!!");
		
	    System.out.println("Digita um número A:");
		double numeroA = teclado.nextDouble();
		
		System.out.println("Digita outro número B:");
		double numeroB = teclado.nextDouble();
		
		System.out.println("Digita outro número C:");
		double numeroC = teclado.nextDouble();
	
//		• A área de um círculo de raio c.
		double circulo = 3.14 * (numeroC * numeroC);
		System.out.println("Resultado da área do círculo:" + circulo);
		
		
//		• A área de um quadrado de lado b.
		double quadrado = numeroB * numeroB;  
		System.out.println("Área de um quadrado:" + quadrado);
		
//		• A área de um retângulo de lados a e b.
		double retangulo = numeroA * numeroB;
		System.out.println("Área de um retângulo de lados a e b:" + retangulo);
		
//		• A área de um triângulo retângulo que tem a por base e b por altura.
		double triangulo = (numeroA * numeroB ) / 2;
		System.out.println("Área de um triângulo retângulo:" + triangulo);
	
	}
}
