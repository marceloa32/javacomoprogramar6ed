/* 
 * Exercicio 2.17
 * Java como programar 6a edicao - p. 54
*/
import java.util.Scanner;

public class Calculos{

	public static void main(String[] args){
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.print("1o numero: ");
		numero1 = leitor.nextInt();
		
		System.out.print("2o numero: ");
		numero2 = leitor.nextInt();		

		System.out.print("3o numero: ");
		numero3 = leitor.nextInt();				
		
		System.out.println("");		
		System.out.printf("Soma    = %d\n", numero1 + numero2 + numero3);
		System.out.printf("Produto = %d\n", numero1 * numero2 * numero3);
		System.out.printf("Media   = %d\n", (numero1 + numero2 + numero3)/3 ) ;
		
	}
}
