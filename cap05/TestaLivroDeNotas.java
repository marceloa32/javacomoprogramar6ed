/*
* GradebookTest
* Java como programar 6a edicao - p. 140
*/
public class TestaLivroDeNotas{
   
   public static void main(String[] args){
      
      LivroDeNotas7 livroDeNotas = new LivroDeNotas7("Introducao a programacao em Java");
      
      livroDeNotas.mostrarMensagem();
      livroDeNotas.registrarNotas();
      livroDeNotas.mostrarRelatorioDeNotas();
   }
}
