/*
* Analysis.java - Figura 4.12
* Java como programar 6a. edicao - p. 106
*/
import java.util.Scanner;

public class Analise{

	public void processarResultadosDoExame(){
	
		Scanner entradaTeclado = new Scanner(System.in);
		
		int aprovados = 0;
		int reprovados = 0;
		int contadorDeEstudantes = 1;
		int resultado;
		
		while (contadorDeEstudantes <= 10){
		
			System.out.print("Digite o resultado (1 aprovado, 2 reprovado): ");
			resultado = entradaTeclado.nextInt();
			
			if (resultado == 1){
				aprovados = aprovados + 1;
			} else {
				reprovados = reprovados + 1;
			}
			
			contadorDeEstudantes = contadorDeEstudantes + 1;		
		}
		
		System.out.printf("Aprovados : %d\nReprovados: %d\n", aprovados, reprovados);
		
		//se mais de oito foram aprovados, aumenta a taxa (cuma?)
		if(aprovados >8){
			System.out.println("Aumentar a taxa de matricula");
		}
	}

}
