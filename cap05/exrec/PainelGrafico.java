/*
* Exerc¡cio 5.2 (estudo de caso GUI)
* Java como programar 6a edicao - p. 153
*/
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelGrafico extends JPanel{
   
   private int valor;
   
   public PainelGrafico(int valor){
      this.valor=valor;
   }

   public void paintComponent(Graphics g){
      
      super.paintComponent(g);
      
      int tam = this.getWidth() / 30;
      
      //g.drawRect(10, 10, 10 + tam * valor, 10);
      int tamant = 10;
      for(int i =1; i<= valor; i++){
         g.drawRect(tamant, 10 , tam, 10);
         tamant += tam;
      }
      
   }   
   
   
}
