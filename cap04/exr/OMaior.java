/**
* Exercício 4.21
* Java Como Programar 6a edição p. 122
*/
import java.util.Scanner;

public class OMaior{

	public static void main(String[] args){
	
		int contador = 1; //counter
		int numero = 0; //number
		int maior = 0; //largest
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		while (contador <= 10){
			
			System.out.printf("Digite o %02d numero: ", contador);
			
			numero = entradaTeclado.nextInt();
			
			if(numero > maior)
				maior = numero;
				
			contador++;
		}

		System.out.printf("\nO maior dos numeros e' %d\n", maior);
		
	}
	
}
