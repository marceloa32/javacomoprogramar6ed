/**
* Exercicio 6.26
* Java Como Programar 6a edicao p. 196
*/
import java.util.Scanner;

public class TestaInverterNumero{

	public static void main(String[] args){
	
		Scanner entradaSistema = new Scanner(System.in);
		InverterNumero in = new InverterNumero();
		int numero = -1;

		System.out.printf("Digite um numero de 1 a 9999 (0 p/ sair): ");
		numero = entradaSistema.nextInt();		
		
		while(numero != 0){
		
			if(numero <0 || numero > 9999){
				System.out.printf("\nNumero invalido");
			} else {
				System.out.printf("\nNumero invertido: %d", in.inverter(numero));
			}
			
			System.out.printf("\nDigite um numero de 1 a 9999 (0 p/ sair): ");
			numero = entradaSistema.nextInt();
		
		}
		
	
	}	

}
