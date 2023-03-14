import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Infome um número:");
		int numero1 = teclado.nextInt();
		
		System.out.println("Informe outro número:");
		int numero2 = teclado.nextInt();
		
		System.out.println("Informe outro número:");
		int numero3 = teclado.nextInt();
		
		int soma = numero1 + numero2 + numero3;
		
		
		System.out.println("Resultado da soma:");
		System.out.println(soma);
	}

}
