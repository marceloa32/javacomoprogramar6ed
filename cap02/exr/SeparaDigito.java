/* 
 * Exercicio 2.30
 * Java como programar 6a edicao - p. 56
*/
import java.util.Scanner;

public class SeparaDigito{

	public static void main(String[] args){
	
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero com 5 digitos: ");
		numero = entrada.nextInt();
		
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int resto;
		
		n1 = numero / 10000;
		resto = numero % 10000;
		
		n2 = resto / 1000;
		resto = resto % 1000;

		n3 = resto / 100;
		resto = resto % 100;		
		
		n4 = resto / 10;
		n5 = resto % 10;				
		
		System.out.printf("%d %d %d %d %d", n1, n2, n3, n4, n5);
		
		
	}
}