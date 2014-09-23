/**
* Exercício 4.30
* Java Como Programar 6a edição p. 124
*/
import java.util.Scanner;

public class Palindromo{

	public static void main(String args[]){
	
		int numero = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Digite um numero de 5 digitos (-1 sai): ");
		numero = entradaTeclado.nextInt();		
		
		while (numero != -1){
		
			if(numero <= 99999 && numero >= 10000){
				verificarPalindromo(numero);	
			} else {
				System.out.println("Numero invalido\n");
			}			
			
			System.out.print("Digite um numero de 5 digitos (-1 sai): ");
			numero = entradaTeclado.nextInt();
		}
		
	}
	
	public static void verificarPalindromo(int numero){
	
		int x1, x2, x3, x4, x5;
		x1 = numero / 10000;
		x2 = (numero - (x1 * 10000)) / 1000;
		x3 = (numero - (x1 * 10000) - (x2 * 1000)) / 100;
		x4 = (numero - (x1 * 10000) - (x2 * 1000) - (x3 * 100)) / 10;
		x5 = (numero - (x1 * 10000) - (x2 * 1000) - (x3 * 100) - (x4 * 10));
		
		if( (x1 == x5) && (x2 == x4)){
			System.out.printf("%d e' palindromo\n\n", numero);
		} else {
			System.out.printf("%d nao e' palindromo\n\n", numero);
		}
	}

}