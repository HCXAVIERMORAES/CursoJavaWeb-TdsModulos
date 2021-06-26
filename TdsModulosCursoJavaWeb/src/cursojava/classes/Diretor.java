package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

//classe filha de pessoa
public class Diretor extends Pessoa implements PermitirAcesso{

	private  String registroEducacao;
	private  int tempoDirecao;
	private  String titulacao;
	
	//para validar diretor
	private String login; 
	private String senha;	
	
	//construtor
	public Diretor(String login , String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Diretor() {
		//connstrutor padrão para não quebrar os demais códigos
	}
	
	
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
	
	//metodo de autentificação da interface
		@Override
		public boolean autenticar() {
			return login.equals("bebel") && senha.equals("1233");
		}
		
		@Override
		public boolean autenticar(String login, String senha) {
			this.login = login; 
			this.senha = senha;
			return autenticar();
			}	
	
}
