/*
* Exercício 4.2a (estudo de caso)
* Java como programar 6a. edicao - p. 113
*/
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelCurva extends JPanel{

	//sobrescrever sempre este método
	public void paintComponent(Graphics g){
	
		//chamar para assegurar a exibição correta
		super.paintComponent(g);
		
		int x1 = 0;
		int y1 = 0;		
		int x2 = 0;
		int y2 = 0;
		System.out.println(x2 + "|" + y2);
		
		int incrementox = getWidth()/15;
		int incrementoy = getHeight()/15;
		
		int contador = 0;
		x2 = 0;
		y2 = getHeight();
		
		//canto A
		while (contador <= 15){			
			System.out.println(x1 + "|" + y1 + "|" + x2 + "|" + y2);
			g.drawLine(x1, y1, x2, y2);			
			
			//para cada linha sucessiva, mova-se para baixo um incremento na borda esquerda 
			//e um incremento para a direita na borda inferior
			x2+=incrementox;			
			y1+=incrementoy;
			contador++;
		}
	
		
	}
}
