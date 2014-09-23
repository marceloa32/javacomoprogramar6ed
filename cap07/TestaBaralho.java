/**
* DeckOfCardsTest
* Java Como Programar 6a edicao pp. 216
*/
public class TestaBaralho{
   
   public static void main(String[] args){
      
      Baralho baralho = new Baralho();
      baralho.embaralhar();
       
      //tira todas as cartas do baralho, na ordem em que est∆o embaralhadas (sacou?)
      for(int i = 0; i < 13; i++){
         
         System.out.printf("%-20s%-20s%-20s%-20s\n", baralho.darCarta(), 
                                                     baralho.darCarta(),
                                                     baralho.darCarta(),
                                                     baralho.darCarta());
      }
      
   }
}
