/* 
 * Exercicio 2.6
 * Java como programar 6a edicao - p. 52
*/
import java.util.Scanner;

public class ProdutoDeTres{

	public static void main(String[] args){
	
		//Calcula o priduto de três inteiros
		Scanner entrada = new Scanner(System.in);
		int x, y, z, result;
		
		System.out.print("Digite o primeiro inteiro: ");
		x = entrada.nextInt();
		System.out.print("Digite o segundo inteiro : ");
		y = entrada.nextInt();
		System.out.print("Digite o terceiro inteiro: ");
		z = entrada.nextInt();
		result = x * y * z;		
		System.out.print("O produto e' ............: " + result);
		
	}
}
