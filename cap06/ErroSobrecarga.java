/**
* MethodOverloadError
* Java Como Programar 6a edi��o p. 185-6
*/
public class ErroSobrecarga{

	public int aoQuadrado(int x){
		return x*x;
	}
	
	//tipo de retorno diferente, mas parametros e
	//nome igual = erro de compila��o
	public double aoQuadrado(int x){
		return x*x;
	}
}