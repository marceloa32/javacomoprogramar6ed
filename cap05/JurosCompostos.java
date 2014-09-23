/*
* Sum
* Java como programar 6a edicao - p. 128
*/
public class JurosCompostos{
   
   public static void main(String[] args){
      
      double montante;           //amount
      double capital = 1000.0;   //principal
      double taxa = 0.05;        //rate
                         
      //cabe‡alhos de coluna. Ano com d¡gitos por causa do %4d abaixo, e o montante alinhado em 20 caracteres
      System.out.printf("%s%20s \n", "Ano ", "Montante em dep¢sito");

      for (int ano = 1; ano <= 10; ano++){

         montante = capital * Math.pow( 1.0 + taxa, ano);

         //21 para alinhar o texto em portugˆs =)         
         System.out.printf("%3d%,21.2f\n", ano, montante);
      }
      
   }
}     