/*
* Exercício 3.12
* Java como programar 6a. edicao - p. 85
*/
public class Conta2{

	private double saldo;
	
	public Conta2(double saldoInicial){
		if(saldoInicial > 0){
			this.saldo = saldoInicial;
		}
	}
	
	public void creditar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public void debitar(double valor){
		if(valor > this.saldo){
			System.out.printf("Quantia do débito excede o saldo da conta\n");
		} else { 
			this.saldo = this.saldo - valor;
		} 
	}
	
	public double getSaldo(){
		return this.saldo;
	}

}
