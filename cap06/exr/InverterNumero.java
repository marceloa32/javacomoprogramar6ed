/**
* Exercicio 6.26
* Java Como Programar 6a edicao p. 196
*/
public class InverterNumero{

	public int inverter(int numero){
	
		int invertido = 0;
		int resto = numero;
		int aux = 0;
		int limite = 3; //numeros de quatro digitos
		int expoente = 0;
		
		for(int i = limite; i >= 0; i--){
		
			aux = (int) (resto / Math.pow(10, i)); //divisor
			
			resto -= aux * Math.pow(10, i);
			
			invertido += aux * Math.pow(10, expoente);
			expoente++;
				
		}		
		
		return invertido;		
	
	}
	
}