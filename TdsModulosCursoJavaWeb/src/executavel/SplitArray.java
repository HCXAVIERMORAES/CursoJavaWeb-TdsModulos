package executavel;

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
	}

}
