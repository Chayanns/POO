package br.com.estudo.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import br.com.estudo.classes.Contato;
import br.com.estudo.dao.DAOContato;

public class AgendaTelefonica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomeContato;
	private JTextField txtTelefoneResidencial;
	private JTextField txtTelefoneCelular;
	private JTextField txtTelefoneComercial;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaTelefonica frame = new AgendaTelefonica();
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
	public AgendaTelefonica() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(215, 223, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBackground(new Color(0, 64, 128));
		toolBar.setBounds(0, 0, 652, 32);
		contentPane.add(toolBar);
		
		JLabel lblAgendaTelefonica = new JLabel("Agenda Telefônica");
		lblAgendaTelefonica.setForeground(new Color(255, 255, 255));
		lblAgendaTelefonica.setBackground(new Color(255, 255, 255));
		lblAgendaTelefonica.setIcon(new ImageIcon(AgendaTelefonica.class.getResource("/br/com/estudo/imagens/agenda.png")));
		toolBar.add(lblAgendaTelefonica);
		lblAgendaTelefonica.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de Pessoa:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblNewLabel_2.setBounds(465, 40, 109, 27);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cadastro - Agenda Telef\u00F4nica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(3, 33, 648, 574);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Fisica");
		rdbtnNewRadioButton_1_1.setBounds(414, 33, 81, 23);
		panel.add(rdbtnNewRadioButton_1_1);
		
		JLabel lblNomedoContato = new JLabel("Nome do contato:");
		lblNomedoContato.setBounds(9, 64, 109, 22);
		panel.add(lblNomedoContato);
		lblNomedoContato.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		txtNomeContato = new JTextField();
		txtNomeContato.setBounds(9, 92, 406, 27);
		panel.add(txtNomeContato);
		txtNomeContato.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
		lblDataNascimento.setBounds(438, 73, 147, 14);
		panel.add(lblDataNascimento);
		
		JComboBox combo_DataNascimento = new JComboBox();
		combo_DataNascimento.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		combo_DataNascimento.setBounds(420, 95, 54, 22);
		panel.add(combo_DataNascimento);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 120, 72, 22);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		txtEmail = new JTextField();
		txtEmail.setBounds(10, 153, 588, 27);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(7, 193, 109, 22);
		panel.add(lblEndereco);
		lblEndereco.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(7, 226, 591, 27);
		panel.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 268, 109, 22);
		panel.add(lblBairro);
		lblBairro.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		txtBairro = new JTextField();
		txtBairro.setBounds(10, 295, 161, 27);
		panel.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(205, 268, 109, 22);
		panel.add(lblCidade);
		lblCidade.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		txtCidade = new JTextField();
		txtCidade.setBounds(206, 294, 173, 27);
		panel.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblUf = new JLabel("Uf:");
		lblUf.setBounds(397, 273, 28, 14);
		panel.add(lblUf);
		lblUf.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		JComboBox combo_Uf = new JComboBox();
		combo_Uf.setBounds(399, 295, 160, 22);
		panel.add(combo_Uf);
		combo_Uf.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		combo_Uf.setModel(new DefaultComboBoxModel(new String[] {"Selecione seu estado:", "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF"}));
		
		JLabel lblTelefoneCelular = new JLabel("Telefone Celular:");
		lblTelefoneCelular.setBounds(10, 331, 125, 22);
		panel.add(lblTelefoneCelular);
		lblTelefoneCelular.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		txtTelefoneCelular = new JTextField();
		txtTelefoneCelular.setBounds(10, 355, 162, 27);
		panel.add(txtTelefoneCelular);
		txtTelefoneCelular.setColumns(10);
		
		txtTelefoneComercial = new JTextField();
		txtTelefoneComercial.setBounds(202, 355, 162, 27);
		panel.add(txtTelefoneComercial);
		txtTelefoneComercial.setColumns(10);
		
		JLabel lblTelefoneComercial = new JLabel("Telefone Comercial:");
		lblTelefoneComercial.setBounds(202, 331, 125, 22);
		panel.add(lblTelefoneComercial);
		lblTelefoneComercial.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		txtTelefoneResidencial = new JTextField();
		txtTelefoneResidencial.setBounds(398, 355, 152, 27);
		panel.add(txtTelefoneResidencial);
		txtTelefoneResidencial.setColumns(10);
		
		JLabel lblTelefonResidencial = new JLabel("Telefone Residêncial:");
		lblTelefonResidencial.setBounds(400, 331, 125, 22);
		panel.add(lblTelefonResidencial);
		lblTelefonResidencial.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 413, 481, 82);
		panel.add(scrollPane);
		
		JTextArea txtAreaObservacao = new JTextArea();
		scrollPane.setViewportView(txtAreaObservacao);
		
		JLabel lblObservacao = new JLabel("Observação\r\n");
		lblObservacao.setBounds(10, 385, 121, 28);
		panel.add(lblObservacao);
		lblObservacao.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		JComboBox combo_Mes = new JComboBox();
		combo_Mes.setModel(new DefaultComboBoxModel(new String[] {"Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		combo_Mes.setBounds(484, 94, 66, 22);
		panel.add(combo_Mes);
		
		JComboBox combo_Ano = new JComboBox();
		combo_Ano.setModel(new DefaultComboBoxModel(new String[] {"Ano", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024"}));
		combo_Ano.setBounds(556, 94, 62, 22);
		panel.add(combo_Ano);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnLimpar.setBounds(44, 520, 114, 39);
		panel.add(btnLimpar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//realizar a instância da classe Contato, gerando assim
				//um objeto para passar os dados do formulário e 
				//realizar o cadastro
				Contato ct = new Contato();
				ct.setNome(txtNomeContato.getText());
				ct.setEmail(txtEmail.getText());
				ct.setEndereco(txtEndereco.getText());
				ct.setBairro(txtBairro.getText());
				ct.setCidade(txtCidade.getText());
				ct.setUf(combo_Uf.getSelectedItem().toString());
				ct.setTelefoneCelular(txtTelefoneCelular.getText());
				ct.setTelefoneComercial(txtTelefoneComercial.getText());
				ct.setTelefoneResidencial(txtTelefoneResidencial.getText());
				
				ct.setDataNascimento((combo_DataNascimento.getSelectedItem()+"/"+combo_Mes.getSelectedItem()+"/"+combo_Ano.getSelectedItem()));
				ct.setObservacao(txtAreaObservacao.getText());
				
				DAOContato dao = new DAOContato();
				String rs = dao.cadastrar(ct);
				System.out.println(rs);
			} 
		});
		btnCadastrar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnCadastrar.setBounds(230, 519, 114, 39);
		panel.add(btnCadastrar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnFechar.setBounds(401, 519, 114, 39);
		panel.add(btnFechar);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Juridica");
		rdbtnNewRadioButton_1.setBounds(505, 31, 80, 23);
		panel.add(rdbtnNewRadioButton_1);
	}
}
