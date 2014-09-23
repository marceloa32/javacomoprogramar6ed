/**
* DeckOfCards
* Java Como Programar 6a edicao pp. 214-5
*/
import java.util.Random;

public class Baralho{
   
   private Carta baralho[];
   private int proximaCarta; //proxima carta a ser distribuida
   private final int NUMERO_DE_CARTAS = 52;
   private Random random;
   
   public Baralho(){
      
      String valores[] = { "As", "Dois", "Tres", "Quatro", "Cinco", "Seis", 
                           "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
      String naipes[] = { "Copas", "Ouros", "Paus", "Espadas" };
      
      baralho = new Carta[NUMERO_DE_CARTAS];
      proximaCarta = 0; //primeira carta a ser distribuida
      random = new Random();
      
      //prenche o baralho com distribuicao inicial
      for(int contador = 0; contador < baralho.length; contador++){
         baralho[contador] = new Carta( valores[contador % 13], naipes[contador / 13] );
      }
      
   }
   
   //embaralha as cartas
   public void embaralhar(){
      
      proximaCarta = 0; //reinicializa o proximaCarta

      //compara cada carta (carta1) com outra carta aleatoria (carta2)
      for(int carta1 = 0; carta1 < baralho.length; carta1++){
         
         //numero aleatorio entre 0 e 51 (52 cartas)
         int carta2 = random.nextInt(NUMERO_DE_CARTAS);
                                     
         //troca as duas de posi‡Æo                                     
         Carta temp = baralho[carta1];
         baralho[carta1] = baralho[carta2];
         baralho[carta2] = temp;
         
      }
      
   }   
   
   //distribui uma carta
   public Carta darCarta(){
      
      if(proximaCarta < baralho.length){
         return baralho[proximaCarta++];
      } else {
         return null; //nao tem mais carta
      }
   }
   
}
