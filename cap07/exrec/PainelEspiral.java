/*
* Exerc¡cio 7.1b
* Java como programar 6a edicao - p. 237
*/
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelEspiral extends JPanel{
   
   public void paintComponent(Graphics g){

      super.paintComponent(g);
      
      //fixo para teste      
      int tamanho = this.getWidth()/10;      
      int pedaco = tamanho/2;
      int traco = 1; //contador de tracos            
      int x1 = this.getWidth()/2;
      int y1 = this.getHeight()/2;         
      int x2 = x1 - tamanho/2;
      int y2 = x1 - tamanho/2 - tamanho/4;
      int graus = 0;
      int grauini = 0;
      
      while ( tamanho <= this.getWidth() ){
         
         if (traco %2 == 0){     // par: para cima

            x1 = x2 - tamanho;
            y1 = y2 - (tamanho / 2);
            x2 = x1 + tamanho;
            y2 = y1 + (tamanho / 2);

            grauini = 0;
            graus = -180;
  
         
         } else { // impar: para baixo

            x1 = x1;
            y1 = y2 - (tamanho / 2);
            x2 = x1 + tamanho;
            y2 = y1 + (tamanho /2 );                   
                 
            grauini = 0;
            graus = 180;                 
         
         }
        
        //System.out.printf("%d|x1:%d|y1:%d|x2:%d|y2:%d|tamanho:%d\n", traco, x1, y1, x2, y2, tamanho); 
         g.drawArc(x1, y1, tamanho, tamanho, grauini, graus);                  
         
         tamanho+=pedaco;                  
         traco++;                  
         
         
      }   
      
      
   }

}
