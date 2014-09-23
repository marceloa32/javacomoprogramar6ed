/*
* Exerc¡cios 5.17
* Java como programar 6a edicao - p. 162
*/
import java.util.Scanner;

public class TotalVenda{

   public static void main(String[] args){
      
      Scanner entradaTeclado = new Scanner(System.in);
      int codigo;
      int quantidade;   
      double total = 0;      
      
      System.out.printf("Codigo do produto (-1 p/ sair): ");
      codigo = entradaTeclado.nextInt();
      
      //System.out.printf("Quantidade ...................: \n");
      //quantidade = entradaTeclado.nextInt();
      
      while (codigo != -1){      

         
         System.out.printf("Quantidade ...................: ");
         quantidade = entradaTeclado.nextInt();    
                  
         if(codigo < 1 || codigo > 5){
            System.out.println("Produto invalido");
         }
         
         switch(codigo){
            
            case 1:
               total += quantidade * 2.98;
            break;
               
            case 2:
               total += quantidade * 4.50;
            break;               
               
            case 3:
               total += quantidade * 9.98;
            break;                              
            
            case 4:
               total += quantidade * 4.49;
            break;                              
            
            case 5:
               total += quantidade * 6.87;
            break;                                                      
         }
         
         System.out.printf("Codigo do produto (-1 p/ sair): ");
         codigo = entradaTeclado.nextInt();     
         
      }
      
      System.out.printf("\nValor total: %.2f", total);
      
      
      
   }   
   
}
