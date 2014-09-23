/**
* Exercício 4.23
* Java Como Programar 6a edição p. 122
*/
import java.util.Scanner;

public class OsMaiores{

	public static void main(String[] args){
	
		int contador = 1;
		int numero = 0;
		int maior = 0;
		int segundoMaior = 0; 
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		while (contador <= 10){
			
			System.out.printf("Digite o %02d numero: ", contador);
			
			numero = entradaTeclado.nextInt();
			
			if(numero > segundoMaior){
				if(numero > maior){
					segundoMaior = maior;
					maior = numero;
				} else {
					segundoMaior = numero;
				}
			}
				
			contador++;
		}

		System.out.printf("\nO maior dos numeros e' %d\n", maior);
		System.out.printf("\nO segundo maior e' %d\n", segundoMaior);
		
	}
	
}
