/* 
 * Exercicio 2.24
 * Java como programar 6a edicao - p. 54
*/
import java.util.Scanner;

public class MaiorEMenor{

	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int maior;
		int menor;
		
		System.out.print("1o numero: ");
		numero1 = leitor.nextInt();
		
		System.out.print("2o numero: ");
		numero2 = leitor.nextInt();
		
		System.out.print("3o numero: ");
		numero3 = leitor.nextInt();
		
		System.out.print("4o numero: ");
		numero4 = leitor.nextInt();
		
		System.out.print("5o numero: ");

		numero5 = leitor.nextInt();
		
		maior = numero1;
		menor = numero1;
		
		if (numero2 > maior)
			maior = numero2;
			
		if (numero3 > maior)
			maior = numero3;

		if (numero4 > maior)
			maior = numero4;

		if (numero5 > maior)
			maior = numero5;			
			
		if (numero2 < menor)
			menor = numero2;
			
		if (numero3 < menor)
			menor = numero3;

		if (numero4 < menor)
			menor = numero4;

		if (numero5 < menor)
			menor = numero5;						
		
		System.out.println("");
		System.out.println("Maior ...: " + maior);
		System.out.println("Menor ...: " + menor);		
		
	}
	
}