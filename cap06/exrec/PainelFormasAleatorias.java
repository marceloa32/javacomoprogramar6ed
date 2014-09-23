/*
* Exerc¡cio 6.2
* Java como programar 6a edicao - p. 188
*/
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class PainelFormasAleatorias extends JPanel{
   
   public void paintComponent(Graphics g){
      
      super.paintComponent(g);
         
      Random random = new Random();
      
      int qual;
      int altura, largura;
      int posx, posy;
      
      int maxAltura = getHeight()/2;
      int maxLargura = getWidth()/2;                 
      
      for(int i = 1; i<=10; i++){
         
         qual = random.nextInt(2); //0 ou 1
         altura = 1 + random.nextInt(maxAltura); //1 ate maximo
         largura = 1 + random.nextInt(maxLargura); 

         posy = 1 + random.nextInt(getWidth());
         posx = 1 + random.nextInt(getHeight());
         
         g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));         
         
         if (qual == 0)            
            g.fillOval(posx, posy, largura, altura);
         else 
            g.fillRect(posx, posy, largura, altura);                  
         
      }
      
   }
   
}
