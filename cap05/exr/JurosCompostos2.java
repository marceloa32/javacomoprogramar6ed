/*
* Exerc¡cios 5.14
* Java como programar 6a edicao - p. 162
*/
public class JurosCompostos2{
   
   public static void main(String[] args){
      
      double montante;           //quantia em deposito ao fim de cada ano
      double capital = 1000.0;   //quantia inicial antes dos juros
      //double taxa = 0.05;        //taxa de juros
      int taxa;
                     
      for (taxa = 5; taxa <= 10; taxa++){
         
         System.out.printf("\n------------------------------\nCom taxa de %d%%\n\n", taxa);
         System.out.printf("%s%20s \n", "Ano ", "Montante em deposito");
         
         for(int ano = 1; ano <= 10; ano++){
            montante = capital * Math.pow( 1.0 + (double)taxa/100, ano);
            System.out.printf("%3d %,20.2f\n", ano, montante); //, = com separador milhar; 20 tamanho geral; .2 casas decimais
         }  
      }
   }   
   
}
