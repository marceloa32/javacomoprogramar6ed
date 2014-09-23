/**
* InitArray
* Java Como Programar 6a edicao p. 208
*/
public class IniciaVetor3{
   
   public static void main(String[] args){
      
      final int TAMANHO_VETOR = 10; //constante
      int vetor[] = new int[TAMANHO_VETOR];
      
      //calcula o valor de cada elemento do vetor
      for(int contador = 0; contador < vetor.length; contador++){
         vetor[contador] = 2 + 2 * contador;
      }
      
      //cabecalho da saida
      System.out.printf("%s%8s\n", "Indice", "Valor");
      
      //gera a saida 
      for(int contador = 0; contador < vetor.length; contador++){
         System.out.printf("%5d%8d\n", contador, vetor[contador]);
      }
      
   }
   
}
