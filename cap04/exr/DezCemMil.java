/**
* Exercício 4.22
* Java Como Programar 6a edição p. 122
*/
public class DezCemMil{

	public static void main(String[] args){
		
		int contador = 1;
		
		System.out.println("N\t10*N\t100*N\t1000*N");
		while(contador <= 5){
			System.out.printf("%d\t%d\t%d\t%d\n", contador, contador*10, contador*100, contador*1000);
			contador++;		
		}
		
	}

}