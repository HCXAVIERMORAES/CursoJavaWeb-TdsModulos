package cursojava.interfaces;

/*classe interface: � como um contrato, quem assina se responsabiliza por implementar esses m�todos */
public interface PermitirAcesso {

	//apenas declara��o do metodo de acesso apenas para  o secretario
	public boolean autenticar();
	
	//para um metodo com parametro e mais forte fica com a responsabilidade de fazer a autentica��o
	public boolean autenticar(String login , String senha);

}
