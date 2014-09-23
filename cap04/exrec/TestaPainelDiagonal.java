/*
* Exercício 4.1a (estudo de caso)
* Java como programar 6a. edicao - p. 113
*/
import javax.swing.JFrame;

public class TestaPainelDiagonal{

	public static void main(String[] args){
	
		//cria o painel do desenho
		PainelDiagonal painel = new PainelDiagonal();
		
		//Frame para armazenar o painel
		JFrame frame = new JFrame();
		
		//configura o fechamento da aplicação / frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(painel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
