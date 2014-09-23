/**
* Exercício 4.31
* Java Como Programar 6a edição p. 124
*/
import java.util.Scanner;

public class Binario{

	public static void main(String[] args){
	
		int binario = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Digite um numero binario (-1 sai): ");
		
		binario = entradaTeclado.nextInt();
		
		while (binario != -1){
		
			if (binario > 11111){
				System.out.println("Valor invalido!\n");
			} else {
				valorDecimal(binario);
			}		
			
			System.out.print("Digite um numero binario (-1 sai): ");
			binario = entradaTeclado.nextInt();			
		
		}
	
	}
	
	
	public static void valorDecimal(int binario){
	
		int x1, x2, x3, x4, x5;
		int decimal = 0;
		
		x1 = binario / 10000;
		x2 = (binario - (x1 * 10000)) / 1000;
		x3 = (binario - (x1 * 10000) - (x2 * 1000)) / 100;
		x4 = (binario - (x1 * 10000) - (x2 * 1000) - (x3 * 100)) / 10;
		x5 = (binario - (x1 * 10000) - (x2 * 1000) - (x3 * 100) - (x4 * 10));
		
		if(x1 <= 1 && x2 <= 1 && x3 <= 1 && x4 <= 1 && x5 <= 1){
		
			decimal = x1 * 16 + x2 * 8 + x3 * 4 + x4 * 2 + x5 * 1;
			System.out.printf("Equivalente decimal de %d = %d\n\n", binario, decimal);		
		
		} else {
			System.out.println("Nao e' numero binario\n");
		}
		
		
	}

}
