/**
* Exercício 4.19
* Java Como Programar 6a edição p. 122
*/
import java.util.Scanner;

public class ComissaoDosVendedores{

	public static void main(String[] args){
	
		double valor1 = 239.99;
		double valor2 = 129.75;
		double valor3 = 99.95;
		double valor4 = 350.89;
		
		double comissaoSemanal = 200;
		double comissaoSobreVendas = 9;
		
		double valorTotalItens;
		double comissaoSobreItens;
		double valorTotalVendedor;
		
		int codigoDoVendedor = 0;
		int codigoDoItem = 0;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Vendas por vendedor - ultima semana");
		
		System.out.print("Codigo do vendedor (-1 para sair): ");
		codigoDoVendedor = entradaTeclado.nextInt();
		
		while(codigoDoVendedor != -1){
		
			System.out.println("====================");
			System.out.printf("Vendedor %d\n", codigoDoVendedor);
			
			valorTotalItens = 0;
			valorTotalVendedor = 0;
			comissaoSobreItens = 0;
		
			System.out.print("Codigo do item (-1 para terminar): ");
			codigoDoItem = entradaTeclado.nextInt();
			
			while(codigoDoItem != -1){
			
				if(codigoDoItem == 1){
					valorTotalItens += valor1;
				} else if (codigoDoItem == 2){
					valorTotalItens += valor2;
				} else if (codigoDoItem == 3){
					valorTotalItens += valor4;
				} else if (codigoDoItem == 4){
					valorTotalItens += valor3;
				}
				
				System.out.print("Codigo do item (-1 para terminar): ");
				codigoDoItem = entradaTeclado.nextInt();
							
			}	
			
			comissaoSobreItens = valorTotalItens * comissaoSobreVendas / 100;
			valorTotalVendedor = comissaoSemanal + valorTotalItens + comissaoSobreItens;
			
			System.out.printf("--------------------\n");
			System.out.printf("Vendedor ........: %d\n", codigoDoVendedor);			
			System.out.printf("Total dos itens .: %.2f\n", valorTotalItens);
			System.out.printf("Comissao itens ..: %.2f\n", comissaoSobreItens);
			System.out.printf("Comissao semanal : %.2f\n", comissaoSemanal);
			System.out.printf("Total do vendedor: %.2f\n", valorTotalVendedor);
			System.out.printf("--------------------\n");
			System.out.println("");
		
			System.out.println("====================");
			System.out.print("Codigo do vendedor (-1 para sair): ");
			codigoDoVendedor = entradaTeclado.nextInt();
		}	
	
	
	}

}