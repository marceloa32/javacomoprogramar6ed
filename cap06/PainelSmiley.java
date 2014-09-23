/**
* DrawSmiley
* Java Como Programar 6a edição p. 187
*/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelSmiley extends JPanel{

	public void paintComponent(Graphics g){
	
		super.paintComponent(g);
		
		//rosto
		g.setColor(Color.YELLOW);
		g.fillOval(10,10,200,200);
		
		//olhos
		g.setColor(Color.BLACK);
		g.fillOval(55,65,30,30);
		g.fillOval(135,65,30,30);
		
		//boca
		g.fillOval(50,110,120,60);
		
		//boca ficou oval - corrigir
		g.setColor(Color.YELLOW);
		g.fillRect(50,110,120,30);
		g.fillOval(50,120,120,40);
		
		
	}
}
