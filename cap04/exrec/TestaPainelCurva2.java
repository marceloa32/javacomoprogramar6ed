/*
* Exercício 4.2b (estudo de caso)
* Java como programar 6a. edicao - p. 113
*/
import javax.swing.JFrame;

public class TestaPainelCurva2{

	public static void main(String[] args){
	
		//cria o painel do desenho
		PainelCurva2 painel = new PainelCurva2();
		
		//Frame para armazenar o painel
		JFrame frame = new JFrame();
		
		//configura o fechamento da aplicação / frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(painel);
		frame.setSize(308,327);
		frame.setVisible(true);
	}
}
