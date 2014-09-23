/**
* Exercício 4.37a
* Java Como Programar 6a edição p. 125
*/
import java.util.Scanner;

public class Fatorial{

	public static void main(String args[]){
	
		int numero, contador, fatorial;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Digite o numero para obter fatorial (-1 sair): ");
		numero = entradaTeclado.nextInt();
		
		while(numero != -1){
		
			if(numero < 1){
				System.out.println("Numero invalido!\n\n");
			} else {
				contador = numero;
				fatorial = 1;
				while(contador > 0){
					fatorial*=contador;
					contador--;
				}
				System.out.printf("Fatorial de %d = %d\n\n", numero, fatorial);
			}			
			
			System.out.print("Digite o numero para obter fatorial (-1 sair): ");
			numero = entradaTeclado.nextInt();			
		
		}
	}

}
