package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*Thread são processamento em paralelo de dados e liberar o usuário para continuar a sua tarefa*/
		//Criando a 1ª thread
		/*thread processando em paralelo, envio de e-mail*/
		Thread threaEmail = new Thread(thread1); 
		threaEmail.start();
		
		/*thread processando em paralelo, envio de nota fiscal*/
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		//código do sistema do usuário contínua o fluxo do trabalho 
		System.out.println("FIM DO CÓDIGO DE TESTE");//aparece na tela mais o for continua rodando
		
		//fluxo do sistema, cadastro, emissão de nota fiscal, etc
		JOptionPane.showMessageDialog(null,"Sistema continua rodando para o usuario");
		
	}//fim main
	

	/* Cria-se uma especie de função do codigo a ser executado
	 * A classe Runnable permite, entre outras coisa criar um objeto do tipo thread que permite ser
	 * usado em outras partes do código*/
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// código da thread fica aqui
			for (int i = 0; i < 10; i++) {			
				System.out.println("Executando alguma rotina, exemplo envio de e-mail "+ i);
				
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
	
	//thread de nota fiscal
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// código da nota fiscal
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
		}
	};
	

}
