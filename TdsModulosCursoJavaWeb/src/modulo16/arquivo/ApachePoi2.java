package modulo16.arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {

	public static void main(String[] args) throws Exception {
		//lendo excel xls com apache Poi e montando listas
		
		//criando uma entrada e passando o caminho do arquivo a ser lido
		FileInputStream entrada = new FileInputStream(new File("C:\\Users\\hphoe\\git"
				+ "\\repository5\\.git\\TdsModulosCursoJavaWeb\\src\\modulo16\\arquivo_excel.xls"));
		
		//prepara a entrada do arquivo para ser lido
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		
		//pega a 1ª planilha da arquivo excel
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		//percorre as linhas usa-se o iterator
		Iterator<Row> linhaIterator = planilha.iterator();
		
		//depois de ler ao percorrer a planilha adicionar numa lista de pessoas
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		//enquanto houver linhas e dados
		while(linhaIterator.hasNext()) {
			//linha
			Row linha = linhaIterator.next();//dados da pessoa na linha
			
			//celula da linha
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();//intancia-se uma nova pessoa
			
			//percorrer as celulas
			while(celulas.hasNext()) {
				Cell cell = celulas.next();
				
				//percorrendo as celulas
				switch(cell.getColumnIndex()) {//recebe o index da celula
				case 0 :
					pessoa.setNome(cell.getStringCellValue());//pega conteudo celula
					break;//passar para outra celula
				case 1 :
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2 :
					pessoa.setIdade(cell.getStringCellValue());//idade como string
					//idade como int
					//pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}//fim switch celulas
				
			}//fim while celulas
			
			//adicionando a lista de pessoas
			pessoas.add(pessoa);
			
		}//fim while linha
		
		//fechar o arquivo
		entrada.close();
		hssfWorkbook.close();
		
		//percorre a lista de pessoas criada
		for (Pessoa pessoa : pessoas) {//após isto com esta lista pode-se gravar no BD, mandar email,etc
			System.out.println(pessoa);
		}
	}

}
