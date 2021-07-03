package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*Thread são prcessamento em paralelo de dados e liberar o usário para continuar a sua tarefa*/
		//Criando a 1ª thread
		/*thread processando em paralelo, envio de e-mail*/
		new Thread() {
			public void run() {//executa o que queremos

				/*código que ficará em paralelo*/
				//código da rotina à executar em paralelo
				for (int i = 0; i < 10; i++) {			
					System.out.println("Executando alguma rotina, exemplo envio de e-mail "+ i);
					//executar  esse envio com um tempo de parada, ou com um tempo determina
					
					try {
						Thread.sleep(1000);//Dá um tempo.medida em milisegundos.10seg = 10000milis
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(i == 9) {
						JOptionPane.showMessageDialog(null, "fim da thread email!!");
					}
					
				}//fim do for. Fim do código em paralelo
				
				
			};
		}.start();/*Start liga a thread que fica processando paralelamente. fim da thread*/
		
		//*************************************DIVISÃO DAS THREADS**************************
		
		/*thread processando em paralelo, envio de nota fiscal*/
		new Thread() {
			public void run() {
				
				for (int i = 0; i < 10; i++) {			
					System.out.println("Executando alguma rotina, exemplo envio de NOTA FISCAL "+ i);
										
					try {
						Thread.sleep(1500);
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(i == 9) {
						JOptionPane.showMessageDialog(null, "fim da Thead nota fiscal!!");
					}
					
				}//fim do 2ª for.				
			};
		}.start();
		
		//código do sistema do usuário contínua o fluxo do trabalho 
		System.out.println("FIM DO CÓDIGO DE TESTE");//aparece na tela mais o for continua rodando
		
		//fluxo do sistema, cadastro, emissão de nota fiscal, etc
		JOptionPane.showMessageDialog(null,"Sistema continua rodando para o usuario");
		
	}//fim main

	/*A classe Runnable permite, entre outras coisa criar um objeto do tipo thread que permite ser
	 * usado em outras partes do código*/
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// código da thread fica aqui
			
			/*código que ficará em paralelo*/
			//código da rotina à executar em paralelo
			for (int i = 0; i < 10; i++) {			
				System.out.println("Executando alguma rotina, exemplo envio de e-mail "+ i);
				//executar  esse envio com um tempo de parada, ou com um tempo determina
				
				try {
					Thread.sleep(1000);//Dá um tempo.medida em milisegundos.10seg = 10000milis
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(i == 9) {
					JOptionPane.showMessageDialog(null, "fim da thread email!!");
				}
				
			}//fim do for. Fim do código em paralelo
			
		}//fim do run
	}; // fim Runnable
	

}
