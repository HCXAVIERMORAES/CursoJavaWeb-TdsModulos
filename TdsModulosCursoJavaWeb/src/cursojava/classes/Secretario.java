package cursojava.classes;
//classe filha de pessoa
public class Secretario extends Pessoa{
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	//set e gets
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
	
	//implementando método abstrato(obrigatório)
	@Override
	public double salario() {
		return 1880 * 0.9;
	}
	
	
	

}
