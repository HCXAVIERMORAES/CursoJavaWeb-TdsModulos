package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*Thread s�o prcessamento em paralelo de dados e liberar o us�rio para continuar a sua tarefa*/
		//Criando a 1� thread
		/*thread processando em paralelo, envio de e-mail*/
		new Thread() {
			public void run() {//executa o que queremos

				/*c�digo que ficar� em paralelo*/
				//c�digo da rotina � executar em paralelo
				for (int i = 0; i < 10; i++) {			
					System.out.println("Executando alguma rotina, exemplo envio de e-mail "+ i);
					//executar  esse envio com um tempo de parada, ou com um tempo determina
					
					try {
						Thread.sleep(1000);//D� um tempo.medida em milisegundos.10seg = 10000milis
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(i == 9) {
						JOptionPane.showMessageDialog(null, "fim da thread email!!");
					}
					
				}//fim do for. Fim do c�digo em paralelo
				
				
			};
		}.start();/*Start liga a thread que fica processando paralelamente. fim da thread*/
		
		//*************************************DIVIS�O DAS THREADS**************************
		
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
					
				}//fim do 2� for.				
			};
		}.start();
		
		//c�digo do sistema do usu�rio cont�nua o fluxo do trabalho 
		System.out.println("FIM DO C�DIGO DE TESTE");//aparece na tela mais o for continua rodando
		
		//fluxo do sistema, cadastro, emiss�o de nota fiscal, etc
		JOptionPane.showMessageDialog(null,"Sistema continua rodando para o usuario");
		
	}//fim main

	/*A classe Runnable permite, entre outras coisa criar um objeto do tipo thread que permite ser
	 * usado em outras partes do c�digo*/
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// c�digo da thread fica aqui
			
			/*c�digo que ficar� em paralelo*/
			//c�digo da rotina � executar em paralelo
			for (int i = 0; i < 10; i++) {			
				System.out.println("Executando alguma rotina, exemplo envio de e-mail "+ i);
				//executar  esse envio com um tempo de parada, ou com um tempo determina
				
				try {
					Thread.sleep(1000);//D� um tempo.medida em milisegundos.10seg = 10000milis
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(i == 9) {
					JOptionPane.showMessageDialog(null, "fim da thread email!!");
				}
				
			}//fim do for. Fim do c�digo em paralelo
			
		}//fim do run
	}; // fim Runnable
	

}
