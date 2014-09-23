/**
* Exercício 4.37c
* Java Como Programar 6a edição p. 125
*/
import java.util.Scanner;

public class Euler2{

	public static void main(String args[]){
	
		int expoente, fatorial;
		double euler;
		int contadorFormula, contadorFatorial;
		Scanner entradaTeclado = new Scanner(System.in);
		
		int passos = 10;
		long numerando = 1;
		
		System.out.print("Digite o expoente de e (-1 sair): ");
		expoente = entradaTeclado.nextInt();
		
		while(expoente != -1){
		
			if(expoente < 1){
				System.out.println("Numero invalido!\n\n");
			} else {
				
				contadorFormula = 1;
				euler = 1;
				numerando = 0;
				
				while(contadorFormula <= passos){
				
					contadorFatorial = contadorFormula;
					fatorial = 1;
					while(contadorFatorial > 0){
						fatorial*=contadorFatorial;
						contadorFatorial--;
					}
					
					numerando = elevar(expoente,contadorFormula);					
					
					euler += (double)numerando/fatorial;
					contadorFormula++;
				}
				System.out.printf("e^%d = %.10f\n\n", expoente, euler);
			}			
			
			System.out.print("Digite o expoente de e (-1 sair): ");
			expoente = entradaTeclado.nextInt();
		
		}
	}
	
	public static long elevar(int base, int expoente){
		
		long resultado = 0;
		
		if(expoente == 0){
			resultado = 1;
		} else if(expoente == 1){
			resultado = base;
		} else {		
			resultado = base;
			int contador = 1;
			while(contador < expoente){
				resultado*=base;
				contador++;
			}
		}

		return resultado;
	}

}
