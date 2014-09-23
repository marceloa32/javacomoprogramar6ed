/**
* Exercício 4.32
* Java Como Programar 6a edição p. 124
*/
public class TabuleiroNovo{
	
	public static void main(String[] args){
	
		int linha = 1;
		int coluna = 1;
		
		while (linha <= 8){
			coluna = 1;
			while(coluna <= 8){
				if((linha % 2) == 0){
					if((coluna % 2) == 0)
						System.out.print(" "); //2
					else 
						System.out.print("*"); //1
				} else {
					if((coluna % 2) == 0)
						System.out.print("*"); //2
					else 
						System.out.print(" "); //1
				}				
				coluna++;
			}
			System.out.println(); //3
			linha++;
			
		}

	}

}