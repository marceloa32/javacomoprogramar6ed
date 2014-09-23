/*
* Exercício 3.13
* Java como programar 6a. edicao - p. 85
*/
import java.util.Scanner;

public class TestaFaturaDeItem{

	public static void main(String[] args){
	
		String numero;
		String descricao;
		double preco;
		int quantidade;
		
		Scanner entrada = new Scanner(System.in);
		
		//---------- FATURA 1
		System.out.printf("Numero da Fatura: ");
		numero = entrada.nextLine();
		System.out.printf("Descricao ......: ");
		descricao = entrada.nextLine();
		System.out.printf("Quantidade .....: ");
		quantidade = entrada.nextInt();
		System.out.printf("Preco...........: ");
		preco = entrada.nextDouble();
		
		FaturaDeItem faturaDeItem = new FaturaDeItem(numero,descricao,quantidade,preco);

		System.out.printf("------------------------------\n");
		System.out.printf("Numero da Fatura: %s\n"  , faturaDeItem.getNumero());		
		System.out.printf("Descricao ......: %s\n"  , faturaDeItem.getDescricao());		
		System.out.printf("Quantidade .....: %d\n"  , faturaDeItem.getQuant());		
		System.out.printf("Preco...........: %.2f\n", faturaDeItem.getPreco());
		System.out.printf("Total da ordem .: %.2f\n", faturaDeItem.getValor());
		System.out.printf("------------------------------\n");
		entrada.nextLine();
		
		//---------- FATURA 2
		System.out.printf("Numero da Fatura: ");
		numero = entrada.nextLine();
		System.out.printf("Descricao ......: ");
		descricao = entrada.nextLine();
		System.out.printf("Quantidade .....: ");
		quantidade = entrada.nextInt();
		System.out.printf("Preco...........: ");
		preco = entrada.nextDouble();
		
		faturaDeItem.setNumero(numero);
		faturaDeItem.setDescricao(descricao);
		faturaDeItem.setQuant(quantidade);
		faturaDeItem.setPreco(preco);
		
		System.out.printf("------------------------------\n");
		System.out.printf("Numero da Fatura: %s\n"  , faturaDeItem.getNumero());		
		System.out.printf("Descricao ......: %s\n"  , faturaDeItem.getDescricao());		
		System.out.printf("Quantidade .....: %d\n"  , faturaDeItem.getQuant());		
		System.out.printf("Preco...........: %.2f\n", faturaDeItem.getPreco());
		System.out.printf("Total da ordem .: %.2f\n", faturaDeItem.getValor());
		System.out.printf("------------------------------\n");
		
	
	
	}

}
