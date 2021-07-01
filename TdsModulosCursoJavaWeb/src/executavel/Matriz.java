package executavel;

public class Matriz {
	public static void main(String[] args) {
		//matriz é um array de array
		int notas[][] = new int[2][3];
		//posição 1 
		notas[0][0] = 80;
		notas[0][1] =990;
		notas[0][2] = 70;
		//posição 2
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 50;
		
		//varrendo a matriz
		for (int posLinha = 0;posLinha < notas.length; posLinha++) {
			System.out.println("======================================");
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				System.out.println("os valores são: "+ notas[posLinha][posColuna]);
			}
		}//fim dor matriz	
		/*para varrer uma matriz usa-se um for dentro do outro*/
	}

}
