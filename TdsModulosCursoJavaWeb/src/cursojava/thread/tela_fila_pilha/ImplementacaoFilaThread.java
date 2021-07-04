package cursojava.thread.tela_fila_pilha;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.SynchronousQueue;

public class ImplementacaoFilaThread extends Thread{
	/*implementa a fila de thread, logo ela estende a classe Thread para se usar todos os recurso da classe
	 * O ConcurrentLinkedQueue<E>, recebe o tipo de classe a ser manipulado, ObjetoFilaThread.*/
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
			new ConcurrentLinkedQueue<ObjetoFilaThread>(); 
	
	//metodo que recebe o objeto e adiciona na pilha
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	//para o run ficar processando
	@Override
	public void run() {
		System.out.println("fila rodando");//teste
		
		//envolver em um while(true)
		while(true) {
	
		// codigo a ser processado
		Iterator iteracao = pilha_fila.iterator(); //para fazer a iteração com o objeto
		
		//sincronizar o while
		synchronized (iteracao) {//ploqueia o acesso a lista por outros processos
			
			while (iteracao.hasNext()) {//enganto houver dados na lista irá processar
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();//pega o objeto atual
				
				/*Código a ser processado
				 *Como processar 10 mil notas fiscais, gerar um lista enorme de PDF,
				 * gerar um lista enorme de emails
				 * */
				//ver que esta funcionando
				System.out.println("-----------------------------------------");
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());
				
				iteracao.remove();//remove da lista apos processar
				
				try {
					Thread.sleep(1000);//tempo para descarga de memória
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
				
			}//fim while
		}// fim syncronized
		
		//para pegar um novo objeto apos processar processos muito,muito pesados, dár um tempo tbm
		try {
			Thread.sleep(1000);//processou toda a lista da um tempo para limpeza de memória
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}//fim while(true)	
	}//fim do rum
	
}
