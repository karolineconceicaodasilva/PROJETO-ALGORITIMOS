import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
		
    	Scanner teclado = new Scanner(System.in);
    	
    	System.out.println("Informe um número:");
    	int numero1 = teclado.nextInt();
    	
    	System.out.println("Informe outro número:");
    	int numero2 = teclado.nextInt();
    	
    	int subtrair = numero1 - numero2;
    	
    	
    	System.out.println("Resultado");
    	System.out.println(subtrair);
	}
	
}
