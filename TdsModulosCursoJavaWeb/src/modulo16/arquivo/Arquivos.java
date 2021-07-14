package modulo16.arquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Arquivos {

	public static void main(String[] args) throws IOException {
		//usando a classe pessoa
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(48);
		pessoa1.setNome("Jose");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(18);
		pessoa2.setNome("Ana");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(30);
		pessoa3.setNome("Marcos");
		
		//pode fir do banco de dados ou qualquer outra fonte de dados
		List<Pessoa> pessoas = new  ArrayList<Pessoa>();
		
		//adicionando a lista
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		// trabalhando com arquivos txt, excel
		File arquivo = new File("C:\\Users\\hphoe\\git\\repository5\\.git\\TdsModulosCursoJavaWeb"
				+ "\\src\\modulo16\\arquivo\\arquivo.txt");

		//condição de existencia
			if(!arquivo.exists()) {//se não existir
				arquivo.createNewFile();//cria o arqquivo
			}
		
		//escrever no arquivo
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		/*escrever_no_arquivo.write("Meu texto no arquivo 1ª linha");
		escrever_no_arquivo.write("\n"+"Minha 2ª linha");
		
		//escrevendo mais automatizado
		for (int i = 1; i <= 10; i++) {
			escrever_no_arquivo.write("\n"+"Texto da minha linha "+i);
		}
		escrever_no_arquivo.write("\n"+"\n");*/
		escrever_no_arquivo.write("\n"+"Varrendo a lista e salvando no arquivo com um foreach\n");
		
		//varrendo a lista
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(""+p.getNome()+"; "+p.getEmail()+"; "+p.getIdade()+" \n ");
		}
		
		//varrenddo a lista e salvando
		escrever_no_arquivo.flush();//persisteir
		escrever_no_arquivo.close(); //fechar

	}
}
