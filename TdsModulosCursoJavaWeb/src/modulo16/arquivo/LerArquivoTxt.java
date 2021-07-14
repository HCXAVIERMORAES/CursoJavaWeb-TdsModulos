package modulo16.arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * como ler arquivo txt. ussando o FileInputStream -entrada de dados - recebe um
		 * file(endereço do arquivo que se quer ler. new FileInputStream(new
		 * File("caminho") -incial o arquivo (new file)-
		 */
		FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\Users\\hphoe\\git\\repository5\\.git\\TdsModulosCursoJavaWeb\\"
						+ "src\\modulo16\\arquivo\\arquivo.txt"));

		// usa-se a classe Scanner para ler as linhas e um while
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		// para ler usa-se um while(enquanto no arquivo houver dados
		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();
			
			// eliminando linhas em branco
			if (linha != null && !linha.isEmpty()) {// diferente de nula e diferente de fazia
				System.out.println(linha);
			}//fim if
			
		} // fim while
	}
}
