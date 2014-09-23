/**
* Exercício 4.24
* Java Como Programar 6a edição p. 122
*/
import java.util.Scanner;

public class AnaliseModificada{

	public void processarResultadosDoExame(){
	
		Scanner entradaTeclado = new Scanner(System.in);
		
		int aprovados = 0;
		int reprovados = 0;
		int contadorDeAlunos = 1;
		int resultado;
		
		while (contadorDeAlunos <= 10){
		
			System.out.print("Digite o resultado (1 aprovado, 2 reprovado): ");
			resultado = entradaTeclado.nextInt();
			
			while(resultado != 1 && resultado != 2){
				System.out.print("Resultado invalido!\n\n");
				System.out.print("Digite o resultado (1 aprovado, 2 reprovado): ");
				resultado = entradaTeclado.nextInt();
			}
			
			if(resultado == 1)
				aprovados+=1;
			else 
				reprovados+=1;
				
			contadorDeAlunos++;		
		}
		
		System.out.printf("Aprovados : %d\nReprovados: %d\n", aprovados, reprovados);
		
		if(aprovados > 8){
			System.out.println("Aumentar a taxa de matricula");
		}
		
	}

}
