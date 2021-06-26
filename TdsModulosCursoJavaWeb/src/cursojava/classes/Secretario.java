package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

//classe filha de pessoa

public class Secretario extends Pessoa implements PermitirAcesso{//implementar� a interface permitirAcesso
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	//devido a autentica��o cria-se atributo de acesso
	private String login; // sem necessidade com o metodo de parametro da interface, porem p o 3 modo � usado
	private String senha;
	
	//construtor padrao
	public Secretario() {
	}
	
	//construtor com parametro, assim n�o se quebra o c�digo
	public Secretario(String login, String senha) {
		this.login = login; //login da classe(this) = ao login recebido com parametro
		this.senha = senha;
	}
	
	//set e gets
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Secretario [registro: " + registro + ", nivel Cargo: " + nivelCargo + ", experiencia: " + experiencia
				+ "\n, nome: " + nome + ", idade: " + idade + ", data Nascimento: " + dataNascimento + ",\n registro Geral:"
				+ registroGeral + ", numero Cpf: " + numeroCpf + ", nome Mae: " + nomeMae + ", nome Pai:" + nomePai + "]";
	}
	
	//implementando m�todo abstrato(obrigat�rio)
	@Override
	public double salario() {
		return 1880 * 0.9;
	}
	/*desnecesario com o metodo de parametro*/
	//metodo de autentifica��o da interface
	@Override
	public boolean autenticar() {
		//m�todo do conntrato de autentica��o
		return login.equals("admin") && senha.equals("admin");
	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		// metodo com parametro. mais forte e consistente
		//return login.equals("admin") && senha.equals("admin");pode chamar o 1� autenticar
		this.login = login; //login da classe(this) = ao login recebido com parametro
		this.senha = senha;
		return autenticar();
		}	

}
