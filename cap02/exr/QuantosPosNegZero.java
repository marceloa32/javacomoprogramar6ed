/* 
 * Exercicio 2.32
 * Java como programar 6a edicao - p. 56
*/
import java.util.Scanner;

public class QuantosPosNegZero{

	public static void main(String[] args){
	
		Scanner entrada = new Scanner(System.in);
		
		int x1;
		int x2;
		int x3;
		int x4;
		int x5;
		
		System.out.print("Digite o 1o. numero: ");
		x1 = entrada.nextInt();
		System.out.print("Digite o 2o. numero: ");
		x2 = entrada.nextInt();
		System.out.print("Digite o 3o. numero: ");
		x3 = entrada.nextInt();
		System.out.print("Digite o 4o. numero: ");
		x4 = entrada.nextInt();
		System.out.print("Digite o 5o. numero: ");
		x5 = entrada.nextInt();
		
		int positivo = 0;
		int negativo = 0;
		int zeros    = 0;
		
		if(x1 == 0)
			zeros = zeros + 1;

		if(x2 == 0)
			zeros = zeros + 1;			
			
		if(x3 == 0)
			zeros = zeros + 1;						
			
		if(x4 == 0)
			zeros = zeros + 1;									
			
		if(x5 == 0)
			zeros = zeros + 1;												

		if(x1 > 0)
			positivo = positivo + 1;

		if(x2 > 0)
			positivo = positivo + 1;			
			
		if(x3 > 0)
			positivo = positivo + 1;						
			
		if(x4 > 0)
			positivo = positivo + 1;									
			
		if(x5 > 0)
			positivo = positivo + 1;															

		if(x1 < 0)
			negativo = negativo + 1;

		if(x2 < 0)
			negativo = negativo + 1;			
			
		if(x3 < 0)
			negativo = negativo + 1;						
			
		if(x4 < 0)
			negativo = negativo + 1;									
			
		if(x5 < 0)
			negativo = negativo + 1;															
			
		System.out.println("\n");		
		System.out.println("Positivos: " + positivo);
		System.out.println("Negativos: " + negativo);
		System.out.println("Zeros    : " + zeros);
				
		
	}	
}