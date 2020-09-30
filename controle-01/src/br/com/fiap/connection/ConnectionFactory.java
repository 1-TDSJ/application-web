package br.com.fiap.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Cliente;

public class ConnectionFactory {
	
	
	public Connection DBConnectionManager() throws ClassNotFoundException, SQLException {
		
		String dbURL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
		String user  = "pf0670";
		String pwd   = "12335423";
		
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection(dbURL,user,pwd);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		try {
		
		Class.forName("oracle.jdbc.OracleDriver");
			
		//String dbURL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
		//String user  = "pf0670";
		//String pwd   = "1239900";
		
		
		//Connection con = DriverManager.getConnection(dbURL,user,pwd);
		
//		String sql = "SELECT * FROM TBL_CLIENTE";
//		
		ConnectionFactory cf = new ConnectionFactory();
		
		//CRIADO A INSTRUÇÃO SQL
		String sql = "INSERT INTO TBL_CLIENTE (ID_CLI,NOME_CLI,SOBRENOME_CLI,DATA_NASC_CLI,GENERO_CLI,TEL_CLI) "
				+ "VALUES(SEQ_CLIENTE_A.NEXTVAL,?,?,?,?,?)";

		PreparedStatement ps = cf.DBConnectionManager().prepareStatement(sql);
		
		
		Cliente cli = new Cliente();
		
		//Criando o estado da conexão
		//PreparedStatement ps = con.prepareStatement(sql);
		
		//Passar o parâmetro para Statement.
		ps.setString(1, cli.getNome());
		ps.setString(2, cli.getSobrenonme());
		ps.setDate(3, (java.sql.Date)cli.getDataNasc());
		ps.setString(4, "m");
		ps.setString(5, cli.getTelefone());
		ps.executeUpdate(); 

//		while (rs.next()) {
//		
//				System.out.println("OUT : " + rs.getNString("nome_cli"));
//			} 
//	
		ps.close();
//		rs.close();
		
		
		}catch (SQLException e) {
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		}
		
		
	}
	
	

