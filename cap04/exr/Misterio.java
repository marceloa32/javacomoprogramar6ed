/**
* Exercício 4.16
* Java Como Programar 6a edição p. 121
*/
public class Misterio{

	public static void main(String[] args){
	
		int y;
		int x = 1;
		int total = 0;
		
		while (x <= 10){
			
				y = x * x;
				System.out.println(y);
				total += y;
				++x;
		}
		
		System.out.printf("O total e' %d\n", total);
	}

}
