package application;
import javax.swing.JOptionPane;

public class Program {
	
	public static void main(String[] args) {
	    
		String nome = JOptionPane.showInputDialog("Entre com seu nome: ");
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano de nascimento: "));
		int idade = 2021 - anoNascimento;
		JOptionPane.showMessageDialog(null, nome + " sua idade é: " + idade);
	}
}
