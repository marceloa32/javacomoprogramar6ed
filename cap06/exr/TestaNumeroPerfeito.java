/*
* Exercicio 6.24
* Java Como Programar 6a edicao p. 201
*/
public class TestaNumeroPerfeito{
   
   public static void main(String[] args){
      
      NumeroPerfeito np = new NumeroPerfeito();
      
      for(int i = 1; i <= 100000000; i++){
         //np.perfeito(i);
         np.perfeito2(i);
      }
      
   }
   
}
