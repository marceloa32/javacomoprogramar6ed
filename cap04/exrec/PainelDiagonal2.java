/*
* Exercício 4.1b (estudo de caso)
* Java como programar 6a. edicao - p. 113
*/
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelDiagonal2 extends JPanel{

	//sobrescrever sempre este método
	public void paintComponent(Graphics g){
	
		//chamar para assegurar a exibição correta
		super.paintComponent(g);
		
		int x1 = 0;
		int y1 = 0;		
		int x2 = getWidth();
		int y2 = getHeight();
		
		int incrementox = x2/15;
		int incrementoy = y2/15;
		
		int contador = 0;
		y2 = 0;
		
		//canto A
		while (contador <= 15){
			
			
			g.drawLine(x1, y1, x2, y2);			
			
			x2-=incrementox;
			y2+=incrementoy; 
			contador++;
		}

		//canto B
		contador = 0;
		x1 = 0;
		y1 = 0;		
		x2 = getWidth();
		y2 = 0;		

		while (contador <= 15){
			
			g.drawLine(x1, y1, x2, y2);			
			
			x1+=incrementox;
			y1+=incrementoy; 
			contador++;
		}
		
		
		//canto C
		contador = 0;
		x1 = 0;
		y1 = getHeight();		
		x2 = 0;
		y2 = 0;		

		while (contador <= 15){
			
			g.drawLine(x1, y1, x2, y2);			
			
			x2+=incrementox;
			y2+=incrementoy; 
			contador++;
		}

		//canto D
		contador = 0;
		x1 = 0;
		y1 = getHeight();		
		x2 = getWidth();
		y2 = getHeight();		

		while (contador <= 15){
			
			g.drawLine(x1, y1, x2, y2);			
			
			x1+=incrementox;
			y1-=incrementoy; 
			contador++;
		}			
		
		
	}
}
