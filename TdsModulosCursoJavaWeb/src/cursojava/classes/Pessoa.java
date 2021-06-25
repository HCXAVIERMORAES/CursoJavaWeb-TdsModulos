package cursojava.classes;

//abstract evita que a classe se instanciada
public abstract class Pessoa {//superclasse, classe master ou superclasse - (Atributos comuns a todos os objetos filhos)
	
	protected String nome;
	protected  int idade;
	protected  String dataNascimento; 
	protected  String registroGeral;
	protected  String numeroCpf;
	protected  String nomeMae;
	protected  String nomePai;
	
	/*metodo abstrato é obrigatorio ser implementado pelas classes filhas ou dará erro de compilação*/
	public abstract double salario();
	
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	//retorna true se for >= a 18 e false se menor
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
}
