/*
* Exercício 3.14
* Java como programar 6a. edicao - p. 85
*/
public class TestaEmpregado{

	public static void main(String[] args){
		
		Empregado empregado1 = new Empregado("Josias", "Tobias", 1000);
		Empregado empregado2 = new Empregado("Dulcineia", "Paz", 2500);
		
		System.out.printf("Empregado %s - salário anual %.2f\n", 
									empregado1.getNome()+" " + empregado1.getSobrenome(),
									empregado1.getSalarioMensal() * 12);
		System.out.printf("Empregado %s - salário anual %.2f\n", 
									empregado2.getNome()+" " + empregado2.getSobrenome(),
									empregado2.getSalarioMensal() * 12);

		System.out.println("----------Aumento\n");
		empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.1);
		empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.1);
		
		System.out.printf("Empregado %s - salário anual %.2f\n", 
									empregado1.getNome()+" " + empregado1.getSobrenome(),
									empregado1.getSalarioMensal() * 12);
		System.out.printf("Empregado %s - salário anual %.2f\n", 
									empregado2.getNome()+" " + empregado2.getSobrenome(),
									empregado2.getSalarioMensal() * 12);		
		
		
	}

}