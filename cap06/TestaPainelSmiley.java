/**
* DrawSmileyTest
* Java Como Programar 6a edição p. 187-8
*/
import javax.swing.JFrame;

public class TestaPainelSmiley{

	public static void main(String[] args){
	
		PainelSmiley painel = new PainelSmiley();
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(painel);
		frame.setSize(230,250);
		frame.setVisible(true);
	}
}