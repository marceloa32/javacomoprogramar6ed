/* 
 * Figura 2.15 - Comparison.java
 * Java como programar 6a edicao - p. 39-40
*/
import java.util.Scanner;

public class Comparacao{
	
	public static void main(String[] args){
		
		//leitura - scanner
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo numero : ");
		numero2 = entrada.nextInt();

		if (numero1 == numero2)
			System.out.printf("%d == %d\n", numero1, numero2);
			
		if (numero1 != numero2)
			System.out.printf("%d != %d\n", numero1, numero2);

		if (numero1 < numero2)
			System.out.printf("%d < %d\n", numero1, numero2);
			
		if (numero1 > numero2)
			System.out.printf("%d > %d\n", numero1, numero2);
			
		if (numero1 <= numero2)
			System.out.printf("%d <= %d\n", numero1, numero2);

		if (numero1 >= numero2)
			System.out.printf("%d >= %d\n", numero1, numero2);			

	}
}



