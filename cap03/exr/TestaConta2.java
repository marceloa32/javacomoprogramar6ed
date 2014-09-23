/*
* Exercício 3.12
* Java como programar 6a. edicao - p. 85
*/
import java.util.Scanner;

public class TestaConta2{

	public static void main(String[] args){
		
		Conta2 conta1 = new Conta2(50.00);
		Conta2 conta2 = new Conta2(-7.53);
		
		System.out.printf("---------------------------\n");
		System.out.printf("Saldo da conta 1: R$ %.2f\n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: R$ %.2f\n", conta2.getSaldo());
		System.out.printf("---------------------------\n");
		
		Scanner scanner = new Scanner(System.in);
		double valor;		
		
		//-------------------- DEPOSITO
		//conta 1
		System.out.println("Digite o valor do depósito para conta 1: ");
		valor = scanner.nextDouble();
		System.out.printf("\nAdicionando %.2f ao saldo da conta 1\n\n", valor);
		conta1.creditar(valor);
		
		System.out.printf("---------------------------\n");
		System.out.printf("Saldo da conta 1: R$%.2f\n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: R$%.2f\n", conta2.getSaldo());
		System.out.printf("---------------------------\n");
				
		//conta 2
		System.out.println("Digite o valor do depósito para conta 2: ");
		valor = scanner.nextDouble();
		System.out.printf("\nAdicionando %.2f ao saldo da conta 2\n\n", valor);
		conta2.creditar(valor);
		
		System.out.printf("---------------------------\n");
		System.out.printf("Saldo da conta 1: R$ %.2f\n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: R$ %.2f\n", conta2.getSaldo());
		System.out.printf("---------------------------\n");
		
		//-------------------- RETIRADA
		//conta 1
		System.out.println("Digite o valor da retirada da conta 1: ");
		valor = scanner.nextDouble();
		System.out.printf("\nDebitando %.2f do saldo da conta 1\n\n", valor);
		conta1.debitar(valor);
		
		System.out.printf("---------------------------\n");
		System.out.printf("Saldo da conta 1: R$%.2f\n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: R$%.2f\n", conta2.getSaldo());
		System.out.printf("---------------------------\n");
				
		//conta 2
		System.out.println("Digite o valor da retirada da conta 2: ");
		valor = scanner.nextDouble();
		System.out.printf("\nDebitando %.2f do saldo da conta 2\n\n", valor);
		conta2.debitar(valor);
		
		System.out.printf("---------------------------\n");
		System.out.printf("Saldo da conta 1: R$ %.2f\n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: R$ %.2f\n", conta2.getSaldo());
		System.out.printf("---------------------------\n");		
		
		
	}

}
