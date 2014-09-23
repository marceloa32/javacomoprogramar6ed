/*
* Exerc¡cio 7.14
* Java como programar 6a edicao - p. 246
*/ 
public class Calcular{   
   
   public long calcularProduto(int... numeros){
      
      long produto = 1;
      for(int i = 0; i < numeros.length; i++){
         produto *= numeros[i];
      }
      return produto;
   }   
   
}
