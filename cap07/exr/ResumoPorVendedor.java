/*
* Exerc¡cio 7.0
* Java como programar 6a edicao - p. 246
*/ 
import java.util.Scanner;

public class ResumoPorVendedor{
   
   public static void main(String[] args){
      
      int resumo[] = new int[10];
      
      double valorVendido = 0.0;
      double valorComissao = 0.0;
      Scanner entradaTeclado = new Scanner(System.in);
      
      System.out.printf("Digite o valor vendido: R$ ");
      valorVendido = entradaTeclado.nextDouble();
      
      valorComissao = 200 + (valorVendido *.09);
      
      System.out.printf("Valor da comissao: R$ %.2f\n\n", valorComissao);
                                
      int posicao = (int)valorComissao / 100;
      
      if(posicao > 10){
         posicao = 10; 
      }
      resumo[posicao-1] += 1;

      //imprimir no formato R$ 200-299 e sem estes: 000-099  e 100-199      
      System.out.printf("Resumo\n");
      for(int i = 1; i < resumo.length; i++){         

         String texto = ((i+1)*100) + "-" + ((i+2)*100-1);
         if(i == 9){
            texto = "1000 e acima";
         }
         
         System.out.printf("R$ %-15s: ", texto);
         System.out.printf("%d", resumo[i]);
         System.out.println();
         
         
      }
      
   }
   
}
