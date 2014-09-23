/*
* Exerc¡cio 7.1a
* Java como programar 6a edicao - p. 237
*/
import javax.swing.JFrame;

public class TestaPainelEspiralQuadrada{
   
   public static void main(String[] args){
      
      PainelEspiralQuadrada painel = new PainelEspiralQuadrada();
      
      JFrame frame = new JFrame();
      frame.add(painel);
      frame.setSize(400,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setVisible(true);
      
      
   }  
   
   
}

