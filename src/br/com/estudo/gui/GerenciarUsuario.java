package br.com.estudo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.estudo.classes.Usuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class GerenciarUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_nome;
	private JTextField text_email;
	private JTextField text_telefone;
	private JPasswordField text_senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarUsuario frame = new GerenciarUsuario();
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
	public GerenciarUsuario() {
		Usuario us = new Usuario(); 
		setResizable(false);
		setTitle("Gerenciar Usuário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome de usuário:");
		lblNewLabel.setBounds(10, 143, 86, 14);
		contentPane.add(lblNewLabel);
		
		text_nome = new JTextField();
		text_nome.setBounds(100, 142, 212, 20);
		contentPane.add(text_nome);
		text_nome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(10, 176, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail:");
		lblNewLabel_2.setBounds(11, 209, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		text_email = new JTextField();
		text_email.setColumns(10);
		text_email.setBounds(100, 205, 212, 20);
		contentPane.add(text_email);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setBounds(13, 237, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		text_telefone = new JTextField();
		text_telefone.setColumns(10);
		text_telefone.setBounds(101, 234, 212, 20);
		contentPane.add(text_telefone);
		
		JComboBox combo_nivel = new JComboBox();
		combo_nivel.setModel(new DefaultComboBoxModel(new String[] {"Selecione o nível de acesso", "Admin", "User", "Vendedor", "Gerente", "Assistente"}));
		combo_nivel.setBounds(13, 264, 300, 22);
		contentPane.add(combo_nivel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(13, 301, 300, 82);
		contentPane.add(scrollPane);
		
		JTextArea area_resultado = new JTextArea();
		scrollPane.setViewportView(area_resultado);
		
		JButton button_cadastrar = new JButton("Cadastrar");
		button_cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// passar os dados dos controles de formulário
				// para classe usuario
				us.nomeUsuario=text_nome.getText();
				us.senha=text_senha.getSelectedText().toString();
				us.email=text_email.getText();
				us.telefone=text_telefone.getText();
				us.nivelAcesso=combo_nivel.getSelectedItem().toString();
//				chamando a função para realizar o cadastro
				area_resultado.setText(us.cadastrar());
			}
		});
		button_cadastrar.setBounds(10, 395, 89, 23);
		contentPane.add(button_cadastrar);
		
		JButton button_logar = new JButton("Logar");
		button_logar.setBounds(120, 395, 89, 23);
		contentPane.add(button_logar);
		
		JButton button_limpar = new JButton("Limpar");
		button_limpar.setBounds(221, 395, 89, 23);
		contentPane.add(button_limpar);
		
		text_senha = new JPasswordField();
		text_senha.setEchoChar('♥');
		text_senha.setBounds(99, 170, 212, 20);
		contentPane.add(text_senha);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(GerenciarUsuario.class.getResource("/br/com/estudo/imagens/user-icon.png")));
		lblNewLabel_4.setBounds(100, 8, 134, 124);
		contentPane.add(lblNewLabel_4);
	}
}
