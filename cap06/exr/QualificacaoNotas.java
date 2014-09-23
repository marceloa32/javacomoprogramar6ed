/*
* Exercicio 6.28
* Java Como Programar 6a edicao p. 201
*/
public class QualificacaoNotas{
   
   public int pontosDeQualificacao(int nota){
      
      int q = nota / 10;  
      int qualificacao = -1;
      
      switch (q) {
         case 10:
         case 9:
            qualificacao = 4;
            break;
         case 8:
            qualificacao = 3;
            break;
         case 7:
            qualificacao = 2;
            break;
         case 6:
            qualificacao = 1;
            break;
         default:
            qualificacao = 0;
            break;            
      }
      
      
      return qualificacao;
      
   }   
   
}
