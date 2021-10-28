package executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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
		/*
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
			System.out.println("nota na "+(i+1)+"ª é: "+ notas[i]);
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
		disciplina.setNota(notas);//lançando as notas
		
		//relacionado os objetos
		aluno.getDisciplinas().add(disciplina);//Recuperando disciplina do aluno e adicionando a diciplina 
		
		//instanciando disciplina2 (objeto
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de programação");		
		disciplina2.setNota(notaslogica);//lançando as notas
		
		aluno.getDisciplinas().add(disciplina2);
		/**********************************************************************************************/
		/* desccartando o código para trabalhar com manipulação de array de objeto
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
				System.out.println((i+1)+"ª nota: "+disc.getNota()[i]);
				
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
					if(disc.getNota()[i] > maiorNota) {//para menor nota inverter o sinal para '<'
						maiorNota = disc.getNota()[i];
					}
				}//fim metodo2	maior nota			
			}//fim for de notas
			
			System.out.println("Média das notas: "+ disc.getMediaNotas());
			System.out.println("Maior notas é: "+ notaMax );
			System.out.println("Menor notas é: "+ notaMin );
			System.out.println("método2 maior nota: "+ maiorNota);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		}//fim for de disciplinas
		*/
		
		//criando uma array que recebera o objeto aluno
		Aluno[] arrayAluno  = new Aluno[1];
		arrayAluno[0] = aluno;
		//varrendo o array
		for (int pos = 0; pos < arrayAluno.length; pos++) {
			System.out.println("O nome do aluno é: "+ arrayAluno[pos].getNome());
			
			/*nome das disciplinas que estão dentro do arrayAluno, usando um foreach*/
			for (Disciplina disc : arrayAluno[pos].getDisciplinas()) {//recuperar as disciplinas do arrayAluno,na
				//posição do aluno, ou seja 1ª posição.
				//int n = 0;
				System.out.println("o nome da disciplina: "+disc.getDisciplina());	
				
				//recuperando notas das disciplinas do aluno
				for (int posnota = 0; posnota < disc.getNota().length; posnota++) {
					System.out.println("A "+(posnota+1) + " nota é: "+ disc.getNota()[posnota]);
				}//for notas dentro da lista de disciplina
				
			}//for de disciplina	
			
		}//fim for arrayAluno,podi-se adicionara mais alunos e disciplinas que o codig	o é o mesmo
		
	}

	
}
