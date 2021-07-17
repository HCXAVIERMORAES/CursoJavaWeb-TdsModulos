package modulo16.arquivo;

public class Pessoa {
	
	private String nome;
	private String email;
	//private int idade;
	private String idade;	
	
	//get e set
	
	/*public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}*/	
	
	public String getNome() {
		return nome;
	}	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}	
	//to string
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", idade=" + idade + "]\n";
	}
	
}
