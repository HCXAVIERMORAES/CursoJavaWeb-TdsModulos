package executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import constante.StatusAluno;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
/*usando um tratamento de exce��o*/
	try {
		
	// valida��o de acesso simples
			String login = JOptionPane.showInputDialog("Qual o seu login? ");
			String senha = JOptionPane.showInputDialog("Qual o seu senha? ");
	
	//reduzindo para uma linha
	if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {
		
	//para dietor
	//if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {
	

		/* Aplicando a lista em aluno */
		List<Aluno> alunos = new ArrayList<Aluno>();
		//List<Aluno> alunos = null;//simulando erro

		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


		for (int qtd = 1; qtd <= 2; qtd++) { // percorrendo lista de alunos

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ? ");
			// String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
			// String dataNascimento = JOptionPane.showInputDialog("Qual a data de
			// nascimento? ");

			Aluno aluno1 = new Aluno();// aluno jo�o.
			
			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));// convertendo String em inteiro -
			 * int. aluno1.setDataNascimento(dataNascimento); // atributo protegido,
			 * acessado apenas por metodos e pela propria // classe // passando diretamente
			 * aluno1.setRegistroGeral(JOptionPane.
			 * showInputDialog("Digite o Registro geral do aluno: "));
			 * aluno1.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF: "));
			 * aluno1.setNomeMae(JOptionPane.
			 * showInputDialog("Digite o nome da m�e do aluno: "));
			 * aluno1.setNomePai(JOptionPane.
			 * showInputDialog("Digite o nome do pai do aluno: "));
			 * aluno1.setDataMatricula(JOptionPane.
			 * showInputDialog("Digite a matr�cula do aluno: "));
			 * aluno1.setNomeEscola(JOptionPane.
			 * showInputDialog("Digite o nome da escola do aluno: "));
			 * aluno1.setSerieMatriculada(JOptionPane.
			 * showInputDialog("Digite a serie do aluno: "));
			 */

			/* Deixando a lista din�mica */
			for (int pos = 1; pos <= 1; pos++) {
				// pedindo dados da diciplina
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}

			/* Removendo disciplinas da lista */
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
			// O confirm retorna '0' para sim e '1' para n�o
			if (escolha == 0) {
				
				int continuarRemove = 0;
				int posicao = 1;

				while (continuarRemove == 0) {

					String disciplinaRemover = JOptionPane
							.showInputDialog("Qual disciplina ser� removida 1, 2, 3 ou 4 ? ");
					
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);// remove
																											// da
					posicao++; 
					continuarRemove = JOptionPane.showConfirmDialog(null,
							"Deseja continuar a remover disciplina? ");
				}
			}

			
			alunos.add(aluno1);

		} // fim for lista aluno

		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		// dividindo os alunos nas listas
		for (Aluno aluno : alunos) {
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				
				maps.get(StatusAluno.APROVADO).add(aluno);// recupera o status e adiciona na lista de aluno
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}

		} // fim foreacht

		// Imprimindo na tela as listas
		System.out.println("============================LISTA DOS APROVADOS===============================");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ". Aluno(a): " + aluno.getNome()
					+ ", m�dia: " + aluno.getMediaNota());
		}
		System.out.println("============================LISTA DOS REPROVADOS===============================");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ". Aluno(a) " + aluno.getNome()
					+ ", m�dia: " + aluno.getMediaNota());
		}
		System.out.println("============================LISTA EM RECUPERA��O===============================");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ". Aluno(a) " + aluno.getNome()
					+ ", m�dia: " + aluno.getMediaNota());
		}

	} else {
		JOptionPane.showMessageDialog(null,"Acesso NEGADO");
	}// fim valida��o
	
	} catch (Exception e) {
		e.printStackTrace();//imprimie a erro no console
		JOptionPane.showMessageDialog(null,"Erro ao processar notas");//sempre informar o usuario quqndo houver erros
	}//fim try catch
	
}//fim main
	
}
