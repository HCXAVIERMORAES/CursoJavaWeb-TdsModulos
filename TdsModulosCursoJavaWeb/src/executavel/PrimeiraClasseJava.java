package executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import constante.StatusAluno;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.excecao.excecaoProcessarNota;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
/*usando um tratamento de exce��o*/
	try {
		
	//usando a classe de exce��o
	lerArquivo();
	
	// valida��o de acesso simples
			String login = JOptionPane.showInputDialog("Qual o seu login? ");
			String senha = JOptionPane.showInputDialog("Qual o seu senha? ");
	
	//reduzindo para uma linha
	if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {
		
	//para diretor
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
	
	} catch (NumberFormatException e) {///m/multiplos catchs de exce��es
		//personalizando a mensagem
		StringBuilder saida = new StringBuilder();
		
		e.printStackTrace();//imprimie a erro no console
		System.out.println("Mensagem "+ e.getMessage());//msg de erro ou causa
		 
		//usando um for para varrer o array de printStackTrace()
		for(int i = 0; i < e.getStackTrace().length; i++) {
			saida.append("\nClasse do erro: "+ e.getStackTrace()[i].getClassName());
			saida.append("\nM�todo do erro: "+ e.getStackTrace()[i].getMethodName());
			saida.append("\nLinha do erro: "+ e.getStackTrace()[i].getLineNumber());
			saida.append("\nClasse: "+ e.getClass().getName());	
		}
		
		JOptionPane.showMessageDialog(null," Erro de conversao de n�mero" + saida.toString());//sempre informar o usuario quqndo houver erros
	} catch (NullPointerException e) {
		JOptionPane.showMessageDialog(null," erro de Null point exception" + e.getClass());
		
	} catch (excecaoProcessarNota e) {//capturar todas as exce��es que n�o prevemos
		e.printStackTrace();
		JOptionPane.showMessageDialog(null," Erro da exce��o custamizada: " + e.getClass().getName());
		
	}catch (Exception e) {//capturar todas as exce��es que n�o prevemos
		e.printStackTrace();
		JOptionPane.showMessageDialog(null," Erro inesperado: " + e.getClass().getName());
		
	} finally {//sempre ser� executado dendo ou n�o erro
		JOptionPane.showInternalMessageDialog(null,"FInal do try catch finally- finally n�o � obrigatorio");
		/*fechar transa��o em um banco de dados*/
	} //fim try catch
	
}//fim main
	
	//fun��o que usa a classe custamizada
	public static void lerArquivo() throws excecaoProcessarNota {// throws excecaoProcessarNota lan�a para quem chama a exce��o
		try {
			File fil = new File("C:\\Users\\hphoe\\OneDrive\\Documentos\\lines.txt");
			Scanner scanner = new Scanner(fil);		
		}catch(FileNotFoundException e){
			throw new excecaoProcessarNota(e.getMessage());
		}	
}

}

