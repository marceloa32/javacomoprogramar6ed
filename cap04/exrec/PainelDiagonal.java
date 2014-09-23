/*
* Exercício 4.1a (estudo de caso)
* Java como programar 6a. edicao - p. 113
*/
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelDiagonal extends JPanel{

	//sobrescrever sempre este método
	public void paintComponent(Graphics g){
	
		//chamar para assegurar a exibição correta
		super.paintComponent(g);
		
		int x2 = getWidth();
		int y2 = getHeight();

		y2 = 0;
		while (x2 >= 0){
			g.drawLine(0, 0, x2, y2);
			x2-=15;
			y2+=15; 
		}
		
	}
}
