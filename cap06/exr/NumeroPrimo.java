/*
* Exercicio 6.24
* Java Como Programar 6a edicao p. 201
*/
public class NumeroPrimo{
   
   public boolean isPrimo(int numero){
      
      int divisores = 0; //divisores do numero, alem do 1 e dele mesmo
      int limite = numero / 2;
      int i = 0;
       
      while(divisores == 0 && i <= limite){
         
         for(i = 2; (i <= limite) ; i++){
      
            //System.out.printf("------------> %d | %d | %d | %d\n", i, limite, divisores, numero);         
            if(numero % i == 0){
               divisores++;
            }
            
         }
         
      }
      
      return (divisores == 0);        
      
   }   
   
   
   public boolean isPrimo2(int numero){
      
      int divisores = 0; //divisores do numero, alem do 1 e dele mesmo
      int limite = (int) Math.sqrt(numero);
      int i = 0;
       
      while(divisores == 0 && i <= limite){
         
         for(i = 2; (i <= limite) ; i++){
      
            //System.out.printf("------------> %d | %d | %d | %d\n", i, limite, divisores, numero);         
            if(numero % i == 0){
               divisores++;
            }
            
         }
         
      }
      
      return (divisores == 0);        
      
   }   
   
   
}