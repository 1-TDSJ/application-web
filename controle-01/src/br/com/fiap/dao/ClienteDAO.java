package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.bean.Cliente;
import br.com.fiap.connection.ConnectionFactory;

public class ClienteDAO {
	
	private Connection con;
	
	public ClienteDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		this.con = cf.getConnection();
	}
	
	public List<Cliente> select(){
		
		//CRIADO A INSTRUÇÃO SQL
		String sql = "SELECT * FROM TBL_CLIENTE_A;";
		
		try {
			
			//Criando o estado da conexão
			PreparedStatement ps = con.prepareStatement(sql);
			
			//Criando o result set executando a conexão.
			ResultSet rs = ps.executeQuery();
				
			//Criando uma instância de Cliente
			Cliente cli = null;
			
			while (rs.next()) {
				//A cada nova iteração um novo oobjeto é criado
				cli = new Cliente(); 
				
				//Agora adicione os dados ao objeto
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
