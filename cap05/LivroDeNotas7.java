/*
* Gradebook
* Java como programar 6a edicao - p. 136-8
*/
import java.util.Scanner;

public class LivroDeNotas7{
   
   private String nomeDoCurso;
   
   private int totalDasNotas;
   private int contadorDeNotas;
   private int contadorA;
   private int contadorB;
   private int contadorC;
   private int contadorD;
   private int contadorF;
   
   public LivroDeNotas7(String nomeDoCurso){
      this.nomeDoCurso = nomeDoCurso;
   }
   
   public void setNomeDoCurso(String nomeDoCurso){
      this.nomeDoCurso = nomeDoCurso;
   }
   
   public String getNomeDoCurso(){
      return this.nomeDoCurso;
   }
   
   public void mostrarMensagem(){
      System.out.printf("Bem-vindo ao livro de notas do curso\n%s!\n\n", getNomeDoCurso() );      
   }
   
   public void registrarNotas(){
      
      Scanner entradaTeclado = new Scanner(System.in);
      
      int nota;
      
      System.out.printf("%s\n%s\n  %s\n  %s\n", 
                        "Digite as notas em valores de 0 a 100.", 
                        "Para encerrar a digita‡Æo, use o indicador de fim de arquivo:",
                        "no Unix/Linux/Mac OS X tecle <ctrl> d e depois Enter",
                        "no Windows tecle <ctrl> z e depois Enter");
                        
      //loop de digita‡Æo at‚ o final do arquivo;
      while(entradaTeclado.hasNext()){
         
         nota = entradaTeclado.nextInt();
         totalDasNotas += nota;
         ++contadorDeNotas;
         
         incrementarContadorDeNotasLetra(nota);
         
      }
      
   }
    
   //converte a nota em valor para nota letra e aumenta o contador correspondente
   public void incrementarContadorDeNotasLetra(int nota){

      switch(nota/10){
         
         case 9:  //nota 90-99
         case 10: //nota 100
            contadorA++;
            break;
            
         case 8:  //nota 80-89
            contadorB++;
            break;
         
         case 7:  //nota 70-79
            contadorC++;
            break;
         
         case 6:  //nota 60-69
            contadorD++;
            break;
            
         default: //nota menor que 60
            contadorF++;
            break;            
      }
   }
   
   //relat¢rio de notas
   public void mostrarRelatorioDeNotas(){
      
      System.out.println("\nRelatorio de notas:");
      
      //tem pelo menos uma nota?
      if(contadorDeNotas != 0){
         
         double media = (double) totalDasNotas / contadorDeNotas;
         
         System.out.printf("Total de %d notas digitadas e' %d\n", contadorDeNotas, totalDasNotas);
         System.out.printf("Media da classe e' %.2f\n", media);
         System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
                           "Numero de estudantes que receberam cada nota:", 
                           "A: ", contadorA,
                           "B: ", contadorB,
                           "C: ", contadorC,
                           "D: ", contadorD,
                           "F: ", contadorF);
         
      } else {
         System.out.println("Nenhuma nota foi digitada");
      }
      
   }
   
}
