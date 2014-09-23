/**
* Exercicio 6.38
* Java Como Programar 6a edicao p. 202
*/
public class TestaConversorDeNumero{
   
   public static void main(String[] args){
      
      ConversorDeNumero cdn = new ConversorDeNumero();
         
      for(int i = 1; i <= 256; i++){
         
         System.out.printf("%d\t%20s\t%20s\t%20s\n", i, cdn.inteiroParaBinario(i), cdn.inteiroParaOctal(i), cdn.inteiroParaHexa(i));
         
      }        

   }
   
}
