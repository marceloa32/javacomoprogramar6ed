/*
* Exerc�cio 4.2b (estudo de caso)
* Java como programar 6a. edicao - p. 113
*/
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelCurva2 extends JPanel{

	//sobrescrever sempre este m�todo
	public void paintComponent(Graphics g){
	
		//chamar para assegurar a exibi��o correta
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
	

		//canto B
		contador = 0;
		x1 = getWidth();
		y1 = 0;		
		x2 = getWidth();
		y2 = getHeight();
		
		while (contador <= 15){			
			System.out.println(x1 + "|" + y1 + "|" + x2 + "|" + y2);
			g.drawLine(x1, y1, x2, y2);			
			
			//para cada linha sucessiva, mova-se para baixo um incremento na borda esquerda 
			//e um incremento para a direita na borda inferior
			x1-=incrementox;			
			y2-=incrementoy;
			contador++;
		}
		
		//canto C
		contador = 0;
		x1 = 0;
		y1 = getHeight();		
		x2 = 0;
		y2 = 0;
		
		while (contador <= 15){			
			System.out.println(x1 + "|" + y1 + "|" + x2 + "|" + y2);
			g.drawLine(x1, y1, x2, y2);			
			
			//para cada linha sucessiva, mova-se para baixo um incremento na borda esquerda 
			//e um incremento para a direita na borda inferior
			x2+=incrementox;			
			y1-=incrementoy;
			contador++;
		}		
		
		//canto D
		contador = 0;
		x1 = getWidth();
		y1 = 0;		
		x2 = getWidth();
		y2 = getHeight();
		
		while (contador <= 15){			
			System.out.println(x1 + "|" + y1 + "|" + x2 + "|" + y2);
			g.drawLine(x1, y1, x2, y2);			
			
			//para cada linha sucessiva, mova-se para baixo um incremento na borda esquerda 
			//e um incremento para a direita na borda inferior
			x2-=incrementox;
			y1+=incrementoy;
			contador++;
		}				
	
	}
}
