/**
* Exercício 4.20
* Java Como Programar 6a edição p. 122
*/
import java.util.Scanner;

public class SalarioDosEmpregados{

	public static void main(String[] args){
	
		//variaveis lidas
		int codigoDoEmpregado;
		int horasTrabalhadas;
		double salarioHora;
		
		//variaveis totalizadoras
		double salarioNormal;
		double salarioExtra;
		double salarioTotal;
		int horasExtras;
		
		//variaveis auxiliares
		Scanner entradaTeclado = new Scanner(System.in);
		
		//vai!
		System.out.println("Salario dos empregados\n\n");
		
		System.out.print("Codigo do empregado (-1 sair): ");

		codigoDoEmpregado = entradaTeclado.nextInt();
		
		while (codigoDoEmpregado != -1){
		
			horasExtras = 0;
			salarioNormal = 0;
			salarioExtra = 0;
			salarioTotal = 0;
			
			System.out.print("Horas trabalhadas ...........: ");
			horasTrabalhadas = entradaTeclado.nextInt();
			System.out.print("Salario hora ................: ");
			salarioHora = entradaTeclado.nextDouble();
			
			if(horasTrabalhadas>40){
				horasExtras = horasTrabalhadas - 40;
				horasTrabalhadas = 40;
			}
			
			salarioNormal = horasTrabalhadas * salarioHora;
			salarioExtra = horasExtras * salarioHora * 1.5;
			salarioTotal =  salarioNormal + salarioExtra;
			
			System.out.printf("   Salario normal ...........: %.2f\n", salarioNormal);
			System.out.printf(" + Salario extra ............: %.2f\n", salarioExtra);
			System.out.printf(" = Salario total ............: %.2f\n", salarioTotal);
			
			System.out.print("Codigo do empregado (-1 sair): ");

			codigoDoEmpregado = entradaTeclado.nextInt();
		
		}
		
		
	}

}