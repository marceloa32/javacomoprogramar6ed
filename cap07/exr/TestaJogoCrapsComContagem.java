/*
* Exerc¡cio 7.18 com base no CrapsTest p. 180
* Java como programar 6a edicao - p. 247
*/
public class TestaJogoCrapsComContagem{
   
   public static void main(String[] args){
      
      JogoCrapsComContagem jogo = new JogoCrapsComContagem();
      
      int[][] estatistica = new int[22][3];
                                                
      //zera o vetor                                                
      for(int i = 0; i < estatistica.length; i++){
         for(int j = 0; j < estatistica[i].length; j++){
            estatistica[i][j] = 0;
         }
      }

      for(int i = 1; i <= 1000; i++){         
         jogo.jogar();               
            
         int pos = 0;            
         if(jogo.getJogadas() > 20){
            pos = 21;            
         } else {
            pos = jogo.getJogadas();
         }
         
         ++estatistica[pos][0];
         if(jogo.jogadorVenceu()){
            ++estatistica[pos][1];
         } else {
            ++estatistica[pos][2];
         }
      }
      
      int vitorias = 0;
      
      for(int i = 1; i < estatistica.length; i++){
         if(i == 21){            
            System.out.printf("Depois da 20: ");
            System.out.printf("\tVitorias : %d", estatistica[21][1]);
            System.out.printf("\tDerrotas : %d\n", estatistica[21][2]);
         } else {
            System.out.printf("Rolagem %d: ", i);
            System.out.printf("\tVitorias : %d", estatistica[i][1]);
            System.out.printf("\tDerrotas : %d\n", estatistica[i][2]);
         }
         vitorias += estatistica[i][1];         
      }

      float perc = (vitorias/1000)*100;      
      System.out.printf("Vitorias: %d - Percentual %.2f\n", vitorias, perc);
      
   }     
   
}

