import java.util.Scanner;

public class Programa {
   public static void main(String[] args) {
	
	   Scanner teclado = new Scanner(System.in);
	   
	   System.out.println("Informe um número:");
	   double numero1 = teclado.nextDouble();
	   
	   System.out.println("Informe outro número:");
	   double numero2 = teclado.nextDouble();
	  
	   System.out.println("Informe outro número:");
	   double numero3 = teclado.nextDouble();
	   
	   System.out.println("Infrome outro número:");
	   double numero4 = teclado.nextDouble();
	   
	   double soma = numero1 + numero2+ numero3 + numero4;
	   double media = soma / 4;
	   
	   System.out.println("Resultado:");
	   System.out.println(media);
   }
}
