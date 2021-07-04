package cursojava.thread.tela_fila_pilha;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela2TimeThread extends JDialog{

		//Painel de componentes q tem como parametro o controle dos componentes
		private JPanel jPanel = new JPanel(new GridBagLayout());	
		
		//descrição das threads
		private JLabel descrHora = new JLabel("Nome");
		private JTextField mostraTempo = new JTextField();//campo
		
		private JLabel descrHora2 = new JLabel("E-Mail");
		private JTextField mostraTempo2 = new JTextField();//campo
		
		private JButton btnStart = new JButton("Add Lista");
		private JButton btnStop = new JButton("Stop");
		
		//criando um objeto da classe Implementação
		ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
		
		/*construtor ficará a data, horas, etc, usando as thread para tal*/
		public Tela2TimeThread() {//executa o que estiver dentro no momento da abertura ou execução
			// 1ª parte da tela
			setTitle("Tela de Time com Thread");//titulo
			setSize(new Dimension(240, 300));//largura e altura
			setLocationRelativeTo(null);//fixar no centro
			setResizable(false);//restringe o dimensionamento
			
			//criando o gerenciador de posicionamento de botões
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0; //esquerda para direita ou linhas
			gridBagConstraints.gridy = 0; //decima para baixo ou colunas
			gridBagConstraints.gridwidth = 2; //tamanho de componentes usados pelos botões
			gridBagConstraints.insets = new Insets(5, 10, 10,5);//espaços dentro do painel
			gridBagConstraints.anchor = GridBagConstraints.WEST;//ancorando o grid no lado 
			
			//Jlabel1
			descrHora.setPreferredSize(new Dimension(200, 25));//posição do label
			jPanel.add(descrHora, gridBagConstraints); //adicionando o label no painel
			
			//textField1
			mostraTempo.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy ++;//andar 1 casa no eixo y ou uma coluna abaixo no gerenciador de posição
			//mostraTempo.setEditable(false);//não ser editavel
			jPanel.add(mostraTempo, gridBagConstraints);
			
			//Jlabel2
			descrHora2.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy ++;
			jPanel.add(descrHora2, gridBagConstraints); 
			
			//textField2
			mostraTempo2.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy ++;
			//mostraTempo2.setEditable(false);
			jPanel.add(mostraTempo2, gridBagConstraints);
			
			//para os botoes ficarem lado a lado , tamanho do componente
			gridBagConstraints.gridwidth = 1;
			
			//botao start
			btnStart.setPreferredSize(new Dimension(92, 25));
			gridBagConstraints.gridy++;
			jPanel.add(btnStart, gridBagConstraints);
			
			//botao stop
			btnStop.setPreferredSize(new Dimension(92, 25));
			gridBagConstraints.gridx++;
			jPanel.add(btnStop, gridBagConstraints);
			
			//evento de botoes
			btnStart.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					/*adicionando o evento e pegando os campos digitados*/
					ObjetoFilaThread filaThread = new ObjetoFilaThread();//cria objeto
					filaThread.setNome(mostraTempo.getText());//pega o que foi digitado no textfield
					filaThread.setEmail(mostraTempo2.getText());
					
					fila.add(filaThread);//adiciona o objeto na fila
				}
			});//fim btnStart
			
			btnStop.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					fila.stop();
				}
			});//fim btnStop	
			
			fila.start();
			add(jPanel, BorderLayout.WEST); //adiconando o painel no Dialog
			setVisible(true); //exibe a tela para o usuario. sempre o ultimo comando. chamado no main
	
	}//fim Tela2TimeThread

}
