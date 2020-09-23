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
		String sql = "SELECT * FROM TBL_CLIENTE WHERE ID_CLI = ?;";
		
		try {
			
			//Criando o estado da conexão
			PreparedStatement ps = con.prepareStatement(sql);
			
			//Passar o parâmetro para o estado da conexão.
			ps.setInt(1, idCli);
			
			//Criando o result set executando a conexão.
			ResultSet rs = ps.executeQuery();
				
			//Criando uma instância de Cliente
			Cliente cli = null;
		
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
				
			}
			
			ps.close();
			rs.close();
			con.close();
			
			return cli;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public boolean insert(Cliente cli) {
		
		//CRIADO A INSTRUÇÃO SQL
		String sql = "INSERT INTO TBL_CLIENTE VALUES(SEQ_CLIENTE_A.NEXTAL,?,?,?,?,?);";
		
		try {
			
			//Criando o estado da conexão
			PreparedStatement ps = con.prepareStatement(sql);
			
			//Passar o parâmetro para Statement.
			ps.setString(2, cli.getNome());
			ps.setString(3, cli.getSobrenonme());
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			ps.setString(4, sf.format(cli.getDataNasc()));
			ps.setString(5, String.valueOf(cli.getGenero()));
			ps.setLong(6, cli.getTelefone());
			
			//Executando o Statement
			boolean status = ps.execute();
				
			ps.close();
			con.close();
			
			return status;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return false;

	}
}

