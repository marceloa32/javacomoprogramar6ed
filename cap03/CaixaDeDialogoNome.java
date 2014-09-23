/*
* NameDialog.java
* Java como programar 6a. edicao - p. 75
*/
import javax.swing.JOptionPane;

public class CaixaDeDialogoNome{

	public static void main(String[] args){
	
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		
		String mensagem = String.format("Bem-vindo à programação em Java, %s!", nome);
		
		JOptionPane.showMessageDialog(null, mensagem);
	}

}