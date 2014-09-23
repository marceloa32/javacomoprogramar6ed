/*
* Exercicio 6.24
* Java Como Programar 6a edicao p. 201
*/
public class NumeroPerfeito{
   
   public void perfeito(int numero){
      
      int fator = 1;
      int limite = numero / 2;      
      int somaFatores = 0;
      String fatores = "";
      
      while (fator <= limite){
         
         if(numero % fator == 0){
            
            somaFatores += fator;
            
            if(fator == limite){
               fatores += "" + fator + " = ";
            } else {
               fatores += "" + fator + " + ";
            }

         }
         
         fator++;
      }
      
      if(somaFatores == numero){
         System.out.printf("%d e' um numero perfeito\n", numero);
         System.out.printf("fatores: %s %d\n", fatores, somaFatores);
         
      } else {
         //System.out.printf("\b\b\b\b\b\b\b\b\b\b\b");
         //System.out.printf("%d", numero);
      }      
      
   }   
   
   public void perfeito2(int numero){
      
      int fator = 1;
      int limite = numero / 2;      
      int somaFatores = 0;
      String fatores = "";
      boolean saiu = false;
      
      while (fator <= limite){
         
         if(numero % fator == 0){
            
            somaFatores += fator;
            
            if(fator == limite){
               fatores += "" + fator + " = ";
            } else {
               fatores += "" + fator + " + ";
            }

         }
         
         if(somaFatores > numero){
            saiu = true;
            break;
         }
         
         fator++;
      }
      
      //System.out.println(numero);
      if(!saiu){
         if(somaFatores == numero){
            System.out.printf("%d e' um numero perfeito\n", numero);
            System.out.printf("fatores: %s %d\n", fatores, somaFatores);
            
         } else {
            //System.out.printf("\b\b\b\b\b\b\b\b\b\b\b");
            //System.out.printf("%d", numero);
         }      
      }
      
   }   
   
   
}
