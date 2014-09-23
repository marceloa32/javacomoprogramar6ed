/*
* DrawPanelTest.java - Figura 4.20
* Java como programar 6a. edicao - p. 112
*/
import javax.swing.JFrame;

public class TestaPainelDeDesenho{

	public static void main(String[] args){
	
		//cria o painel do desenho
		PainelDeDesenho painel = new PainelDeDesenho();
		
		//Frame para armazenar o painel
		JFrame frame = new JFrame();
		
		//configura o fechamento da aplicação / frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(painel);
		frame.setSize(250,250);
		frame.setVisible(true);
	}
}
