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
		try {
			this.con = cf.DBConnectionManager();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Cliente> select() {
		
		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cli = null;
		List<Cliente> lista = null;
		
		try {
			
			//Criando a instrução SQL
			sql = "SELECT * FROM TBL_CLIENTE ORDER BY ID_CLI";
			
			//Criando a conexão.
			ps = con.prepareStatement(sql);
			
			//Criando o ResultSet para receber todos os dados.
			rs = ps.executeQuery();
			
			//Instanciando a lista para acomodar os objetos que serão recuperados do banco.
			lista = new ArrayList<Cliente>();
			
			//Estrutura para carregar a lista com os objetos
			while (rs.next()) {
				cli = new Cliente();
				//Populando o cliente
				cli.setIdCli(Integer.parseInt(rs.getNString("id_cli")));
				cli.setNome(rs.getNString("nome_cli"));
				cli.setSobrenonme(rs.getNString("sobrenome_cli"));
				cli.setDataNasc(rs.getNString("data_nasc_cli"));
				cli.setGenero(rs.getNString("genero_cli").charAt(0));
				cli.setTelefone(rs.getNString("tel_cli"));
				
				//Adicionando na lista
				lista.add(cli);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				ps.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return lista;
	}

	public Cliente select(int idCli) {
		
		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cli = null;
		
		try {
			//Criando a instrução SQL.
			sql = "SELECT * FROM TBL_CLIENTE WHERE ID_CLI = ?";
			
			//Criando a conexão
			ps = con.prepareStatement(sql);
			
			//Passar o parâmetro para a instrução SQL.
			ps.setInt(1, idCli);
			
			//Utilizando o ResultSet para receber o resultado da consulta.
			rs = ps.executeQuery();
			
			//Criando a estrutura para receber o resultado.
			while (rs.next()) {
				cli = new Cliente();
				//Populando o cliente
				cli.setIdCli(Integer.parseInt(rs.getNString("id_cli")));
				cli.setNome(rs.getNString("nome_cli"));
				cli.setSobrenonme(rs.getNString("sobrenome_cli"));
				cli.setDataNasc(rs.getNString("data_nasc_cli"));
				cli.setGenero(rs.getNString("genero_cli").charAt(0));
				cli.setTelefone(rs.getNString("tel_cli"));

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				ps.close();
				rs.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return cli;
	}

	public boolean insert(Cliente cli) {

		String sql = null;
		PreparedStatement ps = null;
		boolean status = false;

		try {

			// CRIANDO A INSTRUÇÃO SQL QUE INSERE UM CLIENTE NA BASE
			sql = "INSERT INTO TBL_CLIENTE VALUES(SEQ_CLIENTE_A.NEXTVAL,?,?,TO_DATE(?,'YYYY-MM-DD'),?,?)";

			// Criando o estado da conexão
			ps = con.prepareStatement(sql);

			// Passar o parâmetro para Statement.
			ps.setString(1, cli.getNome());
			ps.setString(2, cli.getSobrenonme());
			ps.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(cli.getDataNasc()));
			ps.setString(4, String.valueOf(cli.getGenero()));
			ps.setString(5, String.valueOf(cli.getTelefone()));

			// Executando o Statement
			if (ps.executeUpdate() >= 1) {
				status = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return status;
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		return status;
	}

	public boolean update(Cliente cli) {

		return true;
	}

	public boolean delete(int idCli) {

		return true;
	}

}
