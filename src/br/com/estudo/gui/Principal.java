package br.com.estudo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
		setTitle("Contas Bancárias");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		JMenu mnAcao = new JMenu("Ação");
		menuBar.add(mnAcao);
		
		JMenuItem mntmContaPoupaca = new JMenuItem("Conta Poupaça");
		mntmContaPoupaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new JanelaPoupanca().setVisible(true);
			}
		});
		mntmContaPoupaca.setIcon(new ImageIcon(Principal.class.getResource("/br/com/estudo/imagens/contapoupaca.png")));
		mnAcao.add(mntmContaPoupaca);
		
		JMenuItem mntmContaCorrente = new JMenuItem("Conta Corrente");
		mntmContaCorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaCorrente().setVisible(true);
			}
			
		});
		mntmContaCorrente.setIcon(new ImageIcon(Principal.class.getResource("/br/com/estudo/imagens/contacorrente.png")));
		mnAcao.add(mntmContaCorrente);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon(Principal.class.getResource("/br/com/estudo/imagens/close.png")));
		mnAcao.add(mntmSair);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 22, 434, 41);
		contentPane.add(toolBar);
		
		JButton btnContaPoupanca = new JButton("");
		btnContaPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaPoupanca().setVisible(true);
			}
		});
		btnContaPoupanca.setToolTipText("Conta Poupaça");
		btnContaPoupanca.setIcon(new ImageIcon(Principal.class.getResource("/br/com/estudo/imagens/contapoupaca.png")));
		toolBar.add(btnContaPoupanca);
		
		JButton btncontacorrente = new JButton("");
		btncontacorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaCorrente().setVisible(true);
			}
		});
		btncontacorrente.setIcon(new ImageIcon(Principal.class.getResource("/br/com/estudo/imagens/contacorrente.png")));
		btncontacorrente.setToolTipText("ContaCorrente");
		toolBar.add(btncontacorrente);
		
		JButton btnSair = new JButton("");
		btnSair.setIcon(new ImageIcon(Principal.class.getResource("/br/com/estudo/imagens/close.png")));
		btnSair.setToolTipText("Sair");
		toolBar.add(btnSair);
	}
}
