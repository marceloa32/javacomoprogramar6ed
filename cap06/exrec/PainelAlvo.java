/*
* Exerc¡cio 6.1 
* Java como programar 6a edicao - p. 188
*/
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelAlvo extends JPanel{
   
   public void paintComponent(Graphics g){
      
      super.paintComponent(g);
      
      Random random = new Random();

      int centroX = getWidth()/2;
      int centroY = getHeight()/2;
      int raio = 20;
      
      int quantos = 5;
      Color cor1 = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
      Color cor2 = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));      
      
      System.out.println(quantos+"|"+raio);      
      for(int i = quantos; i>=1; i--){
         if(i%2==0){
            g.setColor(cor1);                  
         } else {
            g.setColor(cor2);
         }
         g.fillOval(centroX-raio*i, centroY-raio*i, raio*2*i, raio*2*i);
      }
            
      
   }
}