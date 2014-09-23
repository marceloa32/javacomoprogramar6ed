/**
* EnhancedForTest
* Java Como Programar 6a edicao pp. 217
*/
public class TestaForAprimorado{
   
   public static void main(String args[]){
      
      int vetor[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
      int total = 0;
      

      for(int numero : vetor){
         total += numero;
      }      
      
      System.out.printf("Total dos elementos do vetor: %d\n", total);
               
      
   }
   
}
