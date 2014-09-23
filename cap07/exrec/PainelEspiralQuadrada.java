/*
* Exerc¡cio 7.1a
* Java como programar 6a edicao - p. 237
*/
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelEspiralQuadrada extends JPanel{
   
   public void paintComponent(Graphics g){

      super.paintComponent(g);
      
      
      int direcao = 2;   //1 - horizontal, 2 vertical
      int sentido = 2;   //horizontal: 1 direita, 2 esquerda; vertical: 1 cima, 2 baixo
      
      int traco = 0; //contador de tracos
      
      //fixo para teste
      int largura = 1; 
      
      int x1 = 0;
      int y1 = 0;
      int x2 = this.getWidth() / 2;
      int y2 = this.getHeight() / 2;
      int tamanho = this.getWidth() / 10;      
      int pedaco = tamanho /2;
      int tam = 0;

      /*
      ordem: baixo, esquerda, cima, direita ( 2-2, 1-2, 2-1, 1-1)
      */                  
      while ( tamanho <= this.getWidth() ){
                         
         //System.out.printf("%d %d %d %d\n", posX, posY, largura, tamanho);
         //System.out.printf("--> traco %d|direcao: %s|sentido: %d|tamanho: %d\n", traco+1, (direcao ==1)? "horizontal" : "vertical", sentido, tamanho);
         
         if(direcao == 1){             //horizontal                      
            
            if (sentido == 1){ //direita
             
               x1 = x2;
               y1 = y2;
               x2 = x1 + tamanho;
               y2 = y1;

               //direcao e sentido do proximo               
               direcao = 2;   //vertical
               sentido = 2;   //baixo
               
            } else { //esquerda
                          
               x1 = x2 - tamanho;
               y1 = y2;
               x2 = x1;
               y2 = y1;
               
               //direcao e sentido do proximo
               direcao = 2;   //vertical
               sentido = 1;   //cima
            }
            
            largura = tamanho;
            tam = 1;
            
            
         } else if (direcao == 2){  //vertical
            
            if (sentido == 1){ //cima
               
               x1 = x2;
               y1 = y2 - tamanho;
               x2 = x1;
               y2 = y1;               
               
               //direcao e sentido do proximo
               direcao = 1;   //horizontal
               sentido = 1;   //direita
               
            } else { //baixo               
               
               x1 = x2;
               y1 = y2;
               x2 = x1;               
               y2 = y1 + tamanho;
               
               //direcao e sentido do proximo
               direcao = 1;   //horizontal
               sentido = 2;   //esquerda
            }
            
            largura = 1;
            tam = tamanho;
            
         }

         g.drawRect(x1, y1, largura, tam);                  
         //System.out.printf("x1:%d y1:%d x2:%d y2:%d\n", x1, y1, x2, y2);
         
         traco++;         
         if(traco % 2 == 0){            
            tamanho += pedaco;
            //tamanho *= 2;
         }                         
         
         
      }   
      
      
   }

}
