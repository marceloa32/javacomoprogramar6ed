/*
* Exerc¡cio 7.1b
* Java como programar 6a edicao - p. 237
*/
import javax.swing.JFrame;

public class TestaPainelEspiral{
   
   public static void main(String[] args){
      
      PainelEspiral painel = new PainelEspiral();
      
      JFrame frame = new JFrame();
      frame.add(painel);
      frame.setSize(416,438);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setVisible(true);
      
      
   }  
   
   
}

