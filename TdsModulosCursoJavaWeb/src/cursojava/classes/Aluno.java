package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import constante.StatusAluno;

public class Aluno extends Pessoa {
			
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculada;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();	

	// set e get da lista de disciplina
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	// construtores Aluno aluno4 = new Aluno();
	/* é o mesmo que estar referenciando um construtor no java */
	public Aluno() {// construtor padrão do java - cria os dados na memoria
	}

	// construtor que recebe paramentro
	public Aluno(String nomePadrao) {// assim se pode inicar os objetos passando o nome
		super.nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {// assim se pode inicar os objetos passando o nome
		nome = nomePadrao;
		idade = idadePadrao;
	}

	// GET e SET
	/*
	 * Métodos SETTERS e GETTERS do objeto, onde o SET é para adicionar ou receber
	 * dados para os atributos e GET é para resgatar ou obter o valor/dado do
	 * atributo. Todos os objetos em java tem. public porque tem que ser acessado de
	 * qualquer lugar void porque ele não vai retornar só vai receber valor this
	 * (este) se refere a classe, nome ao atributo, e string nome a variavel que
	 * receberá o dado
	 */

	// metodo para receber dado
	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * O GET é similar ao set pois é publico para ser acessado, deve conter o tipo
	 * de dado retornado (String- texto-, int- intreiro-, etc) a palavra GET seguido
	 * da variavel com inicial maiuscula, o que se deseja retornar com a palavra
	 * 'return' seguida da variavel
	 */
	// metodo que retorna (return) o dado
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculada() {
		return serieMatriculada;
	}

	public void setSerieMatriculada(String serieMatriculada) {
		this.serieMatriculada = serieMatriculada;
	}


	// metodo média com lista
	public double getMediaNota() {

		Double somaNotas = 0.0;
		// usando um forEacht
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	// método para dizer se um aluno esta ou não aprovado, logo , um boolean - sim
	// ou não.
	/*
	 * O operador this significa que vamos fazer uma chamada para algum método ou
	 * variável dentro do próprio objeto
	 */
	// mais usado em sistemas pois fica mais facil de manipular devido ao retorno,
	// true/false
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	// mesmo método,porém retornando strings é menos usado
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}

		} else {
			return StatusAluno.REPROVADO;
		}
	}

	// metodo eguals e hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}

	// toString. apos a criação de discilina
	@Override
	public String toString() {// colocado \n para quebra de linha e substituido '=' por ':'
		return "Aluno [nome: " + nome + ", idade: " + idade + ", data Nascimento: " + dataNascimento
				+ ", registro Geral: " + registroGeral + ", numero Cpf: " + numeroCpf + ", \nnome Mae: " + nomeMae
				+ ", nome Pai: " + nomePai + ", data Matricula: " + dataMatricula + ", nome Escola: " + nomeEscola
				+ ", serie Matriculada: " + serieMatriculada + ",\n disciplinas: " + disciplinas + "]";
	}
	
	/*identifica método sobreescrito, pode-se fazer a implementação que for necessario até mudar a regra de negocio*/
	@Override
	public boolean pessoaMaiorIdade() {		
		//return super.pessoaMaiorIdade();
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Já é maior de idade" : "Ainda é de menor";
	}
	
	//implementando método abstrato(obrigatório)
	@Override
	public double salario() {
		return 1500;
	}
	
	
}
