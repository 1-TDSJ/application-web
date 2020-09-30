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

		return null;
	}

	public Cliente select(int idCli) {

		// CRIANDO A INSTRUÇÃO SQL PARA RETORNAR UM CLIENTE
		return null;
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
			ps.setLong(5, cli.getTelefone());

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
