/*
* Exerc¡cio 5.1
* Java como programar 6a edicao - p. 153
*/
import javax.swing.JFrame;

public class TestaCirculosCentralizados{
   
   
   public static void main(String[] args){
      
      CirculosCentralizados painel = new CirculosCentralizados();
      
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(painel);
      frame.setSize(316,338);
      frame.setVisible(true);
      
   }   
   
}