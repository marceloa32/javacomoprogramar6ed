/**
* DrawRainbowTest
* Java Como Programar 6a edicao pp. 236
*/
import javax.swing.JFrame;

public class TestaPainelArcoIris{
   
   public static void main(String[] args){
      
      PainelArcoIris painel = new PainelArcoIris();

      JFrame frame = new JFrame();

      frame.add(painel);      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setSize(400,250);
      frame.setVisible(true);      
      
   }   
   
}