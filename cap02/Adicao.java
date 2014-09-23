/* 
 * Figura 2.7 - Addition.java
 * Java como programar 6a edicao - p. 33
*/
import java.util.Scanner;

public class Adicao{
	
	public static void main(String[] args){
		
		//leitura - scanner
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo numero : ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.printf("A soma e ...............: %d\n", soma);
	}
}



