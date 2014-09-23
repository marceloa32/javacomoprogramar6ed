/*
* Exerc¡cio 6.2
* Java como programar 6a edicao - p. 188
*/
import javax.swing.JFrame;

public class TestaPainelFormasAleatorias{
   
   public static void main(String[] args){
            
      JFrame frame = new JFrame();            
      PainelFormasAleatorias painel = new PainelFormasAleatorias();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      frame.setSize(300,300);
      frame.add(painel);
      frame.setVisible(true);
   }
}