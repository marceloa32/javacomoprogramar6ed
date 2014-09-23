/*
* ShapesTest
* Java como programar 6a edicao - p. 152-3
*/
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestaFormas{
   
   public static void main(String args[]){
                                                   
      //leitura da opcao do usuario                                                   
      String entrada = JOptionPane.showInputDialog("Digite \n1 para desenhar retangulos \n2 para desenhar ovais");
      
      int escolha = Integer.parseInt(entrada);
      
      Formas painelFormas = new Formas(escolha);

      //para o painel funcionar: 
      JFrame frame = new JFrame(); //1 criar o frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //2 definir a forma de saida do frame
      frame.add(painelFormas); //3 adicionar o painel ao frame
      frame.setSize(300,300); //4 ajustar o tamanho do frame
      frame.setVisible(true); //5 mostrar o frame
      
   }
}
