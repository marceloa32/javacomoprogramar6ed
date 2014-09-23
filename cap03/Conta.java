/*
* Account.java - figura 3.13
* Java como programar 6a. edicao - p. 71
*/
public class Conta{

	private double saldo;
	
	public Conta(double saldoInicial){
		if(saldoInicial > 0){
			this.saldo = saldoInicial;
		}
	}
	
	public void creditar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}

}
