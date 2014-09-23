/*
* Exerc¡cio 7.20
* Java como programar 6a edicao - p. 247
*/ 
import java.util.Scanner;

public class ControleDeVendas{

   private double vendas[][] = new double[5][4]; //linha: produto; coluna: vendedor
   Scanner entradaTeclado;   

   
   public ControleDeVendas(){
      entradaTeclado = new Scanner(System.in);
   }   
   
   
   public void controlarVendas(){

      System.out.printf("VENDAS DO MES\n\n");
      
      int vendedor = -1;
      int produto = -1;
      double valor = -1;

      
      for(int j = 1; j <= 4; j++){     //Vendedor
            
         System.out.printf("\tVendedor: %d\n", j);
            
         for(int k = 1; k <= 5; k++){  //Produto
            
            System.out.printf("\t\tProduto: %d\n", k);
            
            do {
               System.out.printf("\t\t\tValor ...R$ : ");
               valor = entradaTeclado.nextDouble();
               if(valor >= 0){
                  vendas[k-1][j-1] += valor;
               } else {                  
                  System.out.printf("> Valor invalido");
               }               
            } while (valor < 0);
            
         } 
      }

      exibirValores();      
      
   }

   public void controlarVendasDigitadas(){      
      
      System.out.printf("VENDAS DO MES\n\n");
      
      int vendedor, produto;
      double valor;
      
      System.out.printf("Informe o vendedor (1 a 4, 0 para sair): ");
      vendedor = entradaTeclado.nextInt();
      
      while(vendedor != 0){
         
         if(vendedor >= 1 && vendedor <= 4){
            
            System.out.printf("Informe o produto (1 a 5, 0 para voltar): ");
            produto = entradaTeclado.nextInt();
                          
            while(produto != 0){
            
               if(produto >= 1 && produto <= 5){
                  
                  System.out.printf("Valor vendido: R$ ");
                  valor = entradaTeclado.nextDouble();                  
               
                  while(valor < 0){
                     System.out.printf("> Valor invalido. Digite um valor maior que zero\n");
                     System.out.printf("Valor vendido: R$ ");
                     valor = entradaTeclado.nextDouble();                                    
                  }
   
                  vendas[produto-1][vendedor-1] = valor;               
                  
               } else {
                  System.out.printf("> Produto invalido\n");
               }                  
               
               System.out.printf("Informe o produto (1 a 5, 0 para voltar): ");
               produto = entradaTeclado.nextInt();
               
            }            
            
         } else {
            System.out.printf("> Vendedor invalido\n");
         }
         
         System.out.printf("Informe o vendedor (1 a 4, 0 para sair): ");
         vendedor = entradaTeclado.nextInt();
                  
      }    
      
      exibirValores();
      
   }
         
   public void exibirValores(){

      double totalVendedor[] = new double[5];
            
      for(int i = 0; i < vendas.length; i++){ //linhas - produtos

         //cabecalhos de coluna
         if(i == 0){
            System.out.printf("%-12s%12s%12s%12s%12s%12s\n", "Produto", "Vendedor 1", "Vendedor 2", "Vendedor 3", "Vendedor 4", "Total");
         }

         double totalProduto = 0;         
         
         for(int j = 0; j < vendas[i].length; j++){ //colunas - vendedores
          
            //cabecalhos de linha
            if(j == 0){               
               System.out.printf("%-12d", (i+1) );               
            }
            System.out.printf("%12.2f", vendas[i][j]);
            
            totalProduto += vendas[i][j];
            totalVendedor[j] += vendas[i][j];
         }

         totalVendedor[4] += totalProduto;
         System.out.printf("%12.2f\n", totalProduto);
      }      

         
      for(int i = 0; i < totalVendedor.length; i++){
         if(i == 0){
            System.out.printf("%-12s","Total");
         }
         System.out.printf("%12.2f", totalVendedor[i]);         
      }   
      
   }   
}