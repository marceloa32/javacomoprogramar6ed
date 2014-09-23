/*
* Exerc¡cio 7.19
* Java como programar 6a edicao - p. 246
*/ 
import java.util.Scanner;

public class ReservaPassagem{   

   boolean assentos[];
   Scanner entradaTeclado;
   
   public ReservaPassagem(){
      assentos = new boolean[10]; //1 a 5: primeira classe [0-4]; 6 a 10: classe economica [5-9]
      entradaTeclado = new Scanner(System.in);      
   }
   
   public void reservar(){
      
      while(temAssentosDisponiveis()){
               
         int opcao = selecionarOpcao();
         
         if (opcao == -1){
            // sair
         } else {
            
            if(opcao == 1){ //primeira classe
               
               if(temAssentoDisponivelPrimeiraClasse()){
                  reservaAssentoPrimeiraClasse();
               }else{
                  if(temAssentoDisponivelClasseEconomica() && solicitarTrocaDeClasse()){
                     reservaAssentoClasseEconomica();
                  } else {
                     System.out.printf("Proximo voo parte em 3 horas\n");
                  }
               }
                     
            } else { //classe economica
               
               if(temAssentoDisponivelClasseEconomica()){
                  reservaAssentoClasseEconomica();
               } else {
                  if(temAssentoDisponivelPrimeiraClasse() && solicitarTrocaDeClasse()){
                     reservaAssentoPrimeiraClasse();                  
                  } else {
                     System.out.printf("Proximo voo parte em 3 horas\n");
                  }
               }
                  
            }
            
            desenhaAviao();
            
         }     
      }
      
   }
   
   private boolean solicitarTrocaDeClasse(){
      
      int opcao = 0;
      System.out.printf("Os assentos desta classe ja estao ocupados. Deseja ser alocado em outra classe? (1 Sim, 2 Nao): ");
      
      opcao = entradaTeclado.nextInt();
      
      while(opcao < 1 && opcao > 2){
         System.out.printf("Opcao invalida\n");
         System.out.printf("Deseja ser alocado em outra classe? (1 Sim, 2 Nao): ");
         opcao = entradaTeclado.nextInt();
      }
      
      return (opcao == 1);
   }
   
   private boolean temAssentoDisponivelPrimeiraClasse(){
      
      boolean tem = false;      
      
      for(int i = 0; i <= 4; i++){
         tem = (tem || !assentos[i]);
      }       

      return tem;      
   }
   
   private boolean temAssentoDisponivelClasseEconomica(){
      
      boolean tem = false;      
      
      for(int i = 5; i <= 9; i++){
         tem = (tem || !assentos[i]);
      }       

      return tem;      
   }   
   
   private void reservaAssentoPrimeiraClasse(){

      int assento = -1;
            
      for(int i = 0; i <= 4; i++){
         if(!assentos[i]){
            assento = i;
            assentos[i] = true;
            break;
         }
      } 
                  
      assento+=1;                  
      System.out.printf("Assento reservado na Primeira Classe. Poltrona no. %d\n", assento);
   }
   
   private void reservaAssentoClasseEconomica(){

      int assento = -1;
            
      for(int i = 5; i <= 9; i++){
         if(!assentos[i]){
            assento = i;
            assentos[i] = true;
            break;
         }
      } 
                  
      assento+=1;                  
      System.out.printf("Assento reservado na Classe Economica. Poltrona no. %d\n", assento);
   }
   
   private int selecionarOpcao(){
                   
      int opcao = 0;
                         
      System.out.printf("Por favor digite 1 para Primeira Classe e 2 para Classe Economica: ");
      opcao = entradaTeclado.nextInt();
      
      while(opcao < 0 || opcao > 2){
         System.out.printf("Opcao invalida\n");
         System.out.printf("Por favor digite 1 para Primeira Classe e 2 para Classe Economica: ");
         opcao = entradaTeclado.nextInt();
      }

      return opcao;      
      
   }   
   
   private boolean temAssentosDisponiveis(){
      boolean tem = false;
      
      for(int i = 0; i < assentos.length; i++){
         if(!assentos[i]){
            tem = true;
            break;
         }
      }      
      
      return tem;
   }
   
   
   private void desenhaAviao(){
      
      System.out.printf("   |2%s |4%s ||  |6%s |8%s  \n", (assentos[1]?"V":"-"),(assentos[3]?"V":"-"), (assentos[5]?"V":"-"), (assentos[7]?"V":"-"));
      System.out.printf("|1%s        ||      |9%s  \n", (assentos[0]?"V":"-"),(assentos[8]?"V":"-"));
      System.out.printf("   |3%s |5%s ||  |7%s |10%s \n", (assentos[2]?"V":"-"),(assentos[4]?"V":"-"), (assentos[6]?"V":"-"), (assentos[9]?"V":"-"));
   }
   
}
