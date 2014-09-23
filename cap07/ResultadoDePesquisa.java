/**
* StudentPoll
* Java Como Programar 6a edicao pp. 212
*/
public class ResultadoDePesquisa{
   
   public static void main(String[] args){
      
      int respostas[] = {1, 2, 6, 4, 8,  5, 9, 7, 8, 10, 
                         1, 6, 3, 8, 6, 10, 3, 8, 2,  7, 
                         6, 5, 7, 6, 8,  6, 7, 5, 6,  6, 
                         5, 6, 7, 5, 6,  4, 8, 6, 8, 10};
      int frequencia[] = new int[11]; //sao 10 frequencias, com o indice 0 nao utilizado
      
      for(int resposta = 0; resposta < respostas.length; resposta++){
         ++frequencia[ respostas[resposta] ];
      }
      
      System.out.printf("%s%10s\n", "Nota  ", "Frequencia");
      
      for(int nota = 1; nota < frequencia.length; nota++){
         System.out.printf("%6d%10d\n", nota, frequencia[nota] );
      }
      
   }
   
}
