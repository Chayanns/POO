package br.com.estudo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.estudo.heranca.ContaPoupanca;

import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPoupanca extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumeroBanco;
	private JTextField txtNumeroAgencia;
	private JTextField txtNumeroConta;
	private JTextField txtTitular;
	private JTextField txtSaldo;
	private JTextField txtRendimento;
	private JButton btnAbrirConta;
	private JTextArea txtarea;
	private JButton btnDepositar;
	private JButton btnSacar;
	private JButton btnTransferir;

	/**
	 * Launch the application.
	 */
		
	/**
	 * Create the frame.
	 */
	public JanelaPoupanca() {
		
		ContaPoupanca cp = new ContaPoupanca();
		
		setTitle("Janela Conta Poupança");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 529, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroBanco = new JLabel("Número do Banco:");
		lblNumeroBanco.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNumeroBanco.setBounds(10, 13, 100, 14);
		contentPane.add(lblNumeroBanco);
		
		JLabel lbNumeroAgencia = new JLabel("Número Agência:");
		lbNumeroAgencia.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lbNumeroAgencia.setBounds(10, 67, 100, 17);
		contentPane.add(lbNumeroAgencia);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.setBounds(10, 31, 196, 30);
		contentPane.add(txtNumeroBanco);
		txtNumeroBanco.setColumns(10);
		
		txtNumeroAgencia = new JTextField();
		txtNumeroAgencia.setColumns(10);
		txtNumeroAgencia.setBounds(10, 93, 196, 30);
		contentPane.add(txtNumeroAgencia);
		
		JLabel lblNmeroDaConta = new JLabel("Número da Conta:");
		lblNmeroDaConta.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblNmeroDaConta.setBounds(10, 125, 100, 14);
		contentPane.add(lblNmeroDaConta);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.setColumns(10);
		txtNumeroConta.setBounds(10, 150, 196, 30);
		contentPane.add(txtNumeroConta);
		
		JLabel lblNewLabel = new JLabel("Nome do Titular:");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblNewLabel.setBounds(266, 13, 112, 14);
		contentPane.add(lblNewLabel);
		
		txtTitular = new JTextField();
		txtTitular.setColumns(10);
		txtTitular.setBounds(266, 31, 196, 30);
		contentPane.add(txtTitular);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblSaldo.setBounds(266, 125, 89, 14);
		contentPane.add(lblSaldo);
		
		txtSaldo = new JTextField();
		txtSaldo.setColumns(10);
		txtSaldo.setBounds(266, 150, 196, 30);
		contentPane.add(txtSaldo);
		
		JLabel lblRendimento = new JLabel("Rendimento:");
		lblRendimento.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblRendimento.setBounds(266, 68, 89, 14);
		contentPane.add(lblRendimento);
		
		txtRendimento = new JTextField();
		txtRendimento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNumeroBanco.getText().equals("")||txtNumeroAgencia.getText().equals("")||
						txtNumeroConta.getText().equals("")||
						txtTitular.getText().equals("")||
						txtSaldo.getText().equals("")||
						txtRendimento.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null,"Você deve preencher todos os dados");
				}	
				else {
					btnAbrirConta.setEnabled(true);
				}
					}
		});
		txtRendimento.setColumns(10);
		txtRendimento.setBounds(266, 93, 196, 30);
		contentPane.add(txtRendimento);
		
		btnAbrirConta = new JButton("Abrir Conta");
		btnAbrirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Passar os dados do formulário para o objeto cp
				String rs = cp.abrirConta(txtNumeroBanco.getText(),
											txtNumeroAgencia.getText(),
											txtNumeroConta.getText(),
											txtTitular.getText(),
											Double.parseDouble(txtSaldo.getText()),
											Double.parseDouble(txtRendimento.getText()));
				btnAbrirConta.setEnabled(false);
				btnSacar.setEnabled(true);
				btnDepositar.setEnabled(true);
				btnTransferir.setEnabled(true);
				txtarea.append(rs);
			}
		});
		btnAbrirConta.setEnabled(false);
		btnAbrirConta.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		btnAbrirConta.setBounds(10, 295, 100, 23);
		contentPane.add(btnAbrirConta);
		
		btnDepositar = new JButton("Depositar");
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Digite o valor do depósito");
				String rs = cp.depositar(Double.parseDouble(valor));
				txtarea.append("\n"+rs);
			}
		});
		btnDepositar.setEnabled(false);
		btnDepositar.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		btnDepositar.setBounds(153, 295, 89, 23);
		contentPane.add(btnDepositar);
		
		btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Digite o valor do saque");
				String rs = cp.sacar(Double.parseDouble(valor));
				txtarea.append("\n"+rs);
			}
		});
		btnSacar.setEnabled(false);
		btnSacar.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		btnSacar.setBounds(276, 295, 89, 23);
		contentPane.add(btnSacar);
		
		btnTransferir = new JButton("Transferir");
		btnTransferir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Digite o valor da transferência");
				String destino = JOptionPane.showInputDialog("Digite a conta do destino ");
				String rs = cp.transferir(destino,Double.parseDouble(valor));
				txtarea.append("\n"+rs);
			}
		});
		btnTransferir.setEnabled(false);
		btnTransferir.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		btnTransferir.setBounds(405, 295, 89, 23);
		contentPane.add(btnTransferir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 191, 484, 101);
		contentPane.add(scrollPane);
		
		txtarea = new JTextArea();
		scrollPane.setViewportView(txtarea);
	}
}
