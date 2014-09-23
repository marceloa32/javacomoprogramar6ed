/**
* Exercício 4.15c
* Java Como Programar 6a edição p. 121
*/
public class ExercicioQuatroQuinzeC {
	
	public static void main(String[] args){
	
		int total = 0, x = 1;
		//original
		// while (x <= 100)
			// total += x;
			// ++x;
		
		
		//corrigido
		while (x <= 100){
			total += x;
			++x;		
		}
		
		System.out.printf("Total %d\n", total);
	}
	
}