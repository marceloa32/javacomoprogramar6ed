/**
* GradeBook
* Java Como Programar 6a edicao pp. 227-30
*/
public class LivroDeNotas9{
   
   private String nomeDoCurso;
   private int notas[][];
   
   public LivroDeNotas9(String nomeDoCurso, int notas[][]){
      this.nomeDoCurso = nomeDoCurso;
      this.notas = notas;
   }
   
   public void setNomeDoCurso(String nomeDoCurso){
      this.nomeDoCurso = nomeDoCurso;
   }
   
   public String getNomeDoCurso(){
      return this.nomeDoCurso;
   }
   
   public void mostrarMensagem(){
      System.out.printf("Bem-vindo ao livro de notas do curso \n%s!\n\n", getNomeDoCurso());
   }
   
   public void processarNotas(){                      
      
      //saida da matriz de notas
      gerarRelatorioDeNotas();
      
      System.out.printf("\n%s %d\n%s %d\n\n", 
                        "A menor nota no livro e'", getMenorNota(), 
                        "A maior nota no livro e'", getMaiorNota() );
                        
      gerarGraficoDeBarras();
      
   }
   
   public int getMenorNota(){
      
      int menorNota = notas[0][0];
      
      for(int notasDoEstudante[] : notas){
         
         for(int nota : notasDoEstudante){
            
            if (nota < menorNota){
               menorNota = nota;
            }
         }
      }      
      
      return menorNota;
   }
   
   public int getMaiorNota(){  
      
      int maiorNota = notas[0][0];
      
      for(int notasDoEstudante[] : notas){
         
         for(int nota : notasDoEstudante){
            
            if(nota > maiorNota){
               maiorNota = nota;
            }
         }
      }
      
      return maiorNota;
      
   }
   
   public double getMedia(int conjuntoDeNotas[]){
      
      int total = 0;
      
      for(int nota : conjuntoDeNotas){
         total += nota;
      }
      
      return (double) total / conjuntoDeNotas.length;
   }
   
   public void gerarGraficoDeBarras(){
      
      System.out.println("Distribuicao geral de notas");
      
      int frequencia[] = new int[11];
      
      for(int notasDoEstudante[] : notas){
         
         for(int nota : notasDoEstudante){            
            ++frequencia[nota / 10];            
         }         
         
      }
      
      
      for(int contador = 0; contador < frequencia.length; contador++){
         
         //rotulo da barra (00-09, 10-19,...,90-99)
         if(contador == 10){
            System.out.printf("%5d: ", 100);
         } else {
            System.out.printf("%2d-%2d: ", contador * 10, contador * 10 + 9);
         }
         
         for(int asteriscos = 0; asteriscos < frequencia[contador]; asteriscos++){
            System.out.printf("*");
         }
         
         System.out.println();
         
      }
      
   }
   
   public void gerarRelatorioDeNotas(){
      
      System.out.println("As notas sao:\n");
      System.out.print("             ");
      
      //linhas e colunas do cabe‡alho
      for(int prova = 0; prova < notas[0].length; prova++){
         System.out.printf("Prova %d ", prova+1 );
      }      
      
      System.out.println("Media"); //Titulo da coluna de media do aluno
      
      //linhas e colunas das notas
      for(int estudante = 0; estudante < notas.length; estudante++){
         
         System.out.printf("Estudante %2d", estudante + 1);
         
         for(int nota : notas[estudante]){
            System.out.printf("%8d", nota);
         }
         
         double media = getMedia( notas[estudante] );
         
         System.out.printf("%9.2f\n", media);
      }
      
   }
      
   
}
