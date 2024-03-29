package executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome(JOptionPane.showInputDialog("Nome do aluno: "));
		//aluno.setNomeEscola(JOptionPane.showInputDialog("Qual o nome da escola:" ));
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		//diretor.setRegistroGeral(JOptionPane.showInputDialog("registro geral: "));
		//diretor.setNome(JOptionPane.showInputDialog("Nome do diretor: "));
		diretor.setIdade(50);
		diretor.setNome("Mario");
		
		Secretario secretario = new Secretario();
		//secretario.setExperiencia(JOptionPane.showInputDialog("Qual a esperiencia:" ));
		//secretario.setNumeroCpf(JOptionPane.showInputDialog("Qual o CPF:" ));
		diretor.setIdade(18);
		secretario.setNome("Bruno");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());//metodo sobreescrito
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("O salario do aluno �: " +aluno.salario());
		System.out.println("O salario do diretor �: " + diretor.salario());
		System.out.println("O salario do secret�rio �: " + secretario.salario());
		
		//chamando o metodo
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	
	//mais de polimorfismo. metodo statico devido ao main tbm ser
	public static void teste(Pessoa pessoa) {
		System.out.println("Esta pessoa � demais: "+ pessoa.getNome() + "e o seu salario �: "+pessoa.salario());
	}
}
