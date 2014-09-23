/**
* PassArray
* Java Como Programar 6a edicao pp. 218-9
*/
public class ParametroVetor{
   
   public static void main(String[] args){
      
      int vetor[] = { 1, 2, 3, 4, 5};
      
      System.out.println("Efeitos da passagem da referencia do vetor:\n" +
                         "Os valores do vetor original sao: ");
                         
      for(int valor : vetor){
         System.out.printf("   %d", valor);
      }
      
      modificarVetor(vetor);
      System.out.println("\n\nOs valores do vetor modificado sao: ");
      
      for(int valor : vetor){
         System.out.printf("   %d", valor);
      }      
      
      System.out.printf("\n\nEfeitos da passagem do valor de um elemento do vetor:\n" + 
                        "vetor[3] antes de modificarElemento: %d\n", vetor[3]);
                        
      modificarElemento(vetor[3]);  //tenta modificar o vetor[3]
      
      System.out.printf("vetor[3] depois de modificarElemento: %d\n", vetor[3]);
      
   }
   
   public static void modificarVetor(int vetor2[]){
      
      for(int contador = 0; contador < vetor2.length; contador++){
         vetor2[contador] *= 2;
      }
   }
   
   public static void modificarElemento(int elemento){
      elemento *= 2;
      System.out.printf("Valor do elemento em modificarElemento: %d\n", elemento);
   }
   
}
