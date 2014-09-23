/**
* Exercício 4.6
* Java Como Programar 6a edição p. 1
*/
public class SomaUmADez{
	
	public static void main(String[] args){
		int soma, x;
		x = 1;
		soma = 0;
		
		while (x <= 10){
			soma+=x;
			x++;
		}
		
		System.out.printf("A soma e' %d\n", soma);
	}

}