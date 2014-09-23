/**
* Exercicio 6.33
* Java Como Programar 6a edicao p. 202
*/
import java.util.Random;
import java.util.Scanner;

public class AdivinharONumero{

   private int numero;   
   private int jogadas = 0;
   Scanner entradaSistema = null;
   Random random = null;
   
   
   public AdivinharONumero(){
      random = new Random();
      entradaSistema = new Scanner(System.in);
   }      
   
   
   public int mostrarPrompt(){      
      
      System.out.printf("\nInsira sua aposta (0 para sair):  ");
      int aposta = entradaSistema.nextInt();
      return aposta;
   }
   
   public void gerarNumero(){
      this.numero = 0;
      this.numero = random.nextInt(1000);
   }

   
   public boolean validarPalpite(int palpite){      

      jogadas++;      
      if(palpite > numero){
         System.out.printf("\nMuito alto. Tente de novo");
         return false;
      } else if (palpite < numero){
         System.out.printf("\nMuito baixo. Tente novamente");         
         return false;
      } else {
         System.out.printf("\nParabens! Voce adivinhou o numero!");
         validarAcerto();
         return true;
      }
   }   
   
   
   public void jogar(){      
      
      System.out.printf("Adivinhe um numero entre 1 e 1000\n");
      gerarNumero();
      int aposta;

      aposta = mostrarPrompt();
      while( aposta != 0 ){
         if(validarPalpite(aposta))
            break;
         else
            aposta = mostrarPrompt();
      }        
      
   }
   
   public void validarAcerto(){
      
      if(jogadas < 10){
         System.out.printf("\nVoce sabe o segredo ou tem muita sorte!\n");
      } else if (jogadas == 10){
         System.out.printf("\nAha! Voce sabe o segredo!\n");
      } else {
         System.out.printf("\nVoce e' capaz de fazer melhor...");
      }
      
   }
   
}