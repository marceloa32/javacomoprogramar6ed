/*
* Exercicio 6.21
* Java Como Programar 6a edicao p. 201
*/
public class Digitos{
 
   public void mostrarDigitos(int numero){
      
      int aux = 0;
      int q = 0;
      int r = numero;
      
      for(int i = 4; i >= 0; i--){

         aux = ((int) Math.pow(10, i));                  
         
         q = numero / aux;                  
         r = numero - (q * aux);              
         
         if (q > 0 && (r != numero) ){            
         
            //System.out.println("------>" + i + "|aux:" + aux + "|q:" + q + "|r:" + r);    
            System.out.printf("%d  ", q);
                    
         }
         
         numero = r; 
         
      }      
      
   } 
   
}
