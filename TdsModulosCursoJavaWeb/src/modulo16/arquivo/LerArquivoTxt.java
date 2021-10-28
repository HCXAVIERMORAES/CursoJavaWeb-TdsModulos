package modulo16.arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * como ler arquivo txt. usando o FileInputStream -entrada de dados - recebe um
		 * file(endereço do arquivo que se quer ler. new FileInputStream(new File("caminho") -incial
		 *  o arquivo (new file)- Para arquivo em excel mudar apena a estensão p/ .csv
		 */
	/*	FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\Users\\hphoe\\git\\repository5\\.git\\TdsModulosCursoJavaWeb\\"
						+ "src\\modulo16\\arquivo\\arquivo.txt"));*/
		
		//lendo arquivo em execl ou planilha
		FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\Users\\hphoe\\git\\repository5\\.git\\TdsModulosCursoJavaWeb\\"
						+ "src\\modulo16\\arquivo\\arquivo.txt"));
		

		// usa-se a classe Scanner para ler as linhas e um while
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		//lista de pessoas
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		// para ler usa-se um while(enquanto no arquivo houver dados
		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();
			
			// eliminando linhas em branco
			if (linha != null && !linha.isEmpty()) {// diferente de nula e diferente de fazia
				System.out.println(linha);
				//.split quebra o arquivo no simbolo descrito
				String[] dados = linha.split("\\;"); //quebra no ';'
				
				System.out.println("dado na posição 0: "+dados[0]);
				System.out.println("dado na posição 1: "+dados[1]);
				System.out.println("dado na posição 2: "+dados[2]);
				System.out.println("===============================================");
				//System.out.println("tipo de dado variavel: "+dados[2].getClass().getName());
				//instanciando uma nova pessoa
				Pessoa pessoa = new Pessoa();
				//estrutura igual ao arquivo
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(dados[2]);//idade do tipo String
				//pessoa.setIdade(Integer.parseInt(dados[2]));//conversão para inteiro
				
				//adicionando na lista
				pessoas.add(pessoa);
				}//fim if
			
		} // fim while
		
		System.out.println(pessoas);
		lerArquivo.close();
	}
}
