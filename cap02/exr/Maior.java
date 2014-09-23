/* 
 * Exercicio 2.16
 * Java como programar 6a edicao - p. 54
*/
import java.util.Scanner;

public class Maior{

	public static void main(String[] args){
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		
		System.out.print("1o numero: ");
		numero1 = leitor.nextInt();
		
		System.out.print("2o numero: ");
		numero2 = leitor.nextInt();		
		
		System.out.println("");
		
		if (numero1 > numero2)
			System.out.printf("%d e' maior que %d\n", numero1, numero2);

		if (numero1 < numero2)
			System.out.printf("%d e' maior que %d\n", numero2, numero1);
			
		if (numero1 == numero2)
			System.out.printf("Estes numeros sao iguais.\n");

	}
}