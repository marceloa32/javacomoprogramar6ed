/**
* InitArray
* Java Como Programar 6a edicao p. 206-7
*/
public class IniciaVetor{
   
   public static void main(String[] args){
      
      int vetor[];   // declara o vetor identificado
      
      vetor = new int[10]; // cria o espa‡o para o vetor
      
      System.out.printf("%s%8s\n", "Indice", "Valor"); //titulos de coluna
      
      for(int contador = 1; contador < vetor.length; contador++){
         System.out.printf("%6d%8d\n", contador, vetor[contador] );
      }
   }  
   
   
}
