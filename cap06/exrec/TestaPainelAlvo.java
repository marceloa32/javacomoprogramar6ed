/*
* Exerc¡cio 6.1 
* Java como programar 6a edicao - p. 188
*/
import javax.swing.JFrame;

public class TestaPainelAlvo{
   
   public static void main(String[] args){
            
      JFrame frame = new JFrame();            
      PainelAlvo painel = new PainelAlvo();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      frame.setSize(300,300);
      frame.add(painel);
      frame.setVisible(true);
   }
}