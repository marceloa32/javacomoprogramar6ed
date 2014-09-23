/**
* Exercício 4.37b
* Java Como Programar 6a edição p. 125
*/
import java.util.Scanner;

public class Euler{

	public static void main(String args[]){
	
		int numero, fatorial;
		double euler;
		int contadorFormula, contadorFatorial;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Digite o numero maximo para obter e (-1 sair): ");
		numero = entradaTeclado.nextInt();
		
		while(numero != -1){
		
			if(numero < 1){
				System.out.println("Numero invalido!\n\n");
			} else {
				contadorFormula = 1;
				euler = 1;
				
				while(contadorFormula <= numero){
				
					contadorFatorial = contadorFormula;
					fatorial = 1;
					while(contadorFatorial > 0){
						fatorial*=contadorFatorial;
						contadorFatorial--;
					}
					euler += (double)1/fatorial;
					contadorFormula++;
				}
				System.out.printf("valor aproximado de e = %.10f\n\n", euler);
			}			
			
			System.out.print("Digite o numero maximo para obter e (-1 sair): ");
			numero = entradaTeclado.nextInt();
		
		}
	}

}
