/*
* Exercício 3.15
* Java como programar 6a. edicao - p. 85
*/
public class Data{

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void setDia(int dia){
		this.dia = dia;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public int getDia(){
		return this.dia;
	}
	
	public int getMes(){
		return this.mes;
	}
	
	public int getAno(){
		return this.ano;
	}
	
	public void mostrarData(){
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
}
