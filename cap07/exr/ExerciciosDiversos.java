/*
* Exercicio 7.9
* Java como programar 6a edicao - p. 246
*/
import java.util.Scanner;

public class ExerciciosDiversos{
   
   public static void main(String[] args){
                                
      //7.9 a                                
      int t[][] = new int[2][3];
      
      //7.9 i
      for(int i = 0; i < t.length; i++){
         for(int j = 0; j < t[i].length; j++){
            t[i][j] = 0;
         }            
      }
      
      //7.9 j
      Scanner scannerTeclado = new Scanner(System.in);
      
      for(int i = 0; i < t.length; i++){
         for(int j = 0; j < t[i].length; j++){
            System.out.printf("elemento %d-%d: ", i, j);
            t[i][j] = scannerTeclado.nextInt();
         }            
      }
      
      //7.9 k
      int menor = t[0][0];
      for(int i = 0; i < t.length; i++){
         for(int j = 0; j < t[i].length; j++){
            if(t[i][j] < menor){
               menor = t[i][j];
            }
         }
      }        
      
      System.out.printf("Menor valor: %d\n", menor);
      
      //7.9 l
      for(int i : t[0]){
         System.out.printf("%d\t",i);
      }
      
      //7.9 m
      System.out.println();
      for(int i = 0; i < t.length; i++){
         System.out.printf("%d\t", t[i][2]);
      }
      
      
      //7.9 n
      System.out.println();
      for(int i = 0; i < t.length; i++){
         if(i == 0){
            System.out.printf("%10s%15s%15s%15s\n","","Coluna 1","Coluna 2","Coluna 3");
         }         
         for(int j = 0; j < t[i].length; j++){
            if(j == 0){
               String texto = "Linha " + (i+1);
               System.out.printf("%-10s", texto);
            }               
            System.out.printf("%15d",t[i][j]);
         }
         System.out.println();
      }
      
      
      
   }
   
}