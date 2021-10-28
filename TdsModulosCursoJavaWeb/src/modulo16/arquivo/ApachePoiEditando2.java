package modulo16.arquivo;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando2 {

	public static void main(String[] args) throws Exception {
		// Editando o arquivo .xls (editando celula existente)
		File file = new File("C:\\Users\\hphoe\\git\\repository5\\.git\\TdsModulosCursoJavaWeb\\src\\modulo16\\arquivo_excel.xls");
		
		//entrada de dados
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);//prepara entrada do arquivo
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);//pegando a planilha
		
		Iterator<Row> linhaIterator = planilha.iterator();//ler linhas por linha da planilha
		
		while(linhaIterator.hasNext()) {//enquanto tiver linhas
			
			Row linha = linhaIterator.next();//linha recebe proxima linha. dados da pessoa na linha
			
			//pegar o conteudo da celula da planilha
			String valorCelula = linha.getCell(0).getStringCellValue();
			
			//na linha pegar o conteudo da celula e linha e altera
			linha.getCell(0).setCellValue(valorCelula + " * valor gravado na aula");				
			
		}//fim while linha
		
		//fecha a entrada do arquivo
		entrada.close();
		
		//cria a saída
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);//escreve a saida
		saida.flush();
		saida.close();
		hssfWorkbook.close();
		
		System.out.println("planilha atualizada");
		//adicionado o jar commons-collections4-4.4
		
	}

}
