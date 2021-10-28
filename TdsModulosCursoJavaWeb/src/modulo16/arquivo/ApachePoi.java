package modulo16.arquivo;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws Exception {
		/*Para trabalhar com arquivos em excel usa-se o apache POI e se baixa o arquivo jar poi-*.jar
		 * para usa-lo
		 * */
		
		//criando arquivo
		File file = new File("C:\\Users\\hphoe\\git\\repository5\\.git\\TdsModulosCursoJavaWeb"
				+ "\\src\\modulo16\\arquivo_excel.xls");// endereço de onde vaificar o arquivo a ser criado
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		//dados para escrer na planilha
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade("38");
		pessoa1.setNome("Jose");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade("18");
		pessoa2.setNome("Ana");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade("30");
		pessoa3.setNome("Marcos");
		
		//pode vir do banco de dados ou qualquer outra fonte de dados
		List<Pessoa> pessoas = new  ArrayList<Pessoa>();		
		//adicionando a lista
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		//usado para escrever a planilha
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
		
		//criar a planilha
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha Pessoas JDev Treinamentos");
		
		//contra-se o numero de linhas for do foreach
		int numeroLinhas = 0;
		
		//percorrendo a planilha
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinhas++); //criando a linha na planilha
			
			//controlando celula
			int celula = 0;// varaiavel de controle
			
			//criando as celulas, uma para cada atributo
			Cell celNome = linha.createCell(celula ++);//celula 1
			celNome.setCellValue(p.getNome());//passa o nome da pessoa
			
			Cell celEmail = linha.createCell(celula++);
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++);
			celIdade.setCellValue(p.getIdade());			
		}//fim do for de montagem da planilhas
		
		//escrevendo a saída
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);//escreve planilha em arquivo
		saida.flush();
		saida.close();
		hssfWorkbook.close();
		System.out.println("Planilha criada");

	}

}
