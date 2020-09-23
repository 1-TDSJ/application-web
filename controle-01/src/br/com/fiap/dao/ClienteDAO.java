package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
		String sql = "SELECT * FROM TBL_CLIENTE;";
		
		try {
			
			//Criando o estado da conexão
			PreparedStatement ps = con.prepareStatement(sql);
			
			//Criando o result set executando a conexão.
			ResultSet rs = ps.executeQuery();
				
			//Criando uma instância de Cliente
			Cliente cli = null;
			
			//Criando a lista que vai ser retornada para o BO.
			List<Cliente> listagem = new ArrayList<Cliente>();
			
			while (rs.next()) {
				//A cada nova iteração um novo objeto é criado
				cli = new Cliente(); 
				
				//Agora adicione os dados ao objeto
				cli.setIdCli(rs.getInt(1));
				cli.setNome(rs.getString(2));
				cli.setSobrenonme(rs.getString(3));
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				cli.setDataNasc(sf.parse(rs.getString(4)));
				cli.setGenero(rs.getString(5).charAt(0));
				cli.setTelefone(Long.parseLong(rs.getString(6)));
				
				//Adicionando o objeto na lista.
				listagem.add(cli);
			}
			
			ps.close();
			rs.close();
			con.close();
			
			return listagem;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Cliente select (int idCli) {
		
		//CRIADO A INSTRUÇÃO SQL
		String sql = "SELECT * FROM TBL_CLIENTE WHERE;";
		
		try {
			
			//Criando o estado da conexão
			PreparedStatement ps = con.prepareStatement(sql);
			
			//Criando o result set executando a conexão.
			ResultSet rs = ps.executeQuery();
				
			//Criando uma instância de Cliente
			Cliente cli = null;
			
			//Criando a lista que vai ser retornada para o BO.
			List<Cliente> listagem = new ArrayList<Cliente>();
			
			while (rs.next()) {
				//A cada nova iteração um novo objeto é criado
				cli = new Cliente(); 
				
				//Agora adicione os dados ao objeto
				cli.setIdCli(rs.getInt(1));
				cli.setNome(rs.getString(2));
				cli.setSobrenonme(rs.getString(3));
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				cli.setDataNasc(sf.parse(rs.getString(4)));
				cli.setGenero(rs.getString(5).charAt(0));
				cli.setTelefone(Long.parseLong(rs.getString(6)));
				
				//Adicionando o objeto na lista.
				listagem.add(cli);
			}
			
			ps.close();
			rs.close();
			con.close();
			
			return listagem;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

