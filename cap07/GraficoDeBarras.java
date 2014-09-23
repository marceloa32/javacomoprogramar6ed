/**
* BarChart
* Java Como Programar 6a edicao pp. 210
*/
public class GraficoDeBarras{
   
   public static void main(String[] args){
      
      int vetor[] = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
      
      System.out.printf("Distribuicao das notas:");
      
      //para cada item do vetor gera saida de uma barra
      for(int contador = 0; contador < vetor.length; contador++){
         
         //rotulo da barra: 00-09, 10-19, ..., 90-99, 100
         if(contador == 10){
            System.out.printf("%5d:", 100);
         } else {
            System.out.printf("%02d-%02d:", contador * 10, contador * 10 + 9);
         }
         
         //imprime a barra de asteriscos
         for(int asteriscos = 0; asteriscos < vetor[contador]; asteriscos++){
            System.out.printf("*");
         }
         
         //pula uma linha para proximo intervalo de notas
         System.out.println();
      }
   }   
   
}