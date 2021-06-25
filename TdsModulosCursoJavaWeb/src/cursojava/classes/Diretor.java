package cursojava.classes;
//classe filha de pessoa
public class Diretor extends Pessoa {

	private  String registroEducacao;
	private  int tempoDirecao;
	private  String titulacao;
	
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [registro Educacao: " + registroEducacao + ", tempo Direcao: " + tempoDirecao + ", titulacao: "
				+ titulacao + ",\n nome: " + nome + ", idade: " + idade + ", data Nascimento:" + dataNascimento
				+ ", registro Geral:" + registroGeral + ",\n numero Cpf: " + numeroCpf + ", nome Mae: " + nomeMae
				+ ", nomePai: " + nomePai + "]";
	}

	//implementando método abstrato(obrigatório)
	@Override
	public double salario() {
		return 3700.78;
	}	
	
}
