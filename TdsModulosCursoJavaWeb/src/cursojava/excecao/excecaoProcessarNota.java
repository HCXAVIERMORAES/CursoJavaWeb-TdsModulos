package cursojava.excecao;
/*Classe de exce��o customizada. ela extende da classe exception*/
public class excecaoProcessarNota extends Exception {

	 public excecaoProcessarNota(String erro) {
		super("Erro!! no processamento do arquivo ao processar as notas" + erro);
	}
}
