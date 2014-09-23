/**
* DrawRainbow
* Java Como Programar 6a edicao pp. 235
*/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelArcoIris extends JPanel{
   
   final Color VIOLETA = new Color(128, 0, 128);
   final Color INDIGO  = new Color( 75, 0, 130);
   
   private Color cores[] = {Color.WHITE,
                            Color.WHITE,
                            VIOLETA,
                            INDIGO,
                            Color.BLUE,
                            Color.GREEN,
                            Color.YELLOW,
                            Color.ORANGE,
                            Color.RED};

   //construtor
   public PainelArcoIris(){
      
      setBackground(Color.WHITE);      
      
   }
   
   //paintcomponent - metodo para usar o Panel
   public void paintComponent(Graphics g){
      
      super.paintComponent(g);
      
      int raio = 20;
      
      int centroX = getWidth() / 2;
      int centroY = getHeight() - 10;

      for(int contador = cores.length; contador > 0; contador--){
         
         g.setColor( cores[contador - 1] );
         
         g.fillArc( centroX - contador * raio,     //retangulo delimitador
                    centroY - contador * raio,     //retangulo delimitador
                    contador * raio * 2,           //retangulo delimitador
                    contador * raio * 2,           //retangulo delimitador
                    0,                             //angulo inicial. zero grau … direita
                    180);                          //angulo a varrer. varredura positiva = arco anti-horario
      }
      
      
   }
   
   
}
