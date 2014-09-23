/**
* SumArray
* Java Como Programar 6a edicao pp. 209-210
*/
public class SomaVetor{
   
   public static void main(String[] args){
      
      int vetor[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
      int total = 0;
      
      //adiciona o valor de cada item ao total
      for(int contador = 0; contador < vetor.length; contador++){
         total += vetor[contador];
      }
      
      System.out.printf("Total dos elementos do vetor: %d\n", total);
   }
}
