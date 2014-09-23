/*
* AccountTest.java - figura 3.14
* Java como programar 6a. edicao - p. 72
*/
import java.util.Scanner;

public class TestaConta{

	public static void main(String[] args){
		
		Conta conta1 = new Conta(50.00);
		Conta conta2 = new Conta(-7.53);
		
		System.out.printf("Saldo da conta 1: R$ %.2f\n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: R$ %.2f\n", conta2.getSaldo());
		
		Scanner scanner = new Scanner(System.in);
		double valorDoDeposito;
		
		
		//conta 1
		System.out.println("Digite o valor do depósito para conta 1: ");
		valorDoDeposito = scanner.nextDouble();
		System.out.printf("\nAdicionando %.2f ao saldo da conta 1\n\n", valorDoDeposito);
		conta1.creditar(valorDoDeposito);
		
		System.out.printf("Saldo da conta 1: R$%.2f\n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: R$%.2f\n", conta2.getSaldo());
				
		//conta 2
		System.out.println("Digite o valor do depósito para conta 2: ");
		valorDoDeposito = scanner.nextDouble();
		System.out.printf("\nAdicionando %.2f ao saldo da conta 2\n\n", valorDoDeposito);
		conta2.creditar(valorDoDeposito);
		
		System.out.printf("Saldo da conta 1: R$ %.2f\n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: R$ %.2f\n", conta2.getSaldo());
		
	}

}
