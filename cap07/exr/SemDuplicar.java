/*
* Exerc¡cio 7.12
* Java como programar 6a edicao - p. 246
*/ 
import java.util.Scanner;

public class SemDuplicar{
   
   int[] numeros = new int[5];
   
   
   public SemDuplicar(){
      for (int i = 0; i < numeros.length; i++){
         numeros[i] = -1;
      }
   }
      
   public void lerNumeros(){
      
      Scanner entradaTeclado = new Scanner(System.in);      
      int numero;
      int num = 1;
      
      System.out.printf("Digite 5 numeros inteiros seguidos de enter\n");
      
      while(num <= 5){
         System.out.printf("\nNumero %d: ", num);
         numero = entradaTeclado.nextInt();
         
         if(isValido(numero)){
            if(!estaDuplicado(numero)){
               inserirNumero(numero);
               mostrarNumeros();               
               num++;
            } else {
               System.out.printf("Numero ja existe no vetor\n");               
            }
         } else {
            System.out.printf("Numero invalido. Digite um valor entre 0 e 100\n");
         }
      }
      
   }
   
   private boolean isValido(int numero){
      return (numero >= 10 && numero <= 100);
   }  
   
   private void inserirNumero(int numero){
      for(int i = 0; i < numeros.length; i++){
         if( numeros[i] == -1){
            numeros[i] = numero;
            break;
         }
      }
   }
   
   
   private boolean estaDuplicado(int numero){
      for(int i = 0; i < numeros.length; i++){
         if(numeros[i] == numero){
            return true;
         }
      }      
      return false;
   }
   
   private void mostrarNumeros(){
      for(int i = 0; i < numeros.length; i++){
         if(numeros[i] > -1){
            System.out.printf("%d\t", numeros[i]);
         }
      }
   }
   
}
