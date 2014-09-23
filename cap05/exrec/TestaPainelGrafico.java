/*
* Exerc¡cio 5.2 (estudo de caso GUI)
* Java como programar 6a edicao - p. 153
*/
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestaPainelGrafico{
   
   public static void main(String[] args){
      
      String entrada = JOptionPane.showInputDialog("Digite um valor de 1 a 30 para exibir o grafico: ");
      
      int valor = Integer.parseInt(entrada);
      
      if(valor < 1 || valor > 30){
         
         System.out.println("valor invalido");
      
      } else {
         
         PainelGrafico painel = new PainelGrafico(valor);
         
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(painel);
         frame.setSize(300, 300);
         frame.setVisible(true);
         
         
      }
      
   }
   
}