/**
* InitArray
* Java Como Programar 6a edicao p. 207-8
*/
public class IniciaVetor2{
   
   public static void main(String[] args){
      
      //lista de inicializadores
      int vetor[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
      
      System.out.printf("%s%8s\n", "Indice", "Valor");   //titulos das colunas
      
      for(int contador = 0; contador < vetor.length; contador++){
         System.out.printf("%6d%8d\n", contador, vetor[contador]);
      }
   }
   
}