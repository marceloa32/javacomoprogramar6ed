/*
* Exerc¡cio 5.1 
* Java como programar 6a edicao - p. 153
*/
import java.awt.Graphics;
import javax.swing.JPanel;

public class CirculosCentralizados extends JPanel{
   
   public void paintComponent(Graphics g){
      
      super.paintComponent(g);
      
      int centroX, centroY;
      centroX = getWidth()/2;     
      centroY = getHeight()/2;
      
      //int raio = centroX/15; 
      int raio = 10; 
      
      int tam = raio;       

      //doze circulos
      for(int i = 1; i<=12; i++){                           
         g.drawOval(centroX-i*raio, centroY-i*raio, 2*raio*i, 2*raio*i);                  
                  
      }
      
   }
   
}