package executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		/*O métodov split é usado para quebrar textos, string, seguindo um padrão no texto*/
		String texto = "Alex, curso java, 80, 70, 80, 90";
		String[] valorArray = texto.split(",");
		
		System.out.println("Nome : "+ valorArray[0]);
		System.out.println("Curso: "+ valorArray[1]);
		System.out.println("Nota1: "+ valorArray[2]);
		System.out.println("Nota2: "+ valorArray[3]);
		System.out.println("nota3: "+ valorArray[4]);
		System.out.println("nota4: "+ valorArray[5]);
		
		/*convertendo um Array em uma alista. Deve ser do memo tipo de dado. A leitura apos conversão é com o forech*/
		List<String> list = Arrays.asList(valorArray);
		
		//lendo
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		/*Convertendo uma lista em um Array. 1- instancia-se o Array e noa toArray estancia-se (new) o array como
		 * parâmetro*/
		String[] conversaoArray = list.toArray(new String[6]);
		//lendo
		for (int i = 0; i < conversaoArray.length; i++) {
			System.out.println(conversaoArray[i]);
		}
		
		
	}

}
