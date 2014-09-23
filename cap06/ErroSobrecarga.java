/**
* MethodOverloadError
* Java Como Programar 6a edição p. 185-6
*/
public class ErroSobrecarga{

	public int aoQuadrado(int x){
		return x*x;
	}
	
	//tipo de retorno diferente, mas parametros e
	//nome igual = erro de compilação
	public double aoQuadrado(int x){
		return x*x;
	}
}