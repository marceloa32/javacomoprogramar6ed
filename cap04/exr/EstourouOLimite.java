/**
* Exercício 4.18
* Java Como Programar 6a edição p. 122
*/
import java.util.Scanner;

public class EstourouOLimite{
	
	public static void main(String[] args){
	
		int numeroDaConta;
		double saldoInicioMes;
		double despesas;
		double creditos;
		double limite;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Loja de departamentos - Clientes\n\n");
		System.out.print("Digite os dados do cliente\n\n");
				
		System.out.print("Conta (-1 sair): ");
		numeroDaConta = entradaTeclado.nextInt();
		
		while (numeroDaConta != -1){
			System.out.print("Saldo Inicial .: ");
			saldoInicioMes = entradaTeclado.nextDouble();
			System.out.print("Despesas ......: ");
			despesas = entradaTeclado.nextDouble();
			System.out.print("Creditos ......: ");
			creditos = entradaTeclado.nextDouble();
			System.out.print("Limite ........: ");	
			limite = entradaTeclado.nextDouble();		
			
			double novoSaldo = saldoInicioMes + despesas - creditos;
			System.out.printf("Novo saldo ....: %.2f\n", novoSaldo);
			if(novoSaldo > limite){
				System.out.println("Limite de credito excedido");
			}
			
			System.out.println("");
			System.out.print("Conta (-1 sair): ");
			numeroDaConta = entradaTeclado.nextInt();
		}
	
	}
	
}