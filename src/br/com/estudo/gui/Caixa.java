package br.com.estudo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Caixa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caixa frame = new Caixa();
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
	public Caixa() {
		setTitle("Padaria ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 563);
	
		contentPane = new JPanel();
		contentPane.setBackground(new Color(194, 98, 202));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel total_pagar = new JLabel("Total a Pagar");
		total_pagar.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
		total_pagar.setBounds(308, 338, 232, 52);
		contentPane.add(total_pagar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(309, 384, 276, 39);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(194, 98, 202));
		panel.setBounds(7, 2, 289, 541);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel codigo_produto = new JLabel("Código do Produto:");
		codigo_produto.setBounds(2, 143, 110, 23);
		panel.add(codigo_produto);
		codigo_produto.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setBounds(12, 169, 259, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel nome_produto = new JLabel("Nome do Produto:");
		nome_produto.setBounds(3, 201, 110, 14);
		panel.add(nome_produto);
		nome_produto.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		textField_1 = new JTextField();
		textField_1.setBounds(13, 226, 259, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel descricao_produto = new JLabel("Descrição do Produto:");
		descricao_produto.setBounds(2, 258, 159, 14);
		panel.add(descricao_produto);
		descricao_produto.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		JLabel quantidade_produto = new JLabel("Quantidade do Produto:");
		quantidade_produto.setBounds(2, 355, 131, 14);
		panel.add(quantidade_produto);
		quantidade_produto.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 376, 259, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel preco_produto = new JLabel("Preço Unitário do Produto:");
		preco_produto.setBounds(1, 408, 141, 14);
		panel.add(preco_produto);
		preco_produto.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		textField_4 = new JTextField();
		textField_4.setBounds(11, 433, 259, 26);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel subtotal = new JLabel("Subtotal:");
		subtotal.setBounds(0, 464, 73, 14);
		panel.add(subtotal);
		subtotal.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 487, 259, 26);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Caixa.class.getResource("/br/com/estudo/imagens/kuromi.png")));
		lblNewLabel.setBounds(33, 10, 216, 126);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 277, 256, 71);
		panel.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(302, 9, 504, 326);
		contentPane.add(scrollPane);
		
		String[] cabecalho = {"Código do Produto","Nome do Produto","Quantidade","Preço Unitário","Preço Total"};
		String[][]dados= {{"","","","",""}};
		
		table = new JTable(dados,cabecalho);
		scrollPane.setViewportView(table);
	}
}
