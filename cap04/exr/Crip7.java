/**
* Exercício 4.36
* Java Como Programar 6a edição p. 125
*/
import java.util.Scanner;

public class Crip7{

	public static void main(String[] args){
	
		int numero;
		int x1, x2, x3, x4; //original
		int cripto; //criptografado
		Scanner entradaTeclado = new Scanner(System.in);
		
		
		System.out.print("Digite o numero a criptografar (-1 para sair): ");
		numero = entradaTeclado.nextInt();
		
		while(numero != -1){
		
			if(numero < 1000 & numero > 9999){
				System.out.println("Numero invalido!\n\n");
			} else {
			
				x1 = numero / 1000;
				x2 = (numero - (x1 * 1000)) / 100;
				x3 = (numero - (x1 * 1000) - (x2 * 100)) / 10;
				x4 = (numero - (x1 * 1000) - (x2 * 100) - (x3 * 10));
				
				x1 = (x1 + 7) % 10;
				x2 = (x2 + 7) % 10;
				x3 = (x3 + 7) % 10;
				x4 = (x4 + 7) % 10;
				
				cripto = x3 * 1000 + x4 * 100 + x1 * 10 + x2;
				
				System.out.printf("Numero criptografado: %d\n\n", cripto);
			}
			
			System.out.print("Digite o numero a criptografar (-1 para sair): ");
			numero = entradaTeclado.nextInt();
		
		}
	}
}