package executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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
		/*
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
			System.out.println("nota na "+(i+1)+"� �: "+ notas[i]);
		}*/
		
		/*trabalhando  com array d notas em aluno*/
		Double[] notas = {8.8,9.6,7.6,6.8};//criando notas
		Double[] notaslogica = {7.8,5.6,8.6,9.0};
		
		//instanciando aluno (objeto)
		Aluno aluno = new Aluno();
		aluno.setNome("Alex");
		aluno.setNomeEscola("JDEV - treinamento");
		
		//instanciando disciplina (objeto
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");		
		disciplina.setNota(notas);//lan�ando as notas
		
		//relacionado os objetos
		aluno.getDisciplinas().add(disciplina);//Recuperando disciplina do aluno e adicionando a diciplina 
		
		//instanciando disciplina2 (objeto
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de programa��o");		
		disciplina2.setNota(notaslogica);//lan�ando as notas
		
		aluno.getDisciplinas().add(disciplina2);
		
		//varrendo e imprimindo 
		System.out.println("****Aluno: "+aluno.getNome()+"********** Inscrito no curso: "+aluno.getNomeEscola()+" ************************");
		System.out.println("--------------------Disciplina do Aluno----------------------------------");
		
		for (Disciplina disc : aluno.getDisciplinas()) {//array de disciplina do aluno			
			System.out.println("Disciplina: " + disc.getDisciplina());
			
			//descobrindo maior nota
			Double notaMax = disc.getNota()[0];
			Double notaMin =disc.getNota()[0];
				//ou
			double maiorNota = 0.0;
		//varrendo o array de notas
			for (int i = 0; i < disc.getNota().length; i++) {//notas da disciplina
				System.out.println((i+1)+"� nota: "+disc.getNota()[i]);
				
				//maior e menor nota
				if(disc.getNota()[i] > notaMax ) {
					notaMax = disc.getNota()[i];
				} 
				if(notaMin > disc.getNota()[i]) {
					notaMin = disc.getNota()[i];									
				}//fim metodo1 maior nota
				
				//ou
				if(i == 0) {
					maiorNota = disc.getNota()[i];
				} else {
					if(disc.getNota()[i] > maiorNota) {
						maiorNota = disc.getNota()[i];
					}
				}//fim metodo2	maior nota			
			}//fim for de notas
			
			System.out.println("M�dia das notas: "+ disc.getMediaNotas());
			System.out.println("Maior notas �: "+ notaMax );
			System.out.println("Menor notas �: "+ notaMin );
			System.out.println("m�todo2 maior nota: "+ maiorNota);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		}//fim for de disciplinas
	}

	
}
