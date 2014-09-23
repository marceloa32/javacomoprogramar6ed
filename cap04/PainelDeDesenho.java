/*
* DrawPanel.java - Figura 4.19
* Java como programar 6a. edicao - p. 111-12
*/
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelDeDesenho extends JPanel{

	//sobrescrever sempre este método
	public void paintComponent(Graphics g){
	
		//chamar para assegurar a exibição correta
		super.paintComponent(g);
		
		int largura = getWidth();
		int altura = getHeight();
		
		//linha na diagonal esquerda - direita
		g.drawLine(0, 0, largura, altura);
		
		//linha na diagonal direita - esquerda
		g.drawLine(0, altura, largura, 0);		
		
	}
}
