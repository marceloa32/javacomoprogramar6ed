/* 
 * Exercicio 2.26
 * Java como programar 6a edicao - p. 55
*/
import java.util.Scanner;

public class Multiplo{

	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("1o numero: ");
		numero1 = leitor.nextInt();
		
		System.out.print("2o numero: ");
		numero2 = leitor.nextInt();		

		
		if (numero1%numero2 ==0){
			System.out.printf("%d e' multiplo de %d\n", numero1, numero2);
			System.out.printf("O quociente e' %d", numero1/numero2);
		}
		
		if (numero1%numero2 !=0)
			System.out.printf("%d nao e' multiplo de %d\n", numero1, numero2);
		
	}
	
}