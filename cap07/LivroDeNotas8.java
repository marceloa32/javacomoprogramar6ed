/**
* GradeBook
* Java Como Programar 6a edicao pp. 220-2
*/
public class LivroDeNotas8{               
   
   private String nomeDoCurso;
   private int notas[]; //vetor de notas dos estudantes
   
   public LivroDeNotas8(String nomeDoCurso, int vetorDeNotas[]){
      this.nomeDoCurso = nomeDoCurso;
      this.notas = vetorDeNotas;
   }
   
   public void setNomeDoCurso(String nomeDoCurso){
      this.nomeDoCurso = nomeDoCurso;
   }
   
   public String getNomeDoCurso(){
      return this.nomeDoCurso;
   }
   
   public void mostrarMensagem(){
      System.out.printf("Bem-vindo ao livro de notas do curso \n%s!\n\n" , getNomeDoCurso());
   }
   
   public void processarNotas(){
      
      //mostra o vetor de notas
      geraRelatorioDeNotas();
      
      //chama o getMedia
      System.out.printf("\nMedia da classe e' %.2f\n", getMedia());
      
      //chama getMenorNota e getMaiorNota
      System.out.printf("Menor nota e' %d\nMaior nota e' %d\n\n", getMenorNota(), getMaiorNota());
      
      //chama o grafico das notas
      geraGraficoDeBarras();
      
   }
   
   //localiza a menor nota
   public int getMenorNota(){
      
      int menorNota = notas[0];
      
      for(int nota: notas){
         if(nota < menorNota){
            menorNota = nota;
         }
      }
      
      return menorNota;
      
   }
   
   //localiza a maior nota
   public int getMaiorNota(){
      
      int maiorNota = notas[0];
      
      for(int nota: notas){
         if(nota > maiorNota){
            maiorNota = nota;
         }
      }
      
      return maiorNota;
   }
   
   //obtem a media das notas
   public double getMedia(){
      
      int total = 0;
      
      for(int nota : notas){
         total += nota;
      }
      
      return (double) total / notas.length;
      
   }

   //grafico de notas   
   public void geraGraficoDeBarras(){
      
      System.out.printf("Distribuicao das notas:");
      
      int frequencia[] = new int[11];
   
      //acumo de frequencias (0-9, 10-19..., 90-99)    
      for(int nota : notas){
         ++frequencia[nota / 10];
      }
      
      //impressao do grafico
      for(int contador = 0; contador < frequencia.length; contador++){
         
         //rotulo da barra
         if(contador == 10){
            System.out.printf("%5d: ", 100);
         } else {
            System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
         }
         
         //impressao da barra
         for(int asteriscos = 0; asteriscos < frequencia[contador]; asteriscos++){
            System.out.print("*");
         }
         
         System.out.println();
         
      }
       
      
   }

   //lista o vetor de notas   
   public void geraRelatorioDeNotas(){

      //estudante+1 apenas para listar o numero come‡ando com 1
      for(int estudante = 0; estudante < notas.length; estudante++){
         System.out.printf("Estudante %2d: %3d\n", estudante + 1, notas[estudante]);
      }
   }
}
