/*
* Exerc¡cios 5.18
* Java como programar 6a edicao - p. 162
*/
public class JurosCompostosComInteiros{
   
   public static void main(String[] args){
      
      int montante;            //quantia em deposito ao fim de cada ano
      int capital = 100000;   //quantia inicial antes dos juros
      int capitalCentavos = 0;
      int taxa;    
      int inteiro, centavos;
                     
      for (taxa = 5; taxa <= 10; taxa++){
         
         System.out.printf("\n------------------------------\nCom taxa de %d%%\n\n", taxa);
         System.out.printf("%s%20s \n", "Ano ", "Montante em deposito");
         
         for(int ano = 1; ano <= 10; ano++){
            montante = (int)( capital * (Math.pow( 100 + taxa, ano)) / Math.pow( 100, ano) );
            
            inteiro = montante;
            centavos = montante - (montante / 100)*100;
            inteiro -= centavos;
            inteiro /= 100;
            
            System.out.printf("%3d %,17d.%02d\n", ano, inteiro, centavos); //17 para antes do ., 1 para o ponto e 2 para casas decimais
         }  
      }
   }   
   
}
