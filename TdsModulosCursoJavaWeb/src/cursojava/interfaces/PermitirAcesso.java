package cursojava.interfaces;

/*classe interface: é como um contrato, quem assina se responsabiliza por implementar esses métodos */
public interface PermitirAcesso {

	//apenas declaração do metodo de acesso apenas para  o secretario
	public boolean autenticar();
	
	//para um metodo com parametro e mais forte fica com a responsabilidade de fazer a autenticação
	public boolean autenticar(String login , String senha);

}
