/*
* Exercício 3.13
* Java como programar 6a. edicao - p. 85
*/

public class FaturaDeItem{

	private String numero;
	private String descricao;
	private int quant;
	private double preco;
	
	public FaturaDeItem(String numero, String descricao, int quant, double preco){

		this.numero = numero;
		this.descricao = descricao;
		if(quant < 0)
			quant = 0;
		if(preco < 0)
			preco = 0;
		this.quant = quant;
		this.preco = preco;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public void setQuant(int quant){
		this.quant = quant;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public int getQuant(){
		return this.quant;
	}
	
	public double getPreco(){
		return this.preco;
	}
	
	public double getValor(){
		double valor = this.preco * this.quant;
		if (valor < 0)
			valor = 0;
		return valor;
	}

}
