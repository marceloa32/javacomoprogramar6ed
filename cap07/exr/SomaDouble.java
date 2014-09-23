/*
* Exerc¡cio 7.14
* Java como programar 6a edicao - p. 246
*/ 
public class SomaDouble{
 
   public static void main(String[] args){
      
      double soma = 0.0;
      
      for(String s : args){
         soma += Double.parseDouble(s);
      }
      
      System.out.printf("Total da soma: %.2f", soma);
      
   }  
   
}