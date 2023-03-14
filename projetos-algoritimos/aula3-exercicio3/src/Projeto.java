import java.util.Scanner;

public class Projeto {
 public static void main(String[] args) {
	
	 Scanner teclado = new Scanner(System.in);
	
	 System.out.println("Idade de uma pessoa:");
	 double idade1 = teclado.nextDouble();
	 
	 System.out.println("Idade da outra pessoa:");
	 double idade2 = teclado.nextDouble();
	 
	 double subtrair = idade1 - idade2;
	 
	 System.out.println("Resultado");
 	 System.out.println(subtrair);
 }
}
