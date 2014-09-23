/* 
 * Exercicio 2.25
 * Java como programar 6a edicao - p. 55
*/
import java.util.Scanner;

public class ParOuImpar{

	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero: ");
		numero = leitor.nextInt();
		
		if (numero%2 ==0)
			System.out.printf("%d e' par\n", numero);			
			
		if (numero%2 !=0)
			System.out.printf("%d e' impar\n", numero);			
		
	}
	
}