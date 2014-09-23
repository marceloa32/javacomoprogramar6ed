/**
* Exercício 4.17
* Java Como Programar 6a edição p. 122
*/
import java.util.Scanner;

public class ConsumoDeCombustivel{

	public static void main(String args[]){
	
		int quilometros = 0;
		int litros = 0;
		int totalQuilometros = 0;
		int totalLitros = 0;
		double media = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Quilometragem percorrida (-1 para encerrar): ");
		quilometros = entradaTeclado.nextInt();
		
		while (quilometros != -1){
			
			System.out.print("Combustivel consumido .....................: ");
			litros = entradaTeclado.nextInt();
		
			totalQuilometros += quilometros;
			totalLitros += litros;
			
			media = (double) quilometros/litros;
			System.out.printf("KM/Litro : %.2f\n ", media);
			System.out.println("");
			System.out.print("Quilometragem percorrida (-1 para encerrar): ");
			quilometros = entradaTeclado.nextInt();
			
		}
		
		if (litros > 0){
			media = (double) totalQuilometros/totalLitros;
			System.out.println("----------");		
			System.out.printf("Total de km ...: %d\n", totalQuilometros);
			System.out.printf("Total de litros: %d\n", totalLitros);
			System.out.printf("KM / Litro ....: %.2f\n", media);
			System.out.println("----------");		
		} else {
			System.out.println("----------");		
			System.out.println("Nenhum dado inserido");		
			System.out.println("----------");		
		}
	}
}