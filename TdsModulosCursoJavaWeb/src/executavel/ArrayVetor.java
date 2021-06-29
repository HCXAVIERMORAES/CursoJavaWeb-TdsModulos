package executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		/*Array pode ser de todos os tipos de dados e objetos também. Criando e atribuindo valores ao aray. Sempre
		 * deve ser ter a qtd de posições definidas. Elas começam em 0(zero)*/
		/*double nota[] = new double[5]; dois modos de definir array
		double[] notas = new double[5];*/
		
		/*Atribuindo valores as posiçoes
		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;
		 Deixando o array dinâmica*/
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve deve ter? ");
		double[] notas = new double[Integer.parseInt(posicoes)];
		//varrendo o array
		for (int i = 0; i < notas.length; i++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da "+(i+1) +"ª posição: ");
			notas[i] = Double.valueOf(valor);
			}		
		
		//System.out.println(notas);//mostra o numero da memoria
		//varrendo o array
		for (int i = 0; i < notas.length; i++) {
			System.out.println("nota na "+(i+1)+" é: "+ notas[i]);
		}

	}

}
