package executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		/*Array pode ser de todos os tipos de dados e objetos tamb�m. Criando e atribuindo valores ao aray. Sempre
		 * deve ser ter a qtd de posi��es definidas. Elas come�am em 0(zero)*/
		/*double nota[] = new double[5]; dois modos de definir array
		double[] notas = new double[5];*/
		
		/*Atribuindo valores as posi�oes
		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;
		 Deixando o array din�mica*/
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o array deve deve ter? ");
		double[] notas = new double[Integer.parseInt(posicoes)];
		//varrendo o array
		for (int i = 0; i < notas.length; i++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da "+(i+1) +"� posi��o: ");
			notas[i] = Double.valueOf(valor);
			}		
		
		//System.out.println(notas);//mostra o numero da memoria
		//varrendo o array
		for (int i = 0; i < notas.length; i++) {
			System.out.println("nota na "+(i+1)+" �: "+ notas[i]);
		}

	}

}
