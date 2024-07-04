package br.com.estudo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.estudo.classes.Contato;
import br.com.estudo.classes.IContato;

public class DAOContato implements IContato<Contato>{

	@Override
	public String cadastrar(Contato dados) {
		//Variável msg criada para nos ajudar no retorno da mensagem,
		//para informar se cadastrou ou não
		
		String msg = "";
		
		//Vamos declarar duas variáveis para realizar o cadastro
		// em banco de dados. A primeira variável é do tipo Connection
		// que permite estabelecer uma conexão com o banco de dados.
		// A segunda variável é do tipo PreparedStatement, ela é
		//criada para executar os comandos sql no banco de dados
		//Prepared(preparar) Statement(sentença)
		Connection con = null;
		PreparedStatement pst = null;
		
		//Carregar o drive com o banco de dados. Este 
		//drive é do mysql
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
			//Abrir o banco de dados passando o caminho do banco, nome
			//usuario, senha e nome do banco
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3784/agendadb","root","senac@123");
			
			//Vamos criar uma consulta para realizar o cadastro dos dados do contato
			//na tabela contato. Para isso, iremos utilizar o comando
			//PreparedStatement, passando os dados
			//do contato como parametros para a consulta.
			//Vamos criar uma consulta associada a uma variável com
			//os elementos de parametros. No java, este elementos
			//são pontos de interrogação.
			String sql = "insert into contato(nome,datanascimento,email,endereco,bairro,cidade,uf,telefone_residencial,telefone_celular,telefone_comercial,observacao)values(?,?,?,?,?,?,?,?,?,?,?)";
			//Carregar a consulta para a memória antes de executá-la.
			//iremos usar o comando prepareStatement e passar a string sql
			pst = con.prepareStatement(sql);
			//vamos fazer a apassagem dos dados do contato por parametro para a 
			//consulta. Assim, todos os pontos de interrogação receberão
			//um dado do contato passando pelo usuário.
			
			pst.setString(1, dados.getNome());
			pst.setString(2, dados.getDataNascimento());
			pst.setString(3, dados.getEmail());
			pst.setString(4, dados.getEndereco());
			pst.setString(5, dados.getBairro());
			pst.setString(6, dados.getCidade());
			pst.setString(7, dados.getUf());
			pst.setString(8, dados.getTelefoneResidencial());
			pst.setString(9, dados.getTelefoneCelular());
			pst.setString(10, dados.getTelefoneComercial());
			pst.setString(11, dados.getObservacao());
			
			//Vamos executar a consulta para cadastrar os dados do contato
			int rs = pst.executeUpdate();
			if (rs > 0) {
				msg = "Contato cadastrado com sucesso";
			}
			else {
				msg = "Não foi possivel cadastrar um contato";
			}
			//Fechar a conexão com o banco de dados
			con.close();
			
			
			
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
	}

	@Override
	public List<Contato> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contato consultar(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
