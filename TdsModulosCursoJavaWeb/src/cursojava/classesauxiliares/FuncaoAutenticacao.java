package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem  q tem o contrato da interface de PermitirAcesso e chama o autenticar*/
public class FuncaoAutenticacao {
	
	//função booleana que recebe a interface(PermitirAcesso) e retorna a classe que tem o contrato com a mesma
	public boolean autenticarCursoJava(PermitirAcesso acesso) {
		return acesso.autenticar(null, null);
	}

}
