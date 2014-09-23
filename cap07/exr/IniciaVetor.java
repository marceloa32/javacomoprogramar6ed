/**
* Exerc¡cio 7.15 (com base no InitArray - IniciaVetor.java)
* Java Como Programar 6a edicao p. 246
*/
public class IniciaVetor{
   
   public static void main(String args[]){
      
      final int TAMANHO_DO_VETOR;
      if(args.length > 0){
         TAMANHO_DO_VETOR = Integer.parseInt(args[0]);
      } else {
         TAMANHO_DO_VETOR = 10;
      }
         
      int vetor[] = new int[TAMANHO_DO_VETOR];
      
      System.out.printf("%s%8s\n", "Indice", "Vetor");
      
      for(int i = 0; i < vetor.length; i++){      
         System.out.printf("%6d%8d\n", i, vetor[i]);
         
      }
      
   }
   
}
