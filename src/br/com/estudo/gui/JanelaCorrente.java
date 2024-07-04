package br.com.estudo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class JanelaCorrente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumeroBanco;
	private JLabel lbNumeroAgencia;
	private JTextField textField_1;
	private JLabel lblNmeroDaConta;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JTextField textField_3;
	private JLabel lblSaldo;
	private JTextField textField_4;
	private JLabel lblLimite;
	private JTextField txtLimite;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnCriarConta;
	private JButton btnDepositar;
	private JButton btnSacar;
	private JButton btnTransferir;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public JanelaCorrente() {
		setTitle("Janela Conta Corrente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 518, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroBanco = new JLabel("Número Banco:");
		lblNumeroBanco.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblNumeroBanco.setBounds(10, 11, 105, 14);
		contentPane.add(lblNumeroBanco);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.setColumns(10);
		txtNumeroBanco.setBounds(10, 36, 228, 20);
		contentPane.add(txtNumeroBanco);
		
		lbNumeroAgencia = new JLabel("Número Agência:");
		lbNumeroAgencia.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lbNumeroAgencia.setBounds(10, 75, 100, 17);
		contentPane.add(lbNumeroAgencia);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 103, 228, 20);
		contentPane.add(textField_1);
		
		lblNmeroDaConta = new JLabel("Número da Conta:");
		lblNmeroDaConta.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblNmeroDaConta.setBounds(10, 134, 100, 14);
		contentPane.add(lblNmeroDaConta);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 159, 228, 20);
		contentPane.add(textField_2);
		
		lblNewLabel = new JLabel("Titular:");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblNewLabel.setBounds(261, 12, 75, 14);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(261, 36, 228, 20);
		contentPane.add(textField_3);
		
		lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblSaldo.setBounds(261, 77, 89, 14);
		contentPane.add(lblSaldo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(260, 103, 229, 20);
		contentPane.add(textField_4);
		
		lblLimite = new JLabel("Limite:");
		lblLimite.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblLimite.setBounds(261, 135, 89, 14);
		contentPane.add(lblLimite);
		
		txtLimite = new JTextField();
		txtLimite.setColumns(10);
		txtLimite.setBounds(261, 159, 228, 20);
		contentPane.add(txtLimite);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 211, 479, 113);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		btnCriarConta.setBounds(10, 335, 100, 23);
		contentPane.add(btnCriarConta);
		
		btnDepositar = new JButton("Depositar");
		btnDepositar.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		btnDepositar.setBounds(132, 336, 89, 23);
		contentPane.add(btnDepositar);
		
		btnSacar = new JButton("Sacar");
		btnSacar.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		btnSacar.setBounds(261, 336, 89, 23);
		contentPane.add(btnSacar);
		
		btnTransferir = new JButton("Transferir");
		btnTransferir.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		btnTransferir.setBounds(388, 336, 89, 23);
		contentPane.add(btnTransferir);
	}

}
