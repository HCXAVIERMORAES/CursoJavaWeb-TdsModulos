package modulo16.arquivo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {
		//instanciar a classe usuario
		Usuario usuario1 = new Usuario();
		
		usuario1.setCpf("9658859765");
		usuario1.setLogin("jaoao");
		usuario1.setSenha("5655655");
		usuario1.setNome("Aldo frido");
		
		Usuario usuario2 = new Usuario();
		
		usuario2.setCpf("878987779");
		usuario2.setLogin("a5s45a64s");
		usuario2.setSenha("565sd6d5s6d");
		usuario2.setNome("carlos líma");
		
		//usar uma lista para facilitar 
		List<Usuario> usuarios = new ArrayList<Usuario>();
		//adicionando os usuarios na lista
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		/*pegando o Json, porem assim ele não fica organizado
		String jsonUser = new Gson().toJson(usuarios);*/
		
		//pegando o Json e deixando-o organizado
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonUser = gson.toJson(usuarios);
		
		//mostrando o Json
		System.out.println(jsonUser);
		
		//gravando no arquivo
		FileWriter fileWriter = new FileWriter("C:\\Users\\hphoe\\git\\repository5\\.git\\TdsModulosCursoJavaWeb"
				+"\\src\\modulo16\\arquivo\\filjson.json"); //caminho + nome do arquivo
				
		fileWriter.write(jsonUser);//escreve no json
		fileWriter.flush();//persisti
		fileWriter.close();//fecha
		
		
		/*Para implementar o utf-8 para não ter problemas com ascentos, usaria a linha abaixo, porem tem que ter uma
		 * String como nome do arquivo, ou seja deve-se converter ou bolar um jeito de que uma string receba o nome do arquivo*/
		//OutputStreamWriter escrever_no_arquivo = new OutputStreamWriter(new FileOutputStream(arquivo),"UTF-8");
		
		//***----------------LENDO O ARQUIVO JSON------------------------------------****//
		
		//PARA LER O ARQUIVO
		FileReader fileReader = new FileReader("C:\\Users\\hphoe\\git\\repository5\\.git\\TdsModulosCursoJavaWeb\\"+
											"src\\modulo16\\arquivo\\filjson.json"); //lendo o arquivo
		
		//criando uma lista do arquivo json, que separa os json 
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader); //adicionando um cast jsonArray
		
		//ciando lista
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		
		//varrendo a lista com o json com o foricht
		for(JsonElement  jsonElement : jsonArray ) {
			
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
		}
		
		System.out.println("Leitura do arquivo JSON: " + listUsuarios);
		
	}

}
