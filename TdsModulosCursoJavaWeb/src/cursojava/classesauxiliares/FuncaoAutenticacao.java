package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem  q tem o contrato da interface de PermitirAcesso e chama o autenticar*/
public class FuncaoAutenticacao {
	
	/*deixando mais amarrado muda para
	//função booleana que recebe a interface(PermitirAcesso) e retorna a classe que tem o contrato com a mesma
	public boolean autenticarCursoJava(PermitirAcesso acesso) {
		return acesso.autenticar();
	}*/
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	//deixando mais amarrado ainda.
	private PermitirAcesso permitirAcesso;
	
	//função que recebe como parametro a interface
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	

}
