/*
* InitArray
* Java como programar 6a edicao - p. 225-6
*/
public class VetorBidimensional{
                               
   public static void main(String args[]){
      
      int vetor1[][] = { {1, 2, 3}, {4, 5, 6} };
      int vetor2[][] = { {1, 2}, {3}, {4, 5, 6} };
      
      System.out.println("Valores do vetor 1, por linha: ");
      mostrarVetor(vetor1);
      
      System.out.println("\nValores do vetor 2, por linha: ");
      mostrarVetor(vetor2);      
      
   }                               
   
   public static void mostrarVetor(int vetor[][]){
      
      for(int linha = 0; linha < vetor.length; linha++){
         
         for(int coluna = 0; coluna < vetor[linha].length; coluna++){
            System.out.printf("%d ", vetor[linha][coluna]);
         }
         
         System.out.println();
      }
   }
   
}